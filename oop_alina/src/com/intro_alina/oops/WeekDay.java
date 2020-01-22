package com.intro_alina.oops;


import java.util.Scanner;

public class WeekDay {
	

	public static boolean isWeekday(int dayNumber) {
		switch (dayNumber) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		case 6:
		case 0:
			return false;
		default:
			System.out.println("Invalid value");
			return false;
		}
	}
	
	public static String DetermineNameOfDay (int dayNumber) {
		switch (dayNumber) {
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		case 0: return "Sunday";
		default: return "Invalid value";
		}

	}

}
