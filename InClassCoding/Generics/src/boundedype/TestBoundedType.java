package boundedype;

import java.util.ArrayList;

public class TestBoundedType {

	public static void test1() {
		Student s1 = new Student(10);
		Student s2 = new Student(21);
		Student s3 = new Student(14);
		Student s4 = new Student(34);
		Student s5 = new Student(19);
		Student s6 = new Student(29);
		Student s7 = new Student(26);
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		list1.add(s6);
		list1.add(s7);
		
		int count = Utility.countBiggerThan(list1, new Student(20));
		System.out.println("# of Biggers (Student): "+count);
	}
	
	public static void test2() {
		Computer c1 = new Computer(100);
		Computer c2 = new Computer(80);
		Computer c3 = new Computer(110);
		Computer c4 = new Computer(190);
		Computer c5 = new Computer(70);
		
		ArrayList<Computer> list1 = new ArrayList<Computer>();
		list1.add(c1);
		list1.add(c2);
		list1.add(c3);
		list1.add(c4);
		list1.add(c5);
		
		int count = Utility.countBiggerThan(list1, new Computer(100));
		System.out.println("# of Biggers (Computer): "+count);
	}
}
