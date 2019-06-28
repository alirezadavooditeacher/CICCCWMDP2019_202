package wmadp201_assginment4_group.src;

import java.util.ArrayList;

public class GeneralTranscript {
    private ArrayList<TakenCourse> takenCourses;

    public GeneralTranscript() {
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

    public void printMyCourses(char gender, String name) {
        System.out.println(getMyCourses(gender, name));
    }

    public String getMyCourses(char gender, String name) {

        String title = Util.getTitleForName(gender);
        ArrayList<TakenCourse> courses = getTakenCourses();
        String coursesString = "";
        for (int i = 0; i < courses.size(); i++) {
            coursesString += (i + 1) + ") " + courses.get(i).getCode() + ": " + courses.get(i).getName() + "\n";
        }

        String s = "\nHi " + title + name + ",\n" +
                "You have taken the following courses so far:\n" +
                coursesString + "\n";

        return s;
    }

    public String getGeneralTranscript() {

        String gpa = String.format("%.1f", getGpa());

        String coursesString = "";
        int length = getTakenCourses().size();
        for (int i = 0; i < length; i++) {
            TakenCourse tc =  getTakenCourses().get(i);
            coursesString += (i + 1) + ") " + tc.getCode() + ": " + tc.getName() + ": " + tc.getGrade() + "\n";
        }

        String s = "Here is your general transcript:\n" +
                "\n" +
                coursesString + "\n" +
                "YOUR GPA IS: " + gpa + "\n";
        return s;
    }
}
