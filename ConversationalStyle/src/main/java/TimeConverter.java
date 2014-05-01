package main.java;

import java.util.Calendar;

import main.java.converters.HourConverter;
import main.java.converters.MinutesConverter;

public class TimeConverter {

	private HourConverter hourConverter;
	private MinutesConverter minutesConverter;

	public TimeConverter() {
		hourConverter = new HourConverter();
		minutesConverter = new MinutesConverter();
	}

	public String getTime(int pHour, int pMinutes) {
		if (pMinutes >= 45) {
			pHour = pHour + 1;
		}
		return getMinutesConverter().getConvertedMinutes(pMinutes) + " "
				+ getHourConverter().getConvertedHour(pHour);
	}

	public String getCurrentTime() {
		Calendar calendar = Calendar.getInstance();
		return getTime(calendar.get(Calendar.HOUR_OF_DAY),
				calendar.get(Calendar.MINUTE));
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
