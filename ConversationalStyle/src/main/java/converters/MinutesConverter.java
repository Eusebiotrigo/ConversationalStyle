package main.java.converters;

import main.java.messages.MinutesMessages;

public class MinutesConverter {
	private static final String MINUTES_CONVERTER_PREFIX = "minutes.converter.";

	private String[] minutesSuffix = { "a.little.after", "a.quarter.past",
			"half.past", "a.quarter.to", "almost" };

	public String getConvertedMinutes(int pMinutes) {
		pMinutes = pMinutes % 60;
		return pMinutes == 0 ? "" : getMinutesMessage(pMinutes);
	}

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
