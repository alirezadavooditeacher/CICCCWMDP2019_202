package app;

import app.entity.*;
import app.menu.MainMenu;
import app.menu.command.Login;

import java.util.List;

/**
 * Application Driver
 */
public class Application {
    public static void main(String[] args) {
        // initialize data
        setupSchool();
        setupUsers();

        // main logic
        Session session = Session.getInstance();
        MainMenu menu = new MainMenu();

        while (true) {
            if (session.get("student") == null) {
                Login login = new Login();
                login.execute();
            }
            menu.printToChose();
            System.out.println(); // to add empty line
        }
    }

    /**
     * Mock up the school data to run the app
     */
    private static void setupSchool() {
        Manager manager = new Manager("Woe", "Coda", "Mr");
        School ciccc = new School("Cornerstone International College of Canada", "CICCC", manager);

        // addCourse courses
        ciccc.addCourse(new Course("Objective-C", "MADP101", 3));
        ciccc.addCourse(new Course("Object-Oriented Programming", "MADP102", 2));
        ciccc.addCourse(new Course("Problem Solving", "MADP201", 1));
        ciccc.addCourse(new Course("Project Management", "MADP202", 3));
        ciccc.addCourse(new Course("Java Programming", "MADP301", 3));
        ciccc.addCourse(new Course("Web Development", "MADP302", 2));
        ciccc.addCourse(new Course("Android Programming", "MADP401", 2));
        ciccc.addCourse(new Course("iOS Applications", "MADP402", 3));

        Session.getInstance().set("school", ciccc);
    }

    /**
     * Mock up some students data to run the app
     */
    private static void setupUsers() {
        School school = (School) Session.getInstance().get("school");

        List<Course> courses = school.getCourses();

        // app.entity.Student A
        Student student = Student.createStudent();
        Account account = student.getAccount();
        account.setUsername("test1");
        account.setPassword("password");

        StudentProfile profile = student.getProfile();
        profile.setFirstName("Daveen");
        profile.setLastName("Starkings");
        profile.setGender('M');
        profile.setAddress("8 2nd Parkway");
        profile.setCountry("Portugal");
        profile.setAge(27);
        profile.setAdmissionYear(2019);
        profile.setYearOfUniversity(4);

        student.takeCourse(courses.get(0), 1);
        student.takeCourse(courses.get(1), 1);
        student.takeCourse(courses.get(3), 3);

        school.addStudent(student);

        // app.entity.Student B
        student = Student.createStudent();
        account = student.getAccount();
        account.setUsername("test2");
        account.setPassword("password");

        profile = student.getProfile();
        profile.setFirstName("Emmy");
        profile.setLastName("Leese");
        profile.setGender('F');
        profile.setAddress("63619 Ruskin Road");
        profile.setCountry("China");
        profile.setAge(24);
        profile.setAdmissionYear(2017);
        profile.setYearOfUniversity(4);

        student.takeCourse(courses.get(2), 3);
        student.takeCourse(courses.get(4), 1);
        student.takeCourse(courses.get(6), 2);

        school.addStudent(student);

        // app.entity.Student C
        student = Student.createStudent();
        account = student.getAccount();
        account.setUsername("test3");
        account.setPassword("password");

        profile = student.getProfile();
        profile.setFirstName("Murial");
        profile.setLastName("Devenport");
        profile.setGender('F');
        profile.setAddress("326 Onsgard Cente");
        profile.setCountry("Bosnia and Herzegovina");
        profile.setAge(28);
        profile.setAdmissionYear(2019);
        profile.setYearOfUniversity(4);

        student.takeCourse(courses.get(1), 1);
        student.takeCourse(courses.get(4), 2);
        student.takeCourse(courses.get(7), 3);
        student.takeCourse(courses.get(5), 4);
        student.takeCourse(courses.get(3), 3);

        school.addStudent(student);
    }
}
