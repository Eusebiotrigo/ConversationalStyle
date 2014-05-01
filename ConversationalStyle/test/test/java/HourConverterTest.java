package test.java;

import main.java.converters.HourConverter;

import org.junit.Assert;
import org.junit.Test;

public class HourConverterTest {

	/**
	 * Tests several values to check if they print the correct messages
	 */
	@Test
	public void testHourConverter() {
		System.out.println("testHourConverter starts");
		HourConverter hConverter = new HourConverter();
		String message = hConverter.getConvertedHour(0);
		Assert.assertEquals("is Midnight:", "midnight", message);
		System.out.println(message);
		message = hConverter.getConvertedHour(24);
		Assert.assertEquals("is Midnight:", "midnight", message);
		System.out.println(message);
		message = hConverter.getConvertedHour(23);
		Assert.assertEquals("is eleven:", "eleven", message);
		System.out.println(message);
		System.out.println("testHourConverter end");
	}

	/**
	 * Tests all hours to check the correct associated message
	 */
	@Test
	public void testAllHours() {
		System.out.println("\ntestAllHours starts");
		HourConverter hConverter = new HourConverter();
		for (int i = 0; i < 24; i++) {
			String message = hConverter.getConvertedHour(i);
			System.out.println(i + ": " + message);
		}
		System.out.println("testAllHours end");
	}

}
