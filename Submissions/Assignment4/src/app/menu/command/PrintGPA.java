package app.menu.command;

import app.Session;
import app.Util;
import app.entity.School;
import app.entity.Student;
import app.entity.TranscriptCollection;

/**
 * Print GPA fo the student
 */
public class PrintGPA implements Interface {
    @Override
    public String getMenuTitle() {
        return "Print my GPA";
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        School school = (School) session.get("school");
        Student student = (Student) session.get("student");

        int semester = school.getSemester();
        TranscriptCollection transcripts = student.getTranscripts();

        Util.greet(student.getProfile());
        // all semester
        System.out.format("Your overall GPA is: %.2f\n", transcripts.calculateGPA());

        // current semester
        transcripts = transcripts.filterBySemester(semester);
        System.out.format("Your current semester’s GPA is: %.2f\n", transcripts.calculateGPA());
    }
}
