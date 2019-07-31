package app.menu.command;

import app.Session;
import app.Util;
import app.entity.*;

/**
 * Print all courses which is taken by the student
 */
public class PrintCourses implements Interface {
    @Override
    public String getMenuTitle() {
        return "Print my courses";
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        School school = (School) session.get("school");
        Student student = (Student) session.get("student");

        TranscriptCollection transcripts = student.getTranscripts();

        Util.greet(student.getProfile());
        System.out.println("You have taken the following courses so far:");
        int i = 1;
        for (Transcript transcript : transcripts) {
            Course course = transcript.getCourse();
            System.out.format("%d) %s: %s", i++, course.getCode(), course.getName());
            if (transcript.getSemester() == school.getSemester()) {
                System.out.println(" [Current semester]");
            } else {
                System.out.println();
            }
        }
    }
}
