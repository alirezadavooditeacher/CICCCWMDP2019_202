package app.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * School
 *
 * This represents a school information. A school has courses, students, manager.
 */
public class School {
    private String name;
    private String shortName;
    private Manager manager;
    private List<Course> courses;
    private List<Student> students;
    private int semester;

    /**
     * Constructor
     * @param name      name of the school
     * @param shortName short name (CICCC for example)
     * @param manager   a manger of the school
     */
    public School(String name, String shortName, Manager manager) {
        this.name = name;
        this.shortName = shortName;
        this.manager = manager;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.semester = 3; // always 3
    }

    /**
     * Getter for courses
     * @return the value
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * Getter for students
     * @return the value
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Getter for manager
     * @return the value
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * Setter for semester
     * @param semester the value
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     * Getter for semester
     * @return the value
     */
    public int getSemester() {
        return semester;
    }

    /**
     * Getter for shortName
     * @return the value
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Getter for name
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Add a new course to the school
     * @param course the new course to add
     */
    public void addCourse(Course course) {
        courses.add(course);
    }

    /**
     * Add a new student to the school
     * @param student the new student to add
     */
    public void addStudent(Student student) {
        students.add(student);
    }
}
