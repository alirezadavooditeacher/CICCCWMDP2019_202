package example;

import java.util.HashMap;
import java.util.Iterator;

public class Transcript {

	private final static int DEFAULT_GRADE = -1;
	private HashMap<Course, Integer> courseGradesMap;
	private HashMap<Course, Instructor> courseInstructorsMap;
	
	public Transcript() {
		this.courseGradesMap = new HashMap<Course, Integer>();
		this.courseInstructorsMap = new HashMap<Course, Instructor>(); 
	}
	
	void addCourseToTranscript(Course course) {
		if (!this.courseGradesMap.containsKey(course)) {
			this.courseGradesMap.put(course, DEFAULT_GRADE);
		}
	}
	
	void submitGradeForACourse(Course course, int grade) {
		this.courseGradesMap.put(course, grade);
	}
	
	void addInstructorForACourse(Course course, Instructor instructor) {
		this.courseInstructorsMap.put(course, instructor);
	}
	
	public void print(Student student) {
		
		//Prints the student information on the transcript
		student.print();
		
		//Prints the Course/Grade/Instructor information on the transcript
		Iterator<Course> iterator = this.courseGradesMap.keySet().iterator();
		while(iterator.hasNext()) {
			Course course = iterator.next();
			course.print();   //this line prints the course
			int grade = this.courseGradesMap.get(course);
			System.out.print(grade+"  "); //this line prints the grade
			
			Instructor instructor = courseInstructorsMap.get(course);
			instructor.print();
			
			System.out.println();
		}
		
		float gpa = this.calculateGPA();
		System.out.printf("GPA is %.2f", gpa);
		System.out.println("\n---------------------------\n");
		
		//Prints the gpa on the transcript
	}

	float calculateGPA() {
		float gpa = 0;
		int sum = 0;
		int creditSum = 0;
		
		Iterator<Course> iterator = this.courseGradesMap.keySet().iterator();
		while(iterator.hasNext()) {
			Course course = iterator.next();
			int grade = this.courseGradesMap.get(course);
			int credit = course.getCredit();
			sum = sum + grade*credit;
			creditSum = creditSum + credit;
		}
		if(sum==0) {
			gpa = 0;
		} else {
			gpa = sum/ creditSum;
		}
		
		return gpa;
	}
}
