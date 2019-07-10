package customiterable;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentIterator implements Iterator<Student>{

	private ArrayList<Student> students;
	private int index;
	
	public StudentIterator(ArrayList<Student> students) {
		super();
		this.students = students;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		if(this.index<this.students.size()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Student next() {
		// TODO Auto-generated method stub
		if(this.hasNext()) {
			Student s = this.students.get(index);
			this.index = this.index + 1;
			return s;
		} else {
			return null;
		}
	}


}
