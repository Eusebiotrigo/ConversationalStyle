package test.java;

import java.util.Calendar;

import main.java.TimeConverter;

import org.junit.Test;

public class TimeConverterTest {
	/**
	 * Test to print all the valid combinations between hours and minutes
	 */
	@Test
	public void testAllCombinations() {
		System.out.println("testAllCombinations starts");
		TimeConverter timeConverter = new TimeConverter();
		for (int x = 0; x < 24; x++) {
			for (int y = 0; y <= 59; y++) {
				System.out.println(x + ":" + y + ": "
						+ timeConverter.getTime(x, y));
			}
		}
		System.out.println("testAllCombinations starts");
	}

	/**
	 * Test to exemplify an usage with the Calendar methods.
	 */
	@Test
	public void testCurrentTimeConverter() {
		System.out.println("testCurrentTimeConverter starts");
		TimeConverter timeConverter = new TimeConverter();
		Calendar calendar = Calendar.getInstance();
		System.out.println(timeConverter.getTime(
				calendar.get(Calendar.HOUR_OF_DAY),
				calendar.get(Calendar.MINUTE)));
		System.out.println("testCurrentTimeConverter starts");
	}
}
