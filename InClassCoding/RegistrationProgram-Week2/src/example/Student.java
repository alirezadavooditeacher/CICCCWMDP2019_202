package example;

import java.util.ArrayList;

public class Student{
	
	//We define 
	//define your variables or properties
	private String firstName;   //read-only
	private String lastName;    //read-only
	private byte age;           //read-only
	private ArrayList<Course> courses;   //read-write
	private Transcript trascript;
	private String address;
	
	public Transcript getTrascript() {
		return trascript;
	}
	
	void setTrascript(Transcript trascript) {
		this.trascript = trascript;
	}
	
	//Getter and Setter methods
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public byte getAge() {
		return age;
	}
	
//	//Constructor
//	public Student(String firstName, String lastName, byte age, ArrayList<Course> courses) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
//		this.courses = courses;
//	}
	
	
	public Student(String firstName, String lastName, byte age, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.courses = new ArrayList<Course>();
		this.trascript = new Transcript();
		this.address = address;
	}
	//Methods

	public String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	void registerCourse(Course course) {
		this.courses.add(course);
	} 
	
	void dropCourse(Course course) {
		if(this.courses.contains(course)) {
			this.courses.remove(course);
		}
	}
	
	public void print() {
		System.out.println(this.firstName+"   "+this.lastName);
		System.out.printf("Age: %d ", this.age);
		System.out.println(this.address);
	}
	
}
