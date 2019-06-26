package app.entity;

/**
 * Transcript
 *
 * This class represents a transcript.
 */
public class Transcript {
    private Course course;
    private int semester;
    private int grade;

    /**
     * Constructor
     *
     * @param course course to evaluate
     * @param semester semester the student (will) take
     * @param grade student's grade for the course
     */
    public Transcript(Course course, int semester, int grade) {
        this.course = course;
        this.semester = semester;
        this.grade = grade;
    }

    /**
     * Getter for course
     *
     * @return the value
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Getter for semester
     *
     * @return the value
     */
    public int getSemester() {
        return semester;
    }

    /**
     * Getter for grade
     *
     * @return the value
     */
    public int getGrade() {
        return grade;
    }
}
