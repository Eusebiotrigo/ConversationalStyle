package main.java.converters;

import main.java.messages.HourMessages;

/**
 * Class that handles the associated strings to the hour values
 * 
 * @author Eusebiotrigo
 *
 */
public class HourConverter {

	private static final String HOUR_CONVERTER_PREFIX = "hour.converter.";

	/**
	 * Returns the associated string to the hour, placed in HourMessages.properties 
	 * 
	 * The hour passed as parameter will be moduled by 24 (0..23)
	 *  
	 * @param pHour
	 * @return
	 */
	public String getConvertedHour(int pHour) {

		return HourMessages.getString(HOUR_CONVERTER_PREFIX + pHour % 24);
	}
}
