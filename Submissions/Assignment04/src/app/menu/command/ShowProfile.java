package app.menu.command;

import app.Session;
import app.entity.*;

import java.util.ArrayList;

/**
 * Show the student's profile
 */
public class ShowProfile implements Interface {
    @Override
    public String getMenuTitle() {
        return "Show My Profile";
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        School school = (School) session.get("school");
        Student student = (Student) session.get("student");
        StudentProfile profile = student.getProfile();

        System.out.format("Name: %s\n", profile.getFullName());
        System.out.format("StudentID: %d\n", student.getStudentId());
        System.out.format("Gender: %s\n", profile.getFullGender());
        System.out.format("Address: %s\n", profile.getAddress());
        System.out.format("Country of Origin: %s\n", profile.getCountry());
        System.out.format("Age: %d\n", profile.getAge());
        System.out.format("Year of Admission: %d\n", profile.getAdmissionYear());
        System.out.format("Overall GPA: %.2f\n", student.getTranscripts().calculateGPA());
        System.out.println("Courses Taken so far:");

        ArrayList<String> courses = new ArrayList<>();
        for (Transcript item : student.getTranscripts()) {
            // skip the course which will be taken in the future (semester > School.semester)
            // because the prompt says "Taken so far"
             if (item.getSemester() > school.getSemester()) {
                 continue;
             }
            Course course = item.getCourse();
            String str = String.format("%s: %s", course.getCode(), course.getName());
            if (item.getSemester() == school.getSemester()) {
                str += " [Current semester]";
            }
            courses.add(str);
        }
        System.out.println(String.join(", ", courses));
    }
}
