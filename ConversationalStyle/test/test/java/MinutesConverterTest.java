package test.java;

import main.java.converters.MinutesConverter;

import org.junit.Test;

public class MinutesConverterTest {

	@Test
	public void testMinutesConverter() {
		System.out.println("testMinutesConverter starts");
		MinutesConverter mConverter = new MinutesConverter();
		String message = mConverter.getConvertedMinutes(0);
		System.out.println(message);
		System.out.println("testMinutesConverter end");
	}
	
	@Test
	public void testAllMinutes(){
		System.out.println("\ntestAllHours starts");
		MinutesConverter mConverter = new MinutesConverter();
		for (int i = 0; i < 59; i++){
			String message = mConverter.getConvertedMinutes(i);
			System.out.println(i + " " + message);
		}
		System.out.println("testAllHours end");
	}

}
