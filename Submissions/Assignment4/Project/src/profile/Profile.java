package profile;

import java.util.Scanner;

public class Profile {

	private int currentYear;
	private int admissionYear;
	private int age;
	private String name;
	private String lastName;
	private String address;
	private String country;
	private char gender;
	private float gpa;
	private float currentSemesterGPA;
	private String studentId;
	
	
	
	public Profile() {
		super();
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter Your Name");
		this.name=s.nextLine();
		System.out.println("Please Enter Your Lastname");
		this.lastName=s.nextLine();
		System.out.println("Please Enter Your Gender (M/F/O");
		this.gender=s.nextLine().charAt(0);
		System.out.println("Please Enter Your Country of origin");
		this.country=s.nextLine();
		System.out.println("Please Enter Your year of admission");
		this.admissionYear=s.nextInt();
		System.out.println("Please Enter Your  age");
		this.age=s.nextInt();
		this.currentYear=2019;
		this.gpa=(float)-1.0;
		this.currentSemesterGPA=(float)-1.0;
		this.studentId="-1";
		
	
		
	}
	public Profile(String name) {
		super();
		this.name=name;
		this.currentYear=2019;
	}



	

	public int getCurrentYear() {
		return currentYear;
	}

	public int getAdmissionYear() {
		return admissionYear;
	}

	public String getName() {
		// TODO Auto-generated method stub
		
		return name;
	}
	

	public String getLastName() {
		return lastName;
	}





	public int getStudentId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public char getGender() {
		// TODO Auto-generated method stub
		return gender;
	}
	
	
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}





	public double getGpa() {
		return gpa;
	}





	public double getCurrentSemesterGPA() {
		return currentSemesterGPA;
	}





	public void setCurrentSemesterGPA(float currentSemesterGPA) {
		this.currentSemesterGPA = currentSemesterGPA;
	}





	public void setGpa(float gpa) {
		this.gpa = gpa;
	}





	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}





	public String getAddress() {
		return address;
	}





	public void setAdmissionYear(int admissionYear) {
		this.admissionYear = admissionYear;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public void setName(String name) {
		this.name = name;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public void setCountry(String country) {
		this.country = country;
	}





	public void setGender(char gender) {
		this.gender = gender;
	}





	public void getAllProfile() {
		
		System.out.println("Name: "+this.name+" "+this.lastName);
		System.out.println("StudentID: "+this.studentId);
		System.out.println("Gender: "+this.gender);
		System.out.println("Address: "+this.address);
		System.out.println("Country of Origint: "+this.country);
		System.out.println("Age: "+this.age);
		System.out.println("Year of Admission: "+this.admissionYear);
		System.out.println("Overall GPA: "+this.gpa);
		}
	
	

}
