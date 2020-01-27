package weekDays;

public class DaysOfWeek {
	String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

	public String getLongestString() {
		String longestString = "";
		for (String day : days) {
			if (day.length() > longestString.length()) {
				longestString = day;
			}
		}

		return longestString;
	}

	public void reverse() {
		for (int i = days.length - 1; i >= 0; i--) {
			System.out.println(days[i]);
		}

	}
	
	

}
