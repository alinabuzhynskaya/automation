package com.intro_alina.oops;

import java.util.Scanner;

public class WeekDayRunner {

	public static void main(String[] args) {
		System.out.print("Enter day: ");
		Scanner scanner = new Scanner(System.in);
		int dayNumber = scanner.nextInt();
		System.out.println("is Week Day: " + WeekDay.isWeekday(dayNumber));
		System.out.println("Name of day: " + WeekDay.DetermineNameOfDay(dayNumber));
	}

}
