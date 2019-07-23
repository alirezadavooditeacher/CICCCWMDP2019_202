package app.entity;

/**
 * Student
 *
 * this class represents a student. This is a central composition class which keeps student related information.
 */
public class Student {
    private static int nextId = 10000000;

    private int studentId;
    private Account account;
    private TranscriptCollection transcripts;
    private StudentProfile profile;

    /**
     * Factory method to maintain the ID
     *
     * @return created student
     */
    public static Student createStudent() {
        return new Student(nextId++);
    }

    /**
     * Constructor
     *
     * @param studentId the unique id
     */
    private Student(int studentId) {
        this.studentId = studentId;
        this.account = new Account();
        this.transcripts = new TranscriptCollection();
        this.profile = new StudentProfile();
    }

    /**
     * Getter for studentId
     *
     * @return the value
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Getter for account
     *
     * @return the value
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Getter for transcripts
     *
     * @return the value
     */
    public TranscriptCollection getTranscripts() {
        return transcripts;
    }

    /**
     * Getter for profile
     *
     * @return the value
     */
    public StudentProfile getProfile() {
        return profile;
    }

    /**
     * Take a new course
     *
     * @param course the course to take
     * @param semester semester to take in
     */
    public void takeCourse(Course course, int semester) {
        transcripts.addCourse(course, semester);
    }


}
