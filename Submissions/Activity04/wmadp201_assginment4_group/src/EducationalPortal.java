package wmadp201_assginment4_group.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Educational Portal
 * main source of this application
 */
public class EducationalPortal {

    private ArrayList<Account> accounts;
    private ArrayList<Course> courses;
    private static Manager manager;

    public EducationalPortal() {
        this.accounts = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void start() {

        boolean isEnd = false;
        while (!isEnd) {
            isEnd = startSystem();
        }

    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public static Manager getManager() {
        return manager;
    }

    public void addAccounts(Account account) {
        getAccounts().add(account);
    }

    public void addCourses(Course course) {
        getCourses().add(course);
    }

    public static void setManager(Manager manager) {
        EducationalPortal.manager = manager;
    }

    /**
     * start system
     *
     * @return boolean true:terminate  false: logout
     */
    private boolean startSystem() {

        System.out.println(getLoginViewText());

        // start asking
        System.out.print("user name: ");
        Scanner reader = new Scanner(System.in);
        String userName = reader.nextLine();
        Account account;
        if (userName.equals("Register")) {
            // start registration process
            account = registerStudent();

        } else {
            // keep asking for login information
            System.out.print("password: ");
            String password = reader.nextLine();
            boolean isCorrectLoginInfo = isRegisteredStudent(userName, password);
            if (!isCorrectLoginInfo) {
                System.out.println(getUncorrectedInfoViewText());
                return false;
            } else {
                account = getAccount(userName, password);
            }

        }

        System.out.println(getWelcomeText());

        // wait for 2 seconds
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            // do nothing
        }

        return startMainMenu(account);
    }

    /**
     * start showing menu after login
     *
     * @param account login account
     * @return boolean true:terminate  false: logout
     */
    private boolean startMainMenu(Account account) {

        Scanner reader = new Scanner(System.in);
        String number;

        while(true) {
            System.out.print(getMainMenuViewText());
            number = reader.nextLine();
            switch (number) {
                case "1":
                    // menu1
                    account.getStudent().printMyEnrolmentCertificate();
                    continue;
                case "2":
                    // menu2
                    char gender = account.getStudent().getStudentProfile().getGender();
                    String name = account.getStudent().getStudentProfile().getName();
                    try {
                        account.getStudent().getGt().printMyCourses(gender, name);
                    } catch (NullPointerException e) {
                        System.out.println("\nYou haven't taken any classes yet.\n");
                    }
                    continue;
                case "3":
                    // menu3
                    account.getStudent().printMyTranscript();
                    continue;
                case "4":
                    // menu4
                    printMyGpa(account);
                    continue;
                case "5":
                    // menu5
                    printMyRanking(account);
                    continue;
                case "6":
                    listAllAvailableCourse(account);
                    continue;
                case "7":
                    // menu7
                    System.out.println(getListOfAllStudentsInCollege(getAccounts()));
                    continue;
                case "8":
                    // menu8
                    account.getStudent().printMyProfile();
                    continue;
                case "9":
                    // menu9
                    return false;
                case "10":
                    // menu10
                    return true;
                default:
                    System.out.println("Please input number between 1 and 10.\n");
            }

        }
    }

    /**
     * register new student information
     *
     * @return Account new account
     */
    private Account registerStudent() {
        System.out.println(getRegisterViewText());

        Scanner reader = new Scanner(System.in);
        System.out.print("first name: ");
        String firstName = reader.nextLine();

        System.out.print("last name: ");
        String lastName = reader.nextLine();

        char gender;
        String genderString;
        while(true) {
            System.out.print("gender [M/F/O]: ");
            genderString = reader.nextLine();
            if (genderString.equals("M") || genderString.equals("F") || genderString.equals("O")) {
                // success
                break;
            }
            System.out.println("Sorry we don't correspond for other gender. Please input M or F or O.");
        }
        gender = genderString.toCharArray()[0];

        System.out.print("country of origin: ");
        String country = reader.nextLine();

        System.out.print("address: ");
        String address = reader.nextLine();

        int yearOfAdmission;
        String yearOfAdmissionString;
        while(true) {
            System.out.print("year of admission: ");
            yearOfAdmissionString = reader.nextLine();
            try {
                yearOfAdmission = Integer.parseInt(yearOfAdmissionString);
            } catch (NumberFormatException e) {
                System.out.println("You must input number as year of admission.");
                continue;
            }
            break;
        }

        int age;
        String ageString;
        while(true) {
            System.out.print("age: ");
            ageString = reader.nextLine();
            try {
                age = Integer.parseInt(ageString);
            } catch (NumberFormatException e) {
                System.out.println("You must input number as age.");
                continue;
            }
            break;
        }

        String userName;
        while(true) {
            System.out.print("username [At least 6 characters]: ");
            userName = reader.nextLine();
            if (userName.length() < 6) {
                System.out.println("You must input username at least 6 characters.");
                continue;
            }
            break;
        }

        String password;
        while(true) {
            System.out.print("Please enter a password [At least 6 characters with at least one digit: ");
            password = reader.nextLine();
            int length = password.length();
            if (length < 6) {
                System.out.println("You must input username at least 6 characters.");
                continue;
            }

            boolean hasDigit = false;
            for (int i = 0; i < length; i++) {
                boolean isDigit = Character.isDigit(password.charAt(i));
                if (isDigit) {
                    hasDigit = true;
                }
            }

            if (hasDigit) {
                break;
            }

            System.out.println("Password must include at least one digit.");
        }

        StudentProfile sp = new StudentProfile(firstName, lastName, gender, country, address, age, yearOfAdmission, getNewStudentId());
        Student student = new Student(sp);
        Account account = new Account(userName, password, student);
        addAccounts(account);

        System.out.println("Thanks, your account and profile has been created successfully. Welcome Aboard " + firstName + " " + lastName);

        return account;
    }

    private boolean isRegisteredStudent(String userName, String password) {
        if (getAccounts().size() == 0) {
            return false;
        }
        for (Account account: getAccounts()) {
            if (account.getUserName().equals(userName) && account.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    private Account getAccount(String userName, String password) {

        for (Account account : getAccounts()) {
            if (account.getUserName().equals(userName) && account.getPassword().equals(password)) {
                return account;
            }
        }

        throw new IllegalArgumentException("Student supposes to exist in ArrayList of student as instance variable.");
    }

    private String getLoginViewText() {
        return "************************************************************\n" +
                "Please enter your account to login:\n" +
                "************************************************************\n" +
                "Username:\n" +
                "Password:\n" +
                "\n" +
                "----------------\n" +
                "Not registered yet? Type “Register” and press enter to start the registration process!\n";
    }

    private String getWelcomeText() {
        return "************************************************************\n" +
                "Welcome to Cornerstone International College of Canada.\n" +
                "************************************************************\n";
    }

    private String getUncorrectedInfoViewText() {
        return "************************************************************\n" +
                "Your account does not exist. Please try again!\n" +
                "************************************************************\n";
    }

    private String getRegisterViewText() {
        return "\n************************************************************\n" +
                "Welcome to CornerstoneInternational College of Canada.\n" +
                "************************************************************\n" +
                "Please enter your first name:\n" +
                "Please enter your last name:\n" +
                "Please enter your gender [M/F]:\n" +
                "Please enter your country of origin:\n" +
                "Please enter your address:\n" +
                "Please enter the year of admission:\n" +
                "Please enter your age:\n" +
                "Please enter a username [At least 6 characters]:\n" +
                "Please enter a password [At least 6 characters with at least one digit]:\n";
    }

    private String getMainMenuViewText() {
        return "************************************************************\n" +
                "Select from the options:\n" +
                "************************************************************\n" +
                "—-[1] Print my enrolment certificate\n" +
                "—-[2] Print my courses\n" +
                "—-[3] Print my transcript\n" +
                "—-[4] Print my GPA\n" +
                "—-[5] Print my ranking among all students in the college\n" +
                "—-[6] List all available courses\n" +
                "—-[7] List all students\n" +
                "—-[8] Show My Profile\n" +
                "-—[9] Logout\n" +
                "-—[10] Exit\n" +
                "\n" +
                "************************************************************\n" +
                "Enter the number corresponding to each item to proceed:";
    }

    private void printMyGpa(Account account) {

        StudentProfile sp = account.getStudent().getStudentProfile();
        String title = Util.getTitleForName(sp.getGender());
        String name = sp.getName();
        String gpa = "";
        try {
            gpa = String.format("%.1f", account.getStudent().getGt().getGpa());
        } catch (NullPointerException e) {
            System.out.println("\nYou haven't taken any classes yet.\n");
            return;
        }
        String currentGpa = String.format("%.1f", account.getStudent().getCst().getGpa());

        String s = "\nHi " + title + name + ",\n" +
                "Your overall GPA is " + gpa + "\n" +
                "Your current semester’s GPA is " + currentGpa + "\n";
        System.out.println(s);
    }

    private void printMyRanking(Account myAccount) {

        StudentProfile sp = myAccount.getStudent().getStudentProfile();
        String title = Util.getTitleForName(sp.getGender());
        String name = sp.getName();
        double myGpa;
        try {
            myGpa = myAccount.getStudent().getGt().getGpa();
        } catch (NullPointerException e) {
            System.out.println("\nYou haven't taken any classes yet.\n");
            return;
        }
        String gpa = String.format("%.1f", myGpa);
        ArrayList<Double> grades = new ArrayList<>();
        for (Account account : getAccounts()) {
            grades.add(account.getStudent().getGt().getGpa());
        }
        grades.sort(Collections.reverseOrder());
        int rank = 1;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) <= myGpa) {
                break;
            }
            rank++;
        }

        String s = "\nHi " + title + name + ",\n" +
                "Your overall GPA is " + gpa + " and therefore your rank is " + rank + ".\n";
        System.out.println(s);
    }

    private void listAllAvailableCourse(Account account) {

        ArrayList<Course> courses = getCourses();
        String s = "";
        ArrayList<TakenCourse> takenCourses;
        try {
            takenCourses = account.getStudent().getGt().getTakenCourses();
        } catch (NullPointerException e) {
            System.out.println("\nYou haven't taken any classes yet.\n");
            return;
        }
        int length = courses.size();
        for (int i = 0; i < length; i++) {
            Course course = courses.get(i);
            String code = course.getCode();
            String name = course.getName();
            int unit = course.getUnits();
            int takenCourseLength = takenCourses.size();
            String semester = "Not taken";
            for (int j = 0; j < takenCourseLength; j++) {
                if (takenCourses.get(j).getCode().equals(course.getCode())) {
                    semester = "Taken at semester " + takenCourses.get(j).getSemester();
                    break;
                }
            }
            s += (i + 1) + ") " + code + ": " +  name + ": " + unit + " units [" + semester + "]\n";
        }

        System.out.println(s);
    }

    private String getListOfAllStudentsInCollege(ArrayList<Account> accounts) {
        int numberOfStudents = accounts.size();

        String s = "\nThere are " + numberOfStudents + " students in CICCC as following:\n";

        for (int i = 0; i < numberOfStudents; i++) {
            StudentProfile sp = accounts.get(i).getStudent().getStudentProfile();
            String name = sp.getName();
            String studentId = sp.getStudentId();
            s += (i + 1) + ") " + name + ": " + studentId + "\n";
        }

        return s;
    }

    public String getNewStudentId() {
        while (true) {
            String newStudentId = Util.getRandom8DigitAsString();
            if (getAccounts().size() == 0) {
                return newStudentId;
            }
            for (Account account: getAccounts()) {
                if (!newStudentId.equals(account.getStudent().getStudentProfile().getStudentId())) {
                    return newStudentId;
                }
            }
        }
    }

}
