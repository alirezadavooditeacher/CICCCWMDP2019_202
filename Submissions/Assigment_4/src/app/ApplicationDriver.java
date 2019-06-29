package app;

public class ApplicationDriver {

  public static void main(String[] args) {
    School school = new School("Cornerstone");

    Manager manager = new Manager("Hyu", "kaka", "President");

    Student s1 = new Student("Paulo", "Viga", "M", "Brazil", 2019, 23, "Paulo", "123456q");
    Student s2 = new Student("Paulo", "Viga", "M", "Brazil", 2019, 23, "Paulo1", "123456q");
    Student s3 = new Student("Paulo", "Viga", "M", "Brazil", 2019, 23, "Paulo2", "123456q");
    Student s4 = new Student("Paulo", "Viga", "M", "Brazil", 2019, 23, "Paulo3", "123456q");

    Course c1 = new Course("Objective-C", "MADP101", 3);
    Course c2 = new Course("Object-Oriented Programming", "MADP102", 2);
    Course c3 = new Course("Problem Solving", "MADP201", 1);
    Course c4 = new Course(" Project Management", "MADP202", 3);
    Course c5 = new Course(" Java Programming", "MADP301", 3);
    Course c6 = new Course("Web Development", "MADP302", 2);
    Course c7 = new Course("Android Programming", "MADP401", 2);
    Course c8 = new Course("iOS Applications", "MADP402", 3);

    System.out.println(s1);

    school.setManager(manager);
    school.addStudent(s1);
    school.addStudent(s2);
    school.addStudent(s3);
    school.addStudent(s4);

    school.addCourse(c1);
    school.addCourse(c2);
    school.addCourse(c3);
    school.addCourse(c4);
    school.addCourse(c5);
    school.addCourse(c6);
    school.addCourse(c7);
    school.addCourse(c8);

    // for (Student s : school.studentList) {
    // System.out.println(s.studentId);
    // }
  }
}
