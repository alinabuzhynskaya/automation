package weekDays;

public class DaysOfWeekRunner {

	public static void main(String[] args) {
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

			String longestString = "";
			for (String day : days) {
				if (day.length() > longestString.length()) {
					longestString = day;
				}
			}
			System.out.println(longestString);
			
     for (int i=days.length-1; i>=0; i--) {
    	 System.out.println(days[i]);     }
		}

}
