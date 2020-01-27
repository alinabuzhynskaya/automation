import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();

	}

	public int totalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaxMark() {

		return Collections.max(marks);
	}

	public int getMinMark() {

		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = totalSumOfMarks();
		int number = getNumberOfMarks();
		BigDecimal averageMark = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		return averageMark;
	}

	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);

	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

}
