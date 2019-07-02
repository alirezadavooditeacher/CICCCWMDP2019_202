package assignment4;

public class Transcript {

    private String courseName;
    private int courseNumber;
    private int courseGrade;
    private int nuits;
    private int numberOfSemester;

    public int getCourseGrade() {
        return courseGrade;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public int getNuits() {
        return nuits;
    }

    public int getNumberOfSemester() {
        return numberOfSemester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseGrade(int courseGrade) {
        this.courseGrade = courseGrade;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setNuits(int nuits) {
        this.nuits = nuits;
    }

    public void setNumberOfSemester(int numberOfSemester) {
        this.numberOfSemester = numberOfSemester;
    }


}
