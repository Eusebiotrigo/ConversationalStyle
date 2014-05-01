package main.java;

import main.java.converters.HourConverter;
import main.java.converters.MinutesConverter;

public class TimeConverter {

	private HourConverter hourConverter;
	private MinutesConverter minutesConverter;

	// In spring or atg this would be made through injection
	public TimeConverter() {
		hourConverter = new HourConverter();
		minutesConverter = new MinutesConverter();
	}

	/**
	 * Returns the associated message to the hour and minutes passed as
	 * parameters.
	 * 
	 * @param pHour
	 * @param pMinutes
	 * @return
	 */
	public String getTime(int pHour, int pMinutes) {

		// If minutes is 45 or more, the hour is increased in 1 to get the
		// "quarter to 'next hour'" message properly.
		// If smaller ranges are needed, this threshold must be changed.
		if (pMinutes >= 45) {
			pHour = pHour + 1;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(getMinutesConverter().getConvertedMinutes(pMinutes));
		if (sb.length() != 0) {
			sb.append(" ");
		}
		return sb.append(getHourConverter().getConvertedHour(pHour)).toString();
	}

	public HourConverter getHourConverter() {
		return hourConverter;
	}

	public void setHourConverter(HourConverter pHourConverter) {
		hourConverter = pHourConverter;
	}

	public MinutesConverter getMinutesConverter() {
		return minutesConverter;
	}

	public void setMinutesConverter(MinutesConverter pMinutesConverter) {
		minutesConverter = pMinutesConverter;
	}

}
