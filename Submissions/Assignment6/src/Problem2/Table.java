package Problem2;

import java.util.List;

public class Table {
	public static void showView(List<Student> students, int numberOfStudent, int fixHeight) {
		String leftAlignFormat = "| %-20s |%n";

		System.out.format("+----------------------+%n");
		for (int i = 0; i < numberOfStudent; i++) {
			Student student = students.get(i);
		    System.out.format(leftAlignFormat, student.getFirstName() + " " + student.getLastName() + " " + student.getGPA());
		    System.out.format("+----------------------+%n");
		}
	}
}
