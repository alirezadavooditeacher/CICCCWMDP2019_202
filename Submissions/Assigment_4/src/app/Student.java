package app;

import java.util.ArrayList;

public class Student {

  static int studentId = 0;
  int admissionYear;
  int numberOfYearsInUniversity;
  Transcript generalTranscript;
  Profile studentProfile;
  ArrayList<Course> courses;
  StudentAccount account;

  public Student(String fristName, String lastName, String gender, String countryOfOrigin, int admissionYear, int age,
      String username, String password) {
    super();
    this.admissionYear = admissionYear;
    this.generalTranscript = new GeneralTranscript();
    Student.studentId += 1;
    this.studentProfile = new Profile(studentId, fristName, lastName, gender, countryOfOrigin, age, this.admissionYear);
    courses = new ArrayList<Course>();
    account = new StudentAccount(username, password);
  }

  public void addCourse(Course course) {
    courses.add(course);
  }

  public ArrayList<Course> getCourses() {
    // should return the students courses
    return courses;
  }

}
