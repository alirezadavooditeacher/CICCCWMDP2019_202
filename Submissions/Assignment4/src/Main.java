import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<Student> lstStudent = new ArrayList<Student>();
	private static Student currentStudent = null;

	public static void main(String[] args) {
		createListStudent();
		init();
	}

	private static void init() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("************************************************************");
		System.out.println("Please enter your account to login:");
		System.out.println("************************************************************");
		System.out.println("Not registered yet? Type Register and press enter to start the registration process!");
		System.out.println("Registered. Type Login and press enter to start the login process!");

		System.out.print("Type: ");
		String register = scanner.next();

		if (register.equals("Register")) {
			register(scanner);
		} else if (register.equals("Login")) {
			login(scanner);
		}
	}

	private static void register(Scanner scanner) {
		System.out.println("************************************************************");
		System.out.println("Welcome to Cornerstone International College of Canada.");
		System.out.println("************************************************************");
		System.out.println("Please enter your first name: ");
		String firstName = scanner.next();
		System.out.print("Please enter your last name: ");
		String lastName = scanner.next();
		System.out.print("Please enter your gender [M/F]: ");
		String gender = scanner.next();
		System.out.print("Please enter your country of origin: ");
		String countryOfOrigin = scanner.next();
		System.out.print("Please enter the year of admission: ");
		String yearOfAdmission = scanner.next();
		System.out.print("Please enter your age: ");
		int age = scanner.nextInt();

		System.out.print("Please enter a username [At least 6 characters]: ");
		long userName = scanner.nextLong();
		System.out.print("Please enter a password [At least 6 characters with at least one digit]: ");
		String password = scanner.next();

		StudentProfile studentProfile = new StudentProfile(getStudentID(), firstName, lastName, gender, null,
				countryOfOrigin, age, yearOfAdmission);
		Account account = new Account(userName, password);
		account.setStudentProfile(studentProfile);
		Account.accounts.add(account);

		for (int i = 0; i < lstStudent.size(); i++) {
			if (lstStudent.get(i).getStudentProfile() == null) {
				lstStudent.get(i).setStudentProfile(studentProfile);
				currentStudent = lstStudent.get(i);
				break;
			}
		}

		System.out.println("Thanks, your account and profile has been created successfully. Welcome Aboard " + firstName
				+ " " + lastName);
		try {
			Thread.sleep(2000);
			showMenuOption(scanner);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void login(Scanner scanner) {
		boolean isValidLogin = false;
		while (true) {
			System.out.print("Username:");
			long userName = scanner.nextLong();
			System.out.print("Password:");
			String password = scanner.next();

			Account account = new Account(userName, password);
			if (!account.checkLogin()) {
				System.out.println("************************************************************");
				System.out.println("Your account does not exist. Please try again!");
				System.out.println("************************************************************");
			} else {
				System.out.println("************************************************************");
				System.out.println("Welcome to Cornerstone International College of Canada.");
				System.out.println("************************************************************");
				long studentID = account.getStudentProfile().getStudentID();
				for (int i = 0; i < lstStudent.size(); i++) {
					if (lstStudent.get(i).getStudentProfile().getStudentID() == studentID) {
						currentStudent = lstStudent.get(i);
						break;
					}
				}
				isValidLogin = true;
				break;
			}
		}

		if (isValidLogin) {
			showMenuOption(scanner);
		}
	}

	private static void showMenuOption(Scanner scanner) {
		boolean isInit = false;
		boolean isExit = false;
		while (true) {
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
			System.out.print("Enter the number corresponding to each item to proceed:");
			int choose = scanner.nextInt();

			switch (choose) {
			case 1:
				printCertificate();
				break;
			case 2:
				printCourses();
				break;
			case 3:
				printTranscript();
				break;
			case 4:
				printGPA();
				break;
			case 5:
				printRankingAllStudents();
				break;
			case 6:
				listAllAvailableCourses();
				break;
			case 7:
				listAllStudentsCollege();
				break;
			case 8:
				showProfile();
				break;
			case 9:
				isInit = true;
				break;
			case 10:
				isExit = true;
				break;

			default:
				break;
			}

			if (isInit || isExit) {
				break;
			}
		}

		if (isInit) {
			init();
		}
	}

	private static void showProfile() {
		StudentProfile studentProfile = currentStudent.getStudentProfile();
		System.out.println("Name: " + studentProfile.getFirstName() + " " + studentProfile.getLastName());
		System.out.println("StudentID: " + studentProfile.getStudentID());
		System.out.println("Gender: " + studentProfile.getGender());
		System.out.println("Address: " + studentProfile.getAddress());
		System.out.println("Country of Origin: " + studentProfile.getCountryOfOrigin());
		System.out.println("Age: " + studentProfile.getAge());
		System.out.println("Year of Admission: " + studentProfile.getYearOfAdmission());
		System.out.println("Overall GPA: 64.75" + currentStudent.getSemesterTranscript().overallGPA());
		System.out.println("Courses Taken So far: " + currentStudent.getGeneralTranscript().printCourseName());
		System.out.println(currentStudent.getSemesterTranscript().printCourseName());
	}

	private static void listAllStudentsCollege() {
		System.out.println("There are " + countStudent() + " students in CICCC as following:");
		int count = 1;
		for (int i = 0; i < lstStudent.size(); i++) {
			if (lstStudent.get(i).getStudentProfile() != null) {
				StudentProfile studentProfile = lstStudent.get(i).getStudentProfile();
				System.out.println(count + ") " + studentProfile.getFirstName() + " " + studentProfile.getLastName()
						+ ": " + studentProfile.getStudentID());
				count++;
			}
		}
	}

	private static void listAllAvailableCourses() {
		System.out.println("The following courses are offered in CICCC:");
		for (int i = 0; i < lstStudent.size(); i++) {
			CurrentSemesterTranscript currentSemesterTranscript = lstStudent.get(i).getSemesterTranscript();
			for (int j = 0; j < currentSemesterTranscript.getCourse().size(); j++) {
				System.out.println(
						String.valueOf(j + 1) + ") " + currentSemesterTranscript.getCourse().get(i).getCourseCode()
								+ ": " + currentSemesterTranscript.getCourse().get(i).getCourseName() + ": "
								+ currentSemesterTranscript.getCourse().get(i).getCourseNumberOfUnits() + " units");
			}
		}

	}

	private static void printRankingAllStudents() {
		GeneralTranscript generalTranscript = currentStudent.getGeneralTranscript();
		System.out.println("Hi Mr. " + currentStudent.getStudentProfile().getFirstName() + " "
				+ currentStudent.getStudentProfile().getLastName() + ",");
		System.out.println("Your overall GPA is " + generalTranscript.overallGPA() + " and therefore your rank is 3.");
	}

	private static void printGPA() {
		CurrentSemesterTranscript currentSemesterTranscript = currentStudent.getSemesterTranscript();
		GeneralTranscript generalTranscript = currentStudent.getGeneralTranscript();
		System.out.println("Hi Mr. " + currentStudent.getStudentProfile().getFirstName() + " "
				+ currentStudent.getStudentProfile().getLastName() + ",");
		System.out.println("Your overall GPA is " + generalTranscript.overallGPA());
		System.out.println("Your current semester’s GPA is " + currentSemesterTranscript.overallGPA());
	}

	private static void printTranscript() {
		GeneralTranscript generalTranscript = currentStudent.getGeneralTranscript();
		System.out.println("Hi Mr. " + currentStudent.getStudentProfile().getFirstName() + " "
				+ currentStudent.getStudentProfile().getLastName() + ",");
		System.out.println("Here is your general transcript:");
		for (int i = 0; i < generalTranscript.getCourse().size(); i++) {
			System.out.println(String.valueOf(i + 1) + ") " + generalTranscript.getCourse().get(i).getCourseCode()
					+ ": " + generalTranscript.getCourse().get(i).getCourseName());
		}

		System.out.println("YOUR GPA IS: " + generalTranscript.overallGPA());
		System.out.println("Here is your current semester transcript:");
		CurrentSemesterTranscript currentSemesterTranscript = currentStudent.getSemesterTranscript();
		for (int i = 0; i < currentSemesterTranscript.getCourse().size(); i++) {
			System.out
					.println(String.valueOf(i + 1) + ") " + currentSemesterTranscript.getCourse().get(i).getCourseCode()
							+ ": " + currentSemesterTranscript.getCourse().get(i).getCourseName());
		}
		System.out.println("YOUR Current Semester GPA IS: " + currentSemesterTranscript.overallGPA());
	}

	private static void printCourses() {
		System.out.println("Hi Mr. " + currentStudent.getStudentProfile().getFirstName() + " "
				+ currentStudent.getStudentProfile().getLastName() + ",");
		System.out.println("You have taken the following courses so far:");
		for (int i = 0; i < lstStudent.size(); i++) {
			CurrentSemesterTranscript currentSemesterTranscript = lstStudent.get(i).getSemesterTranscript();
			for (int j = 0; j < currentSemesterTranscript.getCourse().size(); j++) {
				System.out.println(
						String.valueOf(j + 1) + ") " + currentSemesterTranscript.getCourse().get(i).getCourseCode()
								+ ": " + currentSemesterTranscript.getCourse().get(i).getCourseName() + ": "
								+ currentSemesterTranscript.getCourse().get(i).getCourseNumberOfUnits() + " units");
			}
		}

	}

	private static void printCertificate() {
		System.out.println("Dear Sir/Madam,");
		System.out.println("This is to certify that Mr. Peter Brown with student id "
				+ currentStudent.getStudentProfile().getStudentID() + " is a student at semster 1 at CICCC.");
		System.out.println(
				"He was admitted to our college in 2011 and has taken 1 course(s) so far. Currently he resides at 850");
		System.out.println("West Vancouver, Vancouver.");
		System.out.println("If you have any question, please don’t hesitate to contact us.");
		System.out.println("Thanks,");
		System.out.println("William,");
	}

	private static long getStudentID() {
		String currentTimeMillis = String.valueOf(System.currentTimeMillis());
		return Long.valueOf(currentTimeMillis.substring(currentTimeMillis.length() - 8, currentTimeMillis.length()));
	}

	private static void createListStudent() {
		for (int i = 0; i < 10; i++) {
			int yearOfStudent = 2;
			int yearInUniversity = 3;
			List<Course> courses = new ArrayList<Course>();

			for (int j = 0; j < 3; j++) {
				Course course = new Course("Course" + String.valueOf(i) + String.valueOf(j), String.valueOf(j), "1", 1,
						0);
				courses.add(course);
			}

			GeneralTranscript generalTranscript = new GeneralTranscript(courses);
			CurrentSemesterTranscript semesterTranscript = new CurrentSemesterTranscript(courses);
			StudentProfile studentProfile = null;
			Student student = new Student(yearOfStudent, yearInUniversity, generalTranscript, semesterTranscript,
					studentProfile);
			lstStudent.add(student);
		}
	}

	private static int countStudent() {
		int sum = 0;
		for (int i = 0; i < lstStudent.size(); i++) {
			if (lstStudent.get(i).getStudentProfile() != null) {
				sum += 1;
			}
		}

		return sum;
	}
}
