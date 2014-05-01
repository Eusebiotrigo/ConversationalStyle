package test.java;

import main.java.converters.MinutesConverter;

import org.junit.Assert;
import org.junit.Test;

public class MinutesConverterTest {

	/**
	 * Tests several minutes values to check if they print the correct messages
	 */
	@Test
	public void testMinutesConverter() {
		System.out.println("testMinutesConverter starts");
		MinutesConverter mConverter = new MinutesConverter();
		String message = mConverter.getConvertedMinutes(0);
		Assert.assertEquals("is o'clock:", "", message);
		System.out.println("'" + message + "'");
		message = mConverter.getConvertedMinutes(15);
		Assert.assertEquals("is a quarter past:", "a quarter past", message);
		System.out.println(message);
		message = mConverter.getConvertedMinutes(16);
		Assert.assertEquals("is a little after a quarter past:",
				"a little after a quarter past", message);
		System.out.println(message);
		System.out.println("testMinutesConverter end");
	}

	/**
	 * Tests all minutes values to check the correct associated message
	 */
	@Test
	public void testAllMinutes() {
		System.out.println("\ntestAllHours starts");
		MinutesConverter mConverter = new MinutesConverter();
		for (int i = 0; i <= 59; i++) {
			String message = mConverter.getConvertedMinutes(i);
			System.out.println(i + " " + message);
		}
		System.out.println("testAllHours end");
	}

}
