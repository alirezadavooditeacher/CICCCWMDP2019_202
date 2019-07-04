package app;

import java.util.Scanner;

public class Menu {

  public static void main(String[] args) {
    School school = new School("Cornerstone");
    Scanner input = new Scanner(System.in);
    String username;
    String password;
    Boolean isItCorrect;
    Student student;
    // LOGIN
    printLoginRequest();

    username = getUser(input);
    if (checkIfEnteredRegister(username, input)) {
      student = registerStudent(input);
    } else {
      password = getPassword(input);
      if (checkIfUserNameExists(username, school)) {
        student = getStudentWithUsername(username, school);
        if (isPasswordCorrect(student, password)) {
          printWelcomeMensage();
          printSectionMenu();
          switch (input.nextLine()) {
          case "1":
            printCertificadeOfEffort(student);
          case "2":
            printCourses(student);
          case "3":

          case "4":

          case "5":

          case "6":

          case "7":

          case "8":

          case "9":

          case "10":

          }
        } else {
          printErrorMesage();
        }
      }
    }

  }

  private static void printCourses(Student student) {
    System.out.println("Hi Mr." + student.studentProfile.fristName + " " + student.studentProfile.lastName);
    System.out.println("You have taken the following courses so far:");
    for (int i = 0; i < student.courses.size(); i++) {
      System.out.println((i + 1) + ") " + student.courses.get(i).couseId + ": " + student.courses.get(i).name);
    }
  }

  private static void printCertificadeOfEffort(Student student) {
    System.out.println(
        "Dear Sir/Madam, This is to certify that Mr. Peter Brown with student id 7813007 is a student at semester 1 at CICCC.   He was admitted to our college in 2011 and has taken 1 course(s) so far. currently he resides at 850  West Vancouver, Vancouver.   If you have any question, please don’t hesitate to contact us.\n Thanks,\n [Manager’s name: ??? ],");
  }

  private static void printSectionMenu() {
    System.out.println("************************************************************");
    System.out.println("Select from the options:");
    System.out.println("************************************************************");
    System.out.println(
        "—-[1] Print my enrolment certificate\n—-[2] Print my courses\n—-[3] Print my transcript\n—-[4] Print my GPA\n—-[5] Print my ranking among all students in the college\n—-[6] List all available courses\n—-[7] List all students\n—-[8] Show My Profile\n-—[9] Logout\n");
  }

  private static boolean isPasswordCorrect(Student student, String password) {
    if (student.account.password.equals(password)) {
      return true;
    }
    return false;
  }

  private static Student getStudentWithUsername(String username, School school) {
    for (Student student : school.studentList) {
      if (student.account.userName.equals(username)) {
        return student;
      }
    }
    return null;
  }

  private static void printErrorMesage() {
    System.out.println("*******************************************************");
    System.out.println("Your account does not exist. Please try again!");
    System.out.println("*******************************************************");
  }

  private static Boolean checkIfUserNameExists(String username, School school) {
    for (Student std : school.studentList) {
      if (std.account.userName.equals(username)) {
        return true;
      }
    }
    return false;
  }

  private static void printWelcomeMensage() {
    System.out.println("*******************************************************");
    System.out.println("Welcome to Cornerstone International College of Canada");
    System.out.println("*******************************************************");
  }

  public static String getUser(Scanner input) {
    System.out.println("Username:");
    String username = input.nextLine();
    return username;
  }

  private static String getPassword(Scanner input) {
    System.out.println("Password:");
    String password = input.nextLine();
    return password;
  }

  private static void printLoginRequest() {
    System.out.println("*****************************************");
    System.out.println("Please enter you account to login:");
    System.out.println("*****************************************");
  }

  private static boolean checkIfEnteredRegister(String username, Scanner input) {
    return username.toLowerCase().equals("register");
  }

  private static Student registerStudent(Scanner input) {
    Student student;
    printWelcomeMensage();

    System.out.println("Please enter your frist name:");
    String fristName = input.nextLine();

    System.out.println("Please enter your last name:");
    String lastName = input.nextLine();

    System.out.println("Please enter your gender[M/F/O]:");
    String gender = input.nextLine();

    System.out.println("Please enter your country of origin:");
    String country = input.nextLine();

    System.out.println("Please enter the enter of admission:");
    int yearOfAdmission = Integer.parseInt(input.nextLine());

    System.out.println();
    System.out.println("Please enter your age");
    int age = Integer.parseInt(input.nextLine());

    System.out.println();
    System.out.println("Please enter a username [At least 6 characters]:");
    String user = input.nextLine();

    System.out.println("Please enter a password [At least 6 characters with at least one digit]:");
    String password = input.nextLine();

    student = new Student(fristName, lastName, gender, country, yearOfAdmission, age, user, password);

    System.out.println("Thanks, your account and profile has been created successfully. Welcome Aboard "
        + student.studentProfile.fristName);
    return student;
  }
}
