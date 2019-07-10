package customiterable;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getAge()-o2.getAge());
	}

}
