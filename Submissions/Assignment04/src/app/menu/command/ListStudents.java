package app.menu.command;

import app.Session;
import app.entity.School;
import app.entity.Student;
import app.entity.StudentProfile;

import java.util.List;

/**
 * List all student of the school
 */
public class ListStudents implements Interface {
    @Override
    public String getMenuTitle() {
        return "List all students in the college";
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        School school = (School) session.get("school");

        List<Student> students = school.getStudents();

        System.out.format("There are %d students in %s as following:\n", students.size(), school.getShortName());

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            StudentProfile profile = student.getProfile();
            System.out.format("%d) %s %s: %d\n", i + 1, profile.getFirstName(), profile.getLastName(), student.getStudentId());
        }
    }
}
