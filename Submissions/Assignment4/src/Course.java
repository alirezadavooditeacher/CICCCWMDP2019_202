public class Course {
	private String courseName;
	private String courseCode;
	private String courseNumberOfUnits;
	private int grade = -1;
	private int numberOfSemester = 0;

	public Course() {
	}

	public Course(String courseName, String courseCode, String courseNumberOfUnits, int grade, int numberOfSemester) {
		super();
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.courseNumberOfUnits = courseNumberOfUnits;
		this.grade = grade;
		this.numberOfSemester = numberOfSemester;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseNumberOfUnits() {
		return courseNumberOfUnits;
	}

	public void setCourseNumberOfUnits(String courseNumberOfUnits) {
		this.courseNumberOfUnits = courseNumberOfUnits;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getNumberOfSemester() {
		return numberOfSemester;
	}

	public void setNumberOfSemester(int numberOfSemester) {
		this.numberOfSemester = numberOfSemester;
	}
}
