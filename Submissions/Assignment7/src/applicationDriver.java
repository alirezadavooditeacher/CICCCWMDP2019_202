import java.util.ArrayList;
import java.util.Iterator;

import program1.*;
import program3.*;
import program4.BusinessLogicP4;
import program4.CheckElement;
import program4.GPACheck;

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
		
		//first solution ArrayList<Integer> studentsGPA = new ArrayList<Integer>();
		
//		Iterator<StudentPojo> it = studentsList.iterator();
//		
//		while(it.hasNext()) {
//			int sgpa = it.next().getGpa();
//			studentsGPA.add(sgpa);
//		}
//		System.out.print("The number of students with a gpa greater than 60 is: ");
//		System.out.println(BusinessLogic.countNumberOfElementsWithSpecificProperty(studentsGPA, 60));
//		System.out.println("The student list before changin some elements is: ");
//		System.out.println(studentsList);
//		BusinessLogicP3.exchangeElements(studentsList, s1, s4);
//		System.out.println("The student list after changin some of its elements is: ");
//		System.out.print(studentsList);
//		
		//BusinessLogicP4<StudentPojo, GPACheck> p4 = 
		//		new BusinessLogicP4<StudentPojo, GPACheck>();
	
		BusinessLogicP4<StudentPojo> p4 = 
				new BusinessLogicP4<StudentPojo>();
	
		p4.addItemToList(s1);
		p4.addItemToList(s2);
		p4.addItemToList(s3);
		p4.addItemToList(s4);
		
		//int count = p4.countNumberOfElementsWithSpecificProperty(new GPACheck());
		
		//CheckElement<StudentPojo> gpaCheck = (StudentPojo sp) -> {return sp.getGpa()>60;};
		
		int count = p4.countNumberOfElementsWithSpecificProperty(sp-> sp.getGpa()>=60);

		System.out.print(count);
		
		System.out.println(" ");
		System.out.println("The BusinessLogic of p1 result in: ");
		
		int bp1count=
				BusinessLogic.countNumberOfElementsWithSpecificProperty(studentsList, new GPACheck());
		System.out.print(bp1count);
	}

}
