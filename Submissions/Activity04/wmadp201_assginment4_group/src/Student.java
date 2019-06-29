package wmadp201_assginment4_group.src;

import wmadp201_assginment4_group.src.Transcript.CurrentSemesterTranscript;
import wmadp201_assginment4_group.src.Transcript.GeneralTranscript;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private int admissionYear;
    private int yearInUniversity;
    private GeneralTranscript gt;
    private CurrentSemesterTranscript cst;
    private StudentProfile sp;

    public Student(StudentProfile sp) {
        this.sp = sp;
    }

    public StudentProfile getStudentProfile() {
        return this.sp;
    }

    public GeneralTranscript getGt() {
        return this.gt;
    }

    public CurrentSemesterTranscript getCst() {
        return this.cst;
    }

    public void setGt(GeneralTranscript gt) {
        this.gt = gt;
    }

    public void setCst(CurrentSemesterTranscript cst) {
        this.cst = cst;
    }

    public void printMyTranscript() {
        System.out.println(getMyTranscript());
    }

    public String getMyTranscript() {

        StudentProfile sp = getStudentProfile();
        String title = Util.getTitleForName(sp.getGender());
        String name = sp.getName();

        String generalTranscript;
        try {
            generalTranscript = getGt().getTranscript();
        } catch (NullPointerException e) {
            return "\nYou haven't taken any classes yet.\n";
        }
        String currentSemesterTranscript = getCst().getTranscript();

        return "\nHi " + title + name + ",\n" +
                generalTranscript +
                "\n" +
                currentSemesterTranscript + "\n";
    }

    public void printMyEnrolmentCertificate() {
        System.out.println(getMyEnrolmentCertificate());
    }

    public String getMyEnrolmentCertificate() {

        StudentProfile sp = getStudentProfile();
        char gender = sp.getGender();
        String title = Util.getTitleForName(gender);
        String pronoun = Util.getGenderPronoun(gender);
        String name = sp.getName();
        String studentId = sp.getStudentId();
        int admission = sp.getYearOfAdmission();
        int semester = sp.getStudentsSemester();
        int numberOfCourseTaken;
        try {
            numberOfCourseTaken = getGt().getTakenCourses().size();
        } catch (NullPointerException e) {
            return "\nYou haven't taken any classes yet.\n";
        }
        String address = sp.getAddress();
        String managerName = EducationalPortal.getManager().getName();

        return "\nDear Sir/Madam,\n" +
                "\n" +
                "This is to certify that " + title + name + " with student id " + studentId + " is a student at semester " + semester
                + " at CICCC. \n" +
                pronoun + " was admitted to our college in " + admission + " and has taken " + numberOfCourseTaken
                + " course(s) so far. Currently " + pronoun.toLowerCase() + " resides at " + address + "." +
                "\n" +
                "If you have any question, please don’t hesitate to contact us.\n" +
                "Thanks,\n" +
                "[Manager’s name: " + managerName + " ],\n";
    }

    public void printMyProfile() {
        System.out.println(getMyProfile());
    }

    public String getMyProfile() {

        HashMap<String, String> map = getProfileInfo();

        return "\nName: " + map.get("name") + "\n" +
                "StudentID: " + map.get("studentId") + "\n" +
                "Gender: " + map.get("gender") + "\n" +
                "Address: " + map.get("address") + "\n" +
                "Country of Origin: " + map.get("country") + "\n" +
                "Age: " + map.get("age") + "\n" +
                "Year of Admission: " + map.get("yearOfAdmission") + "\n" +
                "Overall GPA: " + map.get("gpa") + "\n" +
                "Courses Taken So far: \n" +
                "" + map.get("courseTakenString") + "\n";
    }

    public HashMap<String, String> getProfileInfo() {

        StudentProfile sp = getStudentProfile();
        String name = sp.getName();
        String studentId = sp.getStudentId();
        char gender = sp.getGender();
        String genderName = Util.getRegularGenderName(gender);
        String titleForName = Util.getTitleForName(gender);
        String address = sp.getAddress();
        String country = sp.getCountry();
        int age = sp.getAge();
        int yearOfAdmission = sp.getYearOfAdmission();
        String gpa;
        try {
            gpa = String.format("%.1f", getGt().getGpa());
        } catch (NullPointerException e) {
            gpa = "haven't taken any course yet";
        }


        String courseTakenString = "";
        try {
            for (TakenCourse takenCourse: getGt().getTakenCourses()) {
                courseTakenString += "    " + takenCourse.getCode() + ": " + takenCourse.getName();

                if (takenCourse.getSemester() == sp.getStudentsSemester()) {
                    courseTakenString += "[Current semester]";
                }
                courseTakenString += "\n";

            }
        } catch (NullPointerException e) {
            courseTakenString = "    " + "haven't taken any course yet";
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name", titleForName + name);
        map.put("studentId", studentId);
        map.put("gender", genderName);
        map.put("address", address);
        map.put("country", country);
        map.put("age", Integer.toString(age));
        map.put("yearOfAdmission", Integer.toString(yearOfAdmission));
        map.put("gpa", gpa);
        map.put("courseTakenString", courseTakenString);

        return map;
    }

    public void printMyCourses(char gender, String name) {
        System.out.println(getMyCourses(gender, name));
    }

    public String getMyCourses(char gender, String name) {

        String title = Util.getTitleForName(gender);
        ArrayList<TakenCourse> takenCourses = getGt().getTakenCourses();
        String coursesString = "";
        for (int i = 0; i < takenCourses.size(); i++) {
            TakenCourse takenCourse = takenCourses.get(i);
            coursesString += (i + 1) + ") " + takenCourse.getCode() + ": " + takenCourse.getName();
            if (takenCourse.getSemester() == getStudentProfile().getStudentsSemester()) {
                coursesString += "[Current semester]";
            }
            coursesString += "\n";
        }

        return "\nHi " + title + name + ",\n" +
                "You have taken the following courses so far:\n" +
                coursesString + "\n";
    }
}
