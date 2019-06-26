package app.menu.command;

import app.Session;
import app.entity.*;

import java.util.List;

/**
 * List available courses of the school
 */
public class ListAvailableCourses implements Interface {
    @Override
    public String getMenuTitle() {
        return "List all available courses";
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        School school = (School) session.get("school");
        Student student = (Student) session.get("student");
        TranscriptCollection transcripts = student.getTranscripts();

        System.out.format("The following courses are offered in %s:\n", school.getShortName());

        List<Course> courses = school.getCourses();
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            Transcript transcript = transcripts.findByCourse(course);

            System.out.format("%d) %s: %s: %d units ", i + 1, course.getCode(), course.getName(), course.getUnits());
            if (transcript != null) {
                System.out.format("[Taken at semester %d]\n", transcript.getSemester());
            } else {
                System.out.println("[Not taken]");
            }
        }
    }
}
