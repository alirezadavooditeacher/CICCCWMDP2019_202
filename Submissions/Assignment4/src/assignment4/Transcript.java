package assignment4;

public class Transcript {

    private String courseName;
    private int courseNumber;
    private int courseGrade;
    private int units;
    private int numberOfSemester;

    public int getCourseGrade() {
        return courseGrade;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public int getUnits() {
        return units;
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

    public void setUnits(int units) {
        this.units = units;
    }

    public void setNumberOfSemester(int numberOfSemester) {
        this.numberOfSemester = numberOfSemester;
    }

    public Transcript(String courseName, int courseNumber, int courseGrade, int units, int numberOfSemester){
        super();
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseGrade = courseGrade;
        this.units = units;
        this.numberOfSemester = numberOfSemester;
    }
}
