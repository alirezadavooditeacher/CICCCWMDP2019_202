package app;

import java.util.ArrayList;

/**
 * School
 */
public class School {

  String name;
  ArrayList<Student> studentList = new ArrayList<>();
  ArrayList<Course> courseList = new ArrayList<>();

  Manager manager;

  public School(String name) {
    this.name = name;
  }

  public void addStudent(Student student) {
    studentList.add(student);
  }

  public void addCourse(Course course) {
    courseList.add(course);
  }

  public void setManager(Manager manager) {
    this.manager = manager;
  }
}