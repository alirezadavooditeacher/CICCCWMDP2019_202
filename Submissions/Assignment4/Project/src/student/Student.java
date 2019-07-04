package student;
import generalTranscript.*;
import semesterTranscript.*;
import profile.*;
import course.*;
import account.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;




public class Student {
	public static ArrayList<Student> allStudents;
	int admissionYear;
	int currentYear;
	GeneralTranscript generalTranscript;
	SemesterTranscript semesterTranscript;
	Profile profile;
	Account account;
	
	public Student() {
		super();
		this.generalTranscript=new GeneralTranscript();
		this.profile=new Profile();
		this.account=new Account(this);
		this.semesterTranscript=new SemesterTranscript();
		this.currentYear=this.profile.getCurrentYear();
		this.admissionYear=this.profile.getAdmissionYear();
		allStudents.add(this);
		
		
			
	}
	
	public Student(String name, String userName) {
		super();
		this.generalTranscript=new GeneralTranscript();
		this.profile=new Profile(name);
		this.account=new Account(this, userName);
		this.semesterTranscript=new SemesterTranscript();
		this.currentYear=this.profile.getCurrentYear();
//		this.admissionYear=this.profile.getAdmissionYear();
		allStudents.add(this);
	
	}
	public static ArrayList<Student> getAllStudents() {
		return allStudents;
	}


	public int getAdmissionYear() {
		return admissionYear;
	}


	public int getCurrentYear() {
		return currentYear;
	}


	public GeneralTranscript getGeneralTranscript() {
		return generalTranscript;
	}


	public SemesterTranscript getSemesterTranscript() {
		return semesterTranscript;
	}


	public Profile getProfile() {
		return profile;
	}
	
	


	public void setAdmissionYear(int admissionYear) {
		this.admissionYear = admissionYear;
		this.profile.setAdmissionYear(admissionYear);
		
	}

	
//	public void setCurrentYear(int currentYear) {
//		this.currentYear = currentYear;
//		this.profile.setCurrentYear(currentYear);
//	}

	public Account getAccount() {
		return account;
	}

	public static void showAllStudents() {
		ArrayList<Student> slist=allStudents;
		for(int i=0;i<slist.size();i++) {
			int listCount=i+1;
			System.out.println(listCount+")   "+slist.get(i).getProfile().getName()+": "+slist.get(i).getProfile().getStudentId());
		}
	}
	public void printEnrollmentCertificate() {
		String studentName = this.getProfile().getName()+" "+this.profile.getLastName();
		char genderSyn = this.getProfile().getGender();
		String genderSynString = Character.toString(genderSyn);
		String gender=" ";
		if ( genderSynString == "M") {
			gender = "Mr. ";
		} else if ( genderSynString == "F") {
			gender = "Ms. ";
		} else {
			gender = "Mr./Ms. ";
		}
		int studentId = this.getProfile().getStudentId();
		String studentAddress = this.getProfile().getAddress();
		int semesterNumber = (this.profile.getCurrentYear()-this.profile.getAdmissionYear())*2;
		int takenCourses = this.generalTranscript.getCourseList().size();
		
		
		System.out.println("Dear Sir/Madam,");
		System.out.println("");
		System.out.println("This is to certify that "+ gender + studentName +" with student id " + studentId +" is a student at semester "+ semesterNumber+" at CICCC. ");
		System.out.println("He was admitted to our college in " + this.admissionYear + " and has taken " + takenCourses + " course(s) so far. Currently he resides at " + studentAddress+ ".");
		System.out.println("");
		System.out.println("If you have any question, please don’t hesitate to contact us.");
		System.out.println("Thanks,");
//		System.out.println("[Manager’s name: ??? ],");
		System.out.println("");
	}
	public void printGeneralTranscript() {
		ArrayList<Course> takenCourses = this.generalTranscript.getCourseList();
		HashMap<Course, Integer> courseInTakeSemester = this.generalTranscript.getCourseIntakeSemester();
		HashMap<Course, Float> courseGradesMap = this.generalTranscript.getCourseGradeMap();
		Iterator<Course> it = takenCourses.iterator();
		int i = 1;
		while (it.hasNext()) {
			Course course = it.next();
			String courseName = course.getCourseName();
			String courseCode = course.getCourseCode();
			int numberOfSemester = courseInTakeSemester.get(course);
			float courseGrade=courseGradesMap.get(course);
			String annotation=" ";
			if (numberOfSemester != 0 && numberOfSemester == 2019) {
				annotation = "[Current semester]";
			} else {
				annotation = "";
			}
			System.out.println(i + ") " + courseCode + ": " + courseName + ": " + courseGrade+ annotation);
			i++;
		}
		System.out.println("YOUR GPA IS: "+this.profile.getGpa());
		System.out.println("Here is your current semester transcript:");
		i=1;
		double currentGPA=this.profile.getCurrentSemesterGPA();
		while (it.hasNext()) {
			
				Course course = it.next();
				String courseName = course.getCourseName();
				String courseCode = course.getCourseCode();
				int numberOfSemester = courseInTakeSemester.get(course);
				float courseGrade=courseGradesMap.get(course);
				String annotation=" ";
				
				if (numberOfSemester != 0 && numberOfSemester == 2019) {
					annotation = "[Current semester]";
					System.out.println(i + ") " + courseCode + ": " + courseName + ": " + courseGrade+ annotation);
				i++;
				} 
				
			}
		System.out.println("YOUR Current Semester GPA is: "+currentGPA);
		}
		
	
	public void printMyCourses() {
		ArrayList<Course> takenCourses = this.generalTranscript.getCourseList();
		HashMap<Course, Integer> courseInTakeSemester = this.generalTranscript.getCourseIntakeSemester();
		Iterator<Course> it = takenCourses.iterator();
		int i = 1;
		while (it.hasNext()) {
			Course course = it.next();
			String courseName = course.getCourseName();
			String courseCode = course.getCourseCode();
			int numberOfSemester = courseInTakeSemester.get(course);
			String annotation=" ";
			if (numberOfSemester != 0 && numberOfSemester == 2019) {
				annotation = "[Current semester]";
			} else {
				annotation = "";
			}
			System.out.println(i + ") " + courseCode + ": " + courseName + " " + annotation);
			i++;
		}
	}
	public void printGPA() {
		String studentName = this.getProfile().getName()+" "+this.profile.getLastName();
		char genderSyn = this.getProfile().getGender();
		String genderSynString = Character.toString(genderSyn);
		String gender=" ";
		if ( genderSynString == "M") {
			gender = "Mr. ";
		} else if ( genderSynString == "F") {
			gender = "Ms. ";
		} else {
			gender = "Mr./Ms. ";
		}
		System.out.println("Hi "+gender+studentName+",");
		System.out.println("Your overall GPA is "+this.profile.getGpa());
		System.out.println("Your current semester's GPA is "+this.profile.getCurrentSemesterGPA());
	}
	
