import java.util.ArrayList;
import java.util.Iterator;

import program1.*;

public class applicationDriver {
	
	public static void main(String[] args) {
		StudentPojo s1= new StudentPojo(67,"Ced","I");
		StudentPojo s2= new StudentPojo(70,"Vlad","I");
		StudentPojo s3= new StudentPojo(64,"Ray","I");
		StudentPojo s4= new StudentPojo(49,"Alan","I");
		
		ArrayList<StudentPojo> studentsList = new ArrayList<StudentPojo>();
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		
		ArrayList<Integer> studentsGPA = new ArrayList<Integer>();
		
		Iterator<StudentPojo> it = studentsList.iterator();
		
		while(it.hasNext()) {
			int sgpa = it.next().getGpa();
			studentsGPA.add(sgpa);
		}
		
		System.out.println(BusinessLogic.countNumberOfElementsWithSpecificProperty(studentsGPA, 60));
		
		
	}

}
