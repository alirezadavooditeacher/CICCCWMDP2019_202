import java.util.ArrayList;
import java.util.Iterator;

import customiterable.*;

public class ApplicatiionDriver {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ali");
		names.add("Taka");
		names.add("Li Gang");
		names.add("Vlad");
		names.add("Cedric");
		names.add("Memo");
		names.add("Shin");
		names.add("Tatsya");
		names.add("Shota");
		
		Iterator<String> iterator = names.iterator();
		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

		//=======================
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Ali", 90.01, 21);
		Student s2 = new Student("Taka", 80.76, 32);
		Student s3 = new Student("Li Gang", 59, 15);
		Student s4 = new Student("Vlad", 70, 40);
		Student s5 = new Student("Memo", 82, 21);
		Student s6 = new Student("Cedric", 50, 22);
		Student s7 = new Student("Shin",65, 31);
		Student s8 = new Student("Tatsya", 75, 20);
		Student s9 = new Student("Shota", 0, 29);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		
		Classroom classroom = new Classroom(students);
		
		//classroom.sort(new StudentAgeComparator());
		//classroom.sort(new StudentGpaComparator());
		classroom.sort(new StudentNameComparator());
//		
//		for (Student s: classroom) {
//			System.out.println(s.getGpa());
//		}
		
		Iterator<Student> iterator2 = classroom.iterator();
		while(iterator2.hasNext()) {
			//System.out.println(iterator2.next().getAge());
			System.out.println(iterator2.next());
		}
	}
}
