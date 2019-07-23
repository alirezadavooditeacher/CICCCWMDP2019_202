package app.menu.command;

import app.Session;
import app.Util;
import app.entity.School;
import app.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Print the ranking of the student in the school
 */
public class PrintRanking implements Interface {
    @Override
    public String getMenuTitle() {
        return "Print my ranking among all students in the college";
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        School school = (School) session.get("school");
        Student student = (Student) session.get("student");

        List<Student> students = school.getStudents();

        List<Double> scores = new ArrayList<>();
        double myGPA = 0;
        for (Student item : students) {
            double gpa = item.getTranscripts().calculateGPA();
            scores.add(gpa);
            if (item == student) {
                myGPA = gpa;
            }
        }
        scores.sort(Collections.reverseOrder());

        int rank = 0;
        for (int i = 0; i < scores.size(); i++) {
            rank++;
            if (scores.get(i).equals(myGPA)) {
                break;
            }
        }

        Util.greet(student.getProfile());
        System.out.format("Your overall GPA is %.2f and therefore your rank is %d.", myGPA, rank);
    }
}
