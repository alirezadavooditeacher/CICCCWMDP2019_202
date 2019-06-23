import java.util.ArrayList;

import example.Course;
import example.Instructor;
import example.RegistrationSystem;
import example.Student;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Ali", "David", (byte)21, "Vancouver");
		Student s2 = new Student("Peter", "Cech", (byte)31, "Czech");
		Student s3 = new Student("Shinzo", "abe", (byte)65, "Japan");
		
		RegistrationSystem rs = new RegistrationSystem(); 
		rs.register(s1);
		rs.register(s2);
		rs.register(s3);
		
		Course c1 = new Course("Java", "OOP", "Programming", 3);
		Course c2 = new Course("Algorithm", "Introduction", "Problem Solving", 2);
		Course c3 = new Course("iOS", "Mobile", "Programming", 4);
		
		
		rs.registerCourseForStudent(s1, c1);
		rs.registerCourseForStudent(s1, c2);
		rs.registerCourseForStudent(s1, c3);
		
		rs.registerCourseForStudent(s2, c1);
		rs.registerCourseForStudent(s2, c2);

		rs.registerCourseForStudent(s3, c2);
		
		Instructor i1 = new Instructor("Ali");
		Instructor i2 = new Instructor("Steve");
		Instructor i3 = new Instructor("Ivan");
		
		rs.setInstructoForCourse(c1, i1);
		rs.setInstructoForCourse(c2, i2);
		rs.setInstructoForCourse(c3, i3);
		
		rs.submitGradeForStudentForCourse(s1,c1,67);
		rs.submitGradeForStudentForCourse(s1,c2,78);
		rs.submitGradeForStudentForCourse(s1,c3,80);
		
		rs.submitGradeForStudentForCourse(s2,c1,81);
		rs.submitGradeForStudentForCourse(s2,c2,58);
		
		rs.submitGradeForStudentForCourse(s3,c2,90);
		
		
		rs.printAllStudents();
		System.out.println("\n---------------------------\n");
		rs.printTranscript(s1);
		rs.printTranscript(s2);
		rs.printTranscript(s3);
	}

}
