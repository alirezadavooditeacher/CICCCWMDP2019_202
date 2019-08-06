package Problem2;

import java.util.ArrayList;
import java.util.List;

public class View {
	public static void main(String[] args) {
		Student student1 = new Student("Ali", "David", 80);
		Student student2 = new Student("Peter", "Jackson", 79);
		Student student3 = new Student("Donald", "Trump", 81);
		Student student4 = new Student("William", "Chen", 76);
		Student student5 = new Student("Ana", "Leu", 82);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		Table.showView(students, 5, 3);
	}
}
