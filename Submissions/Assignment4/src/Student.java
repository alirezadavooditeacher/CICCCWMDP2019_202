
public class Student {
	private int yearOfStudent;
	private int yearInUniversity;
	private GeneralTranscript generalTranscript;
	private CurrentSemesterTranscript semesterTranscript;
	private StudentProfile studentProfile;

	public Student() {
	}

	public Student(int yearOfStudent, int yearInUniversity, GeneralTranscript generalTranscript,
			CurrentSemesterTranscript semesterTranscript, StudentProfile studentProfile) {
		super();
		this.yearOfStudent = yearOfStudent;
		this.yearInUniversity = yearInUniversity;
		this.generalTranscript = generalTranscript;
		this.semesterTranscript = semesterTranscript;
		this.studentProfile = studentProfile;
	}

	public int getYearOfStudent() {
		return yearOfStudent;
	}

	public void setYearOfStudent(int yearOfStudent) {
		this.yearOfStudent = yearOfStudent;
	}

	public int getYearInUniversity() {
		return yearInUniversity;
	}

	public void setYearInUniversity(int yearInUniversity) {
		this.yearInUniversity = yearInUniversity;
	}

	public GeneralTranscript getGeneralTranscript() {
		return generalTranscript;
	}

	public void setGeneralTranscript(GeneralTranscript generalTranscript) {
		this.generalTranscript = generalTranscript;
	}

	public CurrentSemesterTranscript getSemesterTranscript() {
		return semesterTranscript;
	}

	public void setSemesterTranscript(CurrentSemesterTranscript semesterTranscript) {
		this.semesterTranscript = semesterTranscript;
	}

	public StudentProfile getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}
}
