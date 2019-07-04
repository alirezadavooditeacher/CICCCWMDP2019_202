import java.util.HashMap;
import java.util.Scanner;

import account.Account;
import student.Student;
//import studentObjectsCreator.*;


public class ApplicationDriver {
	public static void main(String[] args) {
		loginView();
	}
	
	
	public static void loginView() {
		Student logingStudent = null;
		boolean passLoginView=false;
		while(passLoginView==false) {
			System.out.println("***************************************************************");
			System.out.println("Please enter your account to login:");
			System.out.println("***************************************************************");
			Scanner s=new Scanner(System.in);
			System.out.println("Please enter your account to login:  *if you dont have an user type 'register'");
			System.out.println("Username:");
			String username=s.nextLine();
			if(username.contentEquals("register")) {
				//String studentObjName=StudentObjectsCreator.createName();
				//Student StudentObjectsCreator.createName()=new Student();
				new Student();
			}
			else {
			System.out.println("Password:");
			String password=s.nextLine();
			//Create hashMap just to see the available methods
			HashMap<String,Student> accountsAndPasswords=Account.getUsernameStudentsMap();
			logingStudent=accountsAndPasswords.get(username);
			if (accountsAndPasswords.containsKey(username)&&logingStudent.getAccount().getPassWord()==password) {
				passLoginView=true;
			}
			else {
				System.out.println("Username of password are wrong.Please try againg");
			}
			}
		}
		System.out.println("***************************************************************");
		System.out.println("Welcome to Cornestone International College of Canada");
		System.out.println("***************************************************************");
		tenOptionsView(logingStudent);
		
		//}
	}
	public static void tenOptionsView(Student student) {
		Scanner s = new Scanner(System.in);
		boolean flag = false;
		while (!(flag)) {
			System.out.println("************************************************************");
			System.out.println("Select from the options:");
			System.out.println("************************************************************");
			System.out.println("—-[1] Print my enrolment certificate");
			System.out.println("—-[2] Print my courses");
			System.out.println("—-[3] Print my transcript");
			System.out.println("—-[4] Print my GPA");
			System.out.println("—-[5] Print my ranking among all students in the college");
			System.out.println("—-[6] List all available courses");
			System.out.println("—-[7] List all students");
			System.out.println("—-[8] Show My Profile");
			System.out.println("-—[9] Logout");
			System.out.println("-—[10] Exit");
			System.out.println("************************************************************");
			System.out.println("Enter the number corresponding to each item to proceed:");
			int chosenNumber = s.nextInt();
			switch(chosenNumber) {
				case 1:
					//call printEnrollmentCertificate()
					student.printEnrollmentCertificate();
					break;
				case 2:
					//call printMyCourses()
					student.printMyCourses();
					break;
				case 3:
					//call printGeneralTranscript()
					student.printGeneralTranscript();
					break;
				case 4:
					//call printGPA()
					student.printGPA();
					break;
				case 5:
					//call printMyRanking()
					student.printMyRanking();
					break;
				case 6:
					//call printAvailableCourses()
					student.printAvailableCourses();
					break;
				case 7:
					//call printAllStrudens()
					student.printAllStrudens();
					break;
				case 8:
					//call printMyProfile()
					student.printMyProfile();
					break;
				case 9:
					flag = true;
					break;
				case 10:
					System.out.println("Bye");
					System.exit(0);
			}
		}
		loginView();
	}
}

















