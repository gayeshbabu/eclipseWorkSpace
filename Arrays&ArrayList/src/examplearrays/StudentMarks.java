package examplearrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public StudentMarks(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfmarks() {
		int sum = 0;
		for (int mark : marks) {

			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
	}

	/*
	 * int maximum = 0; // instead of you can use Itegr.MIN_VALUE //76,89,69 for
	 * (int mark : marks) { if (mark > maximum) { maximum = mark; } }
	 * 
	 * return maximum;
	 */

	public BigDecimal getAverageMasrks() {
		int sum = getTotalSumOfmarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}
	/*
	 * int minimum = Integer.MAX_VALUE; // 76,89,69 for (int mark : marks) { if
	 * (mark < minimum) { minimum = mark; } } return minimum;
	 */

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
