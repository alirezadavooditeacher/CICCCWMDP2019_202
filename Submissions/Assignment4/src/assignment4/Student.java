package assignment4;

public class Student {
    private StudentProfile yearOfAdmission;  // The admission year of the student.
    private int yearInUniversity;   //The number of year in university.
    private GeneralTranscript generalTranscript;  //All the courses the student has taken so far.
    private CurrentSemesterTranscript semesterTranscript; //All the courses the student is taking in the current
    // semester
    private StudentProfile profile;	//A profile which contains some personal information about the student.

    public StudentProfile getYearOfAdmission() {
        return yearOfAdmission;
    }

    public int getYearInUniversity() {
        return yearInUniversity;
    }

    public CurrentSemesterTranscript getSemesterTranscript() {
        return semesterTranscript;
    }

    public GeneralTranscript getGeneralTranscript() {
        return generalTranscript;
    }

    public StudentProfile getProfile() {
        return profile;
    }

    public void setYearInUniversity(int yearInUniversity) {
        this.yearInUniversity = yearInUniversity;
    }

    public Student(int yearInUniversity){
        super();
        this.yearInUniversity = yearInUniversity;
    }
}
