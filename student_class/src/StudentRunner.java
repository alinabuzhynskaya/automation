import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 8, 8, 9 };
		Student student = new Student("Alina", marks);
		int number= student.getNumberOfMarks();
		System.out.println("Number of marks " + number);
		int sum = student.totalSumOfMarks();
		System.out.println("Sum of marks " + sum);
		int maxMark = student.getMaxMark();
		System.out.println("Max mark " + maxMark);
		int minMark = student.getMinMark();
		System.out.println("Min mark " + minMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average mark " + average);
	}

}
