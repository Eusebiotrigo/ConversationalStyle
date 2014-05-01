package test.java;

import main.java.converters.HourConverter;

import org.junit.Assert;
import org.junit.Test;

public class HourConverterTest {

	@Test
	public void testHourConverter() {
		System.out.println("testHourConverter starts");
		HourConverter hConverter = new HourConverter();
		String message = hConverter.getConvertedHour(0);
		Assert.assertEquals("is Midnight:", "midnight", message);
		System.out.println(message);
		message = hConverter.getConvertedHour(50);
		System.out.println(message);
		System.out.println("testHourConverter end");
	}

	@Test
	public void testAllHours() {
		System.out.println("\ntestAllHours starts");
		HourConverter hConverter = new HourConverter();
		for (int i = 0; i < 24; i++) {
			String message = hConverter.getConvertedHour(i);
			System.out.println(message);
		}
		System.out.println("testAllHours end");
	}

}
