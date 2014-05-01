package main.java.converters;

import main.java.messages.MinutesMessages;

/**
 * Class that handles the associated strings to the minutes values
 * 
 * @author Eusebiotrigo
 * 
 */
public class MinutesConverter {
	private static final String MINUTES_CONVERTER_PREFIX = "minutes.converter.";

	// String array that holds the suffixes used in the
	// MinutesMessages.properties.
	// If more messages are needed, this array shoud and
	// MinutesMessages.properties should be changed accordingly, as the returned
	// values in getSuffix(int pMinutes) method and getMinutesMessage(int
	// pMinutes)
	public String[] minutesSuffix = { "a.little.after", "a.quarter.past",
			"half.past", "a.quarter.to", "almost" };

	/**
	 * Returns the associated minutes values / ranges associated in
	 * MinnutesMessages.properties
	 * 
	 * The pMinutes value passed as parameter will be moduled by 60 (0..59).
	 * 
	 * @param pMinutes
	 * @return
	 */
	public String getConvertedMinutes(int pMinutes) {
		pMinutes = pMinutes % 60;
		return pMinutes == 0 ? "" : getMinutesMessage(pMinutes);
	}

	/**
	 * Returns the associated minutes values / ranges associated in
	 * MinnutesMessages.properties adding a message to the ranges where minutes
	 * > 15 and < 30 and minutes > 30 and < 45
	 * 
	 * @param pMinutes
	 * @return
	 */
	private String getMinutesMessage(int pMinutes) {
		StringBuilder sb = new StringBuilder();
		if ((pMinutes > 15 && pMinutes < 30)
				|| (pMinutes > 30 && pMinutes < 45)) {
			sb.append(
					MinutesMessages.getString(MINUTES_CONVERTER_PREFIX
							+ minutesSuffix[0])).append(" ");
		}
		return sb.append(
				MinutesMessages.getString(MINUTES_CONVERTER_PREFIX
						+ getSuffix(pMinutes))).toString();
	}

	/**
	 * Returns the suffix associated to the selected range and specified in
	 * minutesSuffix array and MinutesMessages
	 * 
	 * @param pMinutes
	 * @return
	 */
	private String getSuffix(int pMinutes) {
		String suffix = "";
		if (pMinutes > 0 && pMinutes < 15) {
			return minutesSuffix[0];
		}
		if (pMinutes == 15 || pMinutes > 15 && pMinutes < 30) {
			return minutesSuffix[1];
		}
		if (pMinutes == 30 || pMinutes > 30 && pMinutes < 45) {
			return minutesSuffix[2];
		}
		if (pMinutes == 45) {
			return minutesSuffix[3];
		}
		if (pMinutes > 45 && pMinutes <= 59) {
			return minutesSuffix[4];
		}
		return suffix;
	}
}
