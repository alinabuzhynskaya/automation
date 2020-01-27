import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student1 = new Student("Alina", 9, 9, 7, 10, 8);
		Student student2 = new Student("Kate", 9, 9, 9, 5);
		int number = student1.getNumberOfMarks();
		System.out.println("Number of marks " + number);
		int sum = student1.totalSumOfMarks();
		System.out.println("Sum of marks " + sum);
		int maxMark = student1.getMaxMark();
		System.out.println("Max mark " + maxMark);
		int minMark = student1.getMinMark();
		System.out.println("Min mark " + minMark);
		BigDecimal average = student1.getAverageMarks();
		System.out.println("Average mark " + average);
		student1.addNewMark(35);
		System.out.println(student2);
		student1.removeMarkAtIndex(1);
		System.out.println(student1);
	}

}
