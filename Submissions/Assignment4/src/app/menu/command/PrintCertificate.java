package app.menu.command;

import app.Session;
import app.entity.School;
import app.entity.Student;
import app.entity.StudentProfile;
import app.entity.TranscriptCollection;

/**
 * Print student's certificate
 */
public class PrintCertificate implements Interface {
    @Override
    public String getMenuTitle() {
        return "Print my enrolment certificate";
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        School school = (School) session.get("school");
        Student student = (Student) session.get("student");

        StudentProfile profile = student.getProfile();
        TranscriptCollection transcripts = student.getTranscripts();

        int semester = school.getSemester();

        System.out.println("Dear Sir/Madam,");
        System.out.println();
        System.out.format(
                "This is to certify that %s with student id %d is a student at semester %d at %s. ",
                profile.getFullName(),
                student.getStudentId(),
                semester,
                school.getShortName()
        );
        System.out.format(
                "%s was admitted to our college in %d and has taken %d course(s) so far. Currently he resides at %s.\n",
                profile.getPersonalPronoun(true),
                profile.getAdmissionYear(),
                transcripts.countCoursesInSemester(semester),
                profile.getAddress()
        );
        System.out.println();
        System.out.println("If you have any question, please don’t hesitate to contact us.");
        System.out.println("Thanks,");
        System.out.println(school.getManager().getFirstName());
    }
}
