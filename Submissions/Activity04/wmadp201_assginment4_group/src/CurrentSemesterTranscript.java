package wmadp201_assginment4_group.src;

import java.util.ArrayList;

public class CurrentSemesterTranscript {
    private ArrayList<TakenCourse> takenCourses;

    public CurrentSemesterTranscript() {
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

    public String getCurrentSemesterTranscript() {

        String gpa = String.format("%.1f", getGpa());

        String coursesString = "";
        int length = getTakenCourses().size();
        for (int i = 0; i < length; i++) {
            TakenCourse tc =  getTakenCourses().get(i);
            coursesString += (i + 1) + ") " + tc.getCode() + ": " + tc.getName() + ": " + tc.getGrade() + "\n";
        }

        String s = "Here is your current semester transcript:\n" +
                "\n" +
                coursesString + "\n" +
                "YOUR Current Semester GPA IS: " + gpa + "\n";
        return s;
    }
}
