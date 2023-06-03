package examplearrays;

import java.math.BigDecimal;

public class StudentMarksRunner {

	public static void main(String[] args) {

		int[] marks = { 98, 65, 87, 89 };
		StudentMarks student = new StudentMarks("gayesh", 98, 65, 87);

		int number = student.getNumberOfMarks();
		System.out.println("number marks is - " + number);

		int sum = student.getTotalSumOfmarks();
		System.out.println("total sum of marks is - " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("maximum marks is - " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("minimum mark is " + minimumMark);

		BigDecimal average = student.getAverageMasrks();
		System.out.println("the average is -" + average);

		System.out.println(student);

		student.addNewMark(35);

		student.removeMarkAtIndex(0);

		System.out.println(student);

	}

}