	public void printMyRanking() {
		String studentName = this.getProfile().getName()+" "+this.profile.getLastName();
		char genderSyn = this.getProfile().getGender();
		String genderSynString = Character.toString(genderSyn);
		String gender=" ";
		if ( genderSynString == "M") {
			gender = "Mr. ";
		} else if ( genderSynString == "F") {
			gender = "Ms. ";
		} else {
			gender = "Mr./Ms. ";
	}
		System.out.println("Hi "+gender+studentName+",");
		System.out.println("Your overall GPA is"+this.profile.getGpa()+"and therefore your rank is "+this.generalTranscript.getMyGPARanking(this)+".");
	}
	
	public void printAvailableCourses() {
		ArrayList<Course> allCourses = Course.getAllCourses();
//		ArrayList<Course> takenCourses = this.generalTranscript.getCourseList();
		HashMap<Course, Integer> courseInTakeSemester = this.generalTranscript.getCourseIntakeSemester();
		Iterator<Course> it = allCourses.iterator();
//		Iterator<Course> it2 = takenCourses.iterator();
		
		int i = 1;
		while (it.hasNext()) {
			Course course = it.next();
			String courseName = course.getCourseName();
			String courseCode = course.getCourseCode();
			int courseUnit = course.getCourseUnit();
			int numberOfSemester = courseInTakeSemester.get(course);
			String annotation=" ";
			if (numberOfSemester == 0) {
				annotation = "[Not taken]";
			} else {
				annotation = "[Taken at semester " + numberOfSemester + "]";
			}
			System.out.println(i + ") " + courseCode + ": " + courseName + " " + courseUnit + " units " + annotation);
			i++;
			
		}
	}
	
	public void printAllStrudens() {
		int numberOfStudent = allStudents.size();
		System.out.println("There are " + numberOfStudent + " students in CICCC as following:");
		
		Iterator<Student> it = allStudents.iterator();
		int i = 1;
		while(it.hasNext()) {
			Student student = it.next();
			String studentName = student.getProfile().getName()+" "+student.profile.getLastName();
			int studentId = student.getProfile().getStudentId(); 
			System.out.println(i + ") " + studentName + ": " + studentId);
			i++;	
		}
				
	}
	
	public void printMyProfile() {
		this.profile.getAllProfile();
		
		ArrayList<Course> takenCourses = this.generalTranscript.getCourseList();
		HashMap<Course, Integer> courseInTakeSemester = this.generalTranscript.getCourseIntakeSemester();
		Iterator<Course> it = takenCourses.iterator();
		System.out.print("Courses Taken So far: ");
		while (it.hasNext()) {
			Course course = it.next();
			String courseName = course.getCourseName();
			String courseCode = course.getCourseCode();
			int numberOfSemester = courseInTakeSemester.get(course);
			String annotation=" ";
			String comma = " ";
			if (numberOfSemester != 0 && numberOfSemester == 2019) {
				annotation = "[Current semester]";
			} else {
				annotation = "";
			}
			
			if(it.hasNext()) {
				comma = ",";
			} else {
				comma = "";
			}
			
			System.out.print(courseCode + ": " + courseName + annotation + comma);
		}
		
	}
	
	public void registerCourseInfo(Course course, float grade, int courseIntakeSemester) {
			this.generalTranscript.inputCourseInfo(course, grade, courseIntakeSemester);
			if(courseIntakeSemester==2019) {				
				this.semesterTranscript.inputCourseInfo(course, grade, courseIntakeSemester);
			}
			this.gpaUpdater();
	}
	private void gpaUpdater() {
		float generalGPA=this.generalTranscript.calculateGPA();
		this.profile.setGpa(generalGPA);
		float currentSemesterGPA=this.semesterTranscript.calculateGPA();
		this.profile.setCurrentSemesterGPA(currentSemesterGPA);
		
	}
	
	
	
	
	
	
	
	
	
	
}
		