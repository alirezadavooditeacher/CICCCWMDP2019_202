package course;


import java.util.ArrayList;

public class Course {
	private String name;
	private String code;
	private int numberOfUnits;
	private int studentGrade;
	private int numberOfSemester;
	public static ArrayList<Course> allCourses = new ArrayList<Course>();
	
	public Course(String name, String code, int numberOfUnits) {
		super();
		this.name = name;
		this.code = code;
		this.numberOfUnits = numberOfUnits;
		this.studentGrade = 0;
		this.numberOfSemester = -1;
		allCourses.add(this);
	}
	
	public String getCourseName() {
		return this.name;
	}

	public String getCourseCode() {
		return this.code;
	}

	public static ArrayList<Course> getAllCourses() {
		return allCourses;
	}

	public int getCourseUnit() {
		return this.numberOfUnits;
	}

}
