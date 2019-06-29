package app;

/**
 * Transcript
 */
public interface Transcript {

  final static int DEFAULT_GRADE = -1;

  public void addCourse(Course course);

  public void addStudent(Student student);

  public float calculateGPA();
}