package customiterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Classroom implements Iterable<Student>{

	private ArrayList<Student> students;

	public Classroom(ArrayList<Student> students) {
		super();
		this.students = students;
	}

	@Override
	public Iterator<Student> iterator() {
		// TODO Auto-generated method stub
		StudentIterator si = new StudentIterator(this.students);
		return si;
	}
	
	public int size() {
		return this.students.size();
	}
	
	public void sort(Comparator<Student> c) {
		Collections.sort(students, c);
	}
}
