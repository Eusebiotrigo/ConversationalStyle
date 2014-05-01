package main.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * CLI test tool that takes a string in HH:mm format and prints the associated value
 * 
 * If something like 33:44 is input, the parsing transforms it to a "real" date and is printed, with the associated message in conversational style.
 * 
 * @author Eusebiotrigo
 * 
 */
public class TestInput {

	public static void main(String[] args) {
		TimeConverter timeConverter = new TimeConverter();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Scanner keyboard = new Scanner(System.in);
		String inputDate = "";
		Calendar calendar = Calendar.getInstance();
		while (!inputDate.equalsIgnoreCase("exit")) {
			System.out.println("enter an time in HH:mm format");
			System.out.println("input 'exit' to close");
			inputDate = keyboard.next();
			if (!inputDate.equalsIgnoreCase("exit")) {
				try {
					Date date = sdf.parse(inputDate);
					calendar.setTime(date);
					System.out.println(sdf.format(date)
							+ " is: "
							+ timeConverter.getTime(
									calendar.get(Calendar.HOUR_OF_DAY),
									calendar.get(Calendar.MINUTE)));

				} catch (ParseException e) {
					System.out.println("The format is incorrect");
				}
			} else {
				System.out.println("GoodBye!");
			}
		}
		keyboard.close();
	}
}
