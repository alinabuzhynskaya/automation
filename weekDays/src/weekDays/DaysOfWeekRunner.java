package weekDays;

public class DaysOfWeekRunner {

	public static void main(String[] args) {
		DaysOfWeek weekDays = new DaysOfWeek();
		String day = weekDays.getLongestString();
		System.out.println(day);
		weekDays.reverse();
	}

	

}
