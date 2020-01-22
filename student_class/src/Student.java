import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.IntStream;

public class Student {

	String name;
	int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return marks.length;

	}

	public int totalSumOfMarks() {
		return IntStream.of(marks).sum();
	}

	public int getMaxMark() {
		int maxMark = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maxMark) {
				maxMark = mark;
			}

		}
		return maxMark;
	}

	public int getMinMark() {
		int minMark = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minMark) {
				minMark = mark;
			}

		}
		return minMark;
	}

	public BigDecimal getAverageMarks() {
		int sum = totalSumOfMarks();
		int number = getNumberOfMarks();
		BigDecimal averageMark = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		return averageMark;
	}

}
