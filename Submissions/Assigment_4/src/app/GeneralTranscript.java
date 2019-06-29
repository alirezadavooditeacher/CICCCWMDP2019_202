package app;

import java.util.ArrayList;

public class GeneralTranscript implements Transcript {
  ArrayList<Course> allCourses = new ArrayList<Course>();
  ArrayList<Student> allStudent = new ArrayList<Student>();

  public void addCourse(Course course) {
    allCourses.add(course);
  }

  public void addStudent(Student student) {
    allStudent.add(student);
  }

  @Override
  public float calculateGPA() {
    return 0;
  }

}
