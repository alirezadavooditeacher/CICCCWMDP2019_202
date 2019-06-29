package wmadp201_assginment4_group.src.Transcript;

import wmadp201_assginment4_group.src.TakenCourse;

import java.util.ArrayList;

public abstract class Transcript {
    protected ArrayList<TakenCourse> takenCourses;
    protected String kindOfTranscript;

    public Transcript() {
        this.takenCourses = new ArrayList<>();
    }

    public ArrayList<TakenCourse> getTakenCourses() {
        return this.takenCourses;
    }

    public void addTakenCourses(TakenCourse takenCourse) {
        this.takenCourses.add(takenCourse);
    }

    public double getGpa() {
        int grade = 0;
        ArrayList<TakenCourse> takenCourses = getTakenCourses();
        for (TakenCourse takenCourse: takenCourses) {
            grade += takenCourse.getGrade();
        }
        double gpa = grade / takenCourses.size();

        return gpa;
    }

    public String getTranscript() {

        String gpa = String.format("%.1f", getGpa());

        String coursesString = getCoursesText(getTakenCourses());

        String s = "Here is your " + this.kindOfTranscript + " transcript:\n" +
                "\n" +
                coursesString + "\n" +
                "YOUR " + this.kindOfTranscript.toUpperCase() + " GPA IS: " + gpa + "\n";
        return s;
    }

    protected String getCoursesText(ArrayList<TakenCourse> takenCourses) {
        String coursesString = "";
        int length = takenCourses.size();
        for (int i = 0; i < length; i++) {
            TakenCourse tc =  takenCourses.get(i);
            coursesString += (i + 1) + ") " + tc.getCode() + ": " + tc.getName() + ": " + tc.getGrade() + "\n";
        }

        return coursesString;
    }
}
