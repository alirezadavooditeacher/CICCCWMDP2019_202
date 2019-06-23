package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class RegistrationSystem {

	private ArrayList<Student> allStudents;
	private ArrayList<Course> allCourses;
	private HashMap<Course, Instructor> allInstructorsCourses;
	
	public RegistrationSystem() {
		allStudents = new ArrayList<Student>();
		allCourses = new ArrayList<Course>();
		allInstructorsCourses = new HashMap<Course, Instructor>();
	}
	
	public void register(Student student) {
		allStudents.add(student);
	}

	public void registerCourseForStudent(Student student, Course course) {
		// TODO Auto-generated method stub
		this.allCourses.add(course);
		student.registerCourse(course);
	}

	public void setInstructoForCourse(Course course, Instructor instructor) {
		// TODO Auto-generated method stub
		this.allInstructorsCourses.put(course, instructor);
		
	}

	public void submitGradeForStudentForCourse(Student student, Course course, int grade) {
		// TODO Auto-generated method stub
		Transcript t = student.getTrascript();
		t.addCourseToTranscript(course);
		t.addInstructorForACourse(course, this.allInstructorsCourses.get(course));
		t.submitGradeForACourse(course, grade);
	}

	public void printAllStudents() {
		// TODO Auto-generated method stub
		Iterator<Student> iterator = allStudents.iterator();
		
		while(iterator.hasNext()) {
			Student s = iterator.next();
			s.print();
			System.out.println();
		}
	}

	public void printTranscript(Student student) {
		// TODO Auto-generated method stub
		student.getTrascript().print(student);
	}
	
}
