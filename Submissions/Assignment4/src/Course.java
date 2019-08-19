public class Course {
    private String courseName;
    private String courseCode;
    private int courseNumberOfUnit;
    private int grade;
    private int semesterOfCourse;

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCourseNumberOfUnit() {
        return courseNumberOfUnit;
    }

    public int getGrade() {
        return grade;
    }

    public int getSemesterOfCourse() {
        return semesterOfCourse;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseNumberOfUnit(int courseNumberOfUnit) {
        this.courseNumberOfUnit = courseNumberOfUnit;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSemesterOfCourse(int semesterOfCourse) {
        this.semesterOfCourse = semesterOfCourse;
    }

    public Course(String courseName, String courseCode, int courseNumberOfUnit, int grade, int semesterOfCourse){
        super();
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseNumberOfUnit = courseNumberOfUnit;
        this.grade = grade;
        this.semesterOfCourse = semesterOfCourse;
    }
}
