import java.util.ArrayList;

public class View implements CollectingDatesInterface {

	@Override
	public void showTable() {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student("Ali", "David", 80);
		Student s2 = new Student("Peter", "Jackson", 79);
		Student s3 = new Student("Donald", "Trump", 81);
		Student s4 = new Student("William", "Chen", 76);
		Student s5 = new Student("Ana", "Leu", 79);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		System.out.println("----------------------");
		for (Student s: studentList) {
			String row = "| " + s.getFirstName() + " " + s.getLastName() + " " + s.getGpa();
			System.out.printf("%-20s", row);
			System.out.println(" |");
			System.out.println("----------------------");
		}
	}

}
