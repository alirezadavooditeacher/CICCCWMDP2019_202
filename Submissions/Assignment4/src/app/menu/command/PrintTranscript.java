package app.menu.command;

import app.Session;
import app.Util;
import app.entity.*;

/**
 * Print all transcript of the student
 */
public class PrintTranscript implements Interface {
    @Override
    public String getMenuTitle() {
        return "Print my transcript";
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        School school = (School) session.get("school");
        Student student = (Student) session.get("student");

        int semester = school.getSemester();
        TranscriptCollection transcripts = student.getTranscripts();

        Util.greet(student.getProfile());

        System.out.println("Here is your general transcript:");
        // all semester
        printTranscripts(transcripts, semester);
        System.out.format("YOUR GPA IS: %.2f\n", transcripts.calculateGPA());
        System.out.println();
        // current semester
        transcripts = transcripts.filterBySemester(semester);
        printTranscripts(transcripts, semester);
        System.out.format("YOUR Current Semester GPA IS: %.2f\n", transcripts.calculateGPA());
    }

    private void printTranscripts(TranscriptCollection transcripts, int currentSemester) {
        int i = 1;
        for (Transcript transcript : transcripts) {
            Course course = transcript.getCourse();
            System.out.format("%d) %s: %s: %d", i++, course.getCode(), course.getName(), transcript.getGrade());
            if (transcript.getSemester() == currentSemester) {
                System.out.println(" [Current semester]");
            } else {
                System.out.println();
            }
        }
    }
}
