package customiterable;

import java.util.Comparator;

public class StudentGpaComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getGpa()-o2.getGpa());
	}

}