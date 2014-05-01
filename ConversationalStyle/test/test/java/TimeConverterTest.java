package test.java;

import main.java.TimeConverter;

import org.junit.Test;

public class TimeConverterTest {

	@Test
	public void testAllCombinations() {
		System.out.println("testAllCombinations starts");
		TimeConverter timeConverter = new TimeConverter();
		for (int x = 0; x < 24; x++) {
			for (int y = 0; y <= 59; y++) {
				System.out.println(x + ":" + y + ": " + timeConverter.getTime(x, y));
			}
		}
		System.out.println("testAllCombinations starts");
	}

	@Test
	public void testCurrentTimeConverter() {
		System.out.println("testCurrentTimeConverter starts");
		TimeConverter timeConverter = new TimeConverter();
		System.out.println(timeConverter.getCurrentTime());
		System.out.println("testCurrentTimeConverter starts");
	}

}
