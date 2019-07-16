import java.util.ArrayList;
import java.util.Iterator;

import program1.*;
import program3.*;

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
		System.out.print("The number of students with a gpa greater than 60 is: ");
		System.out.println(BusinessLogic.countNumberOfElementsWithSpecificProperty(studentsGPA, 60));
		System.out.println("The student list before changin some elements is: ");
		System.out.println(studentsList);
		BusinessLogicP3.exchangeElements(studentsList, s1, s4);
		System.out.println("The student list after changin some of its elements is: ");
		System.out.print(studentsList);

	}

}
