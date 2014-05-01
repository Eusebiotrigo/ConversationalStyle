package main.java.converters;

import main.java.messages.HourMessages;

public class HourConverter {

	private static final String HOUR_CONVERTER_PREFIX = "hour.converter.";

	public String getConvertedHour(int pHour){
		
		return HourMessages.getString(HOUR_CONVERTER_PREFIX + pHour % 24);
	}
}
