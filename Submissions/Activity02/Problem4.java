package Activity02;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Each student is represented by the following properties:
 * o firstName
 * o lastName
 * o address
 * o Year of bird
 * o Average
 * Write a Java class with a static method which receives a list of students as its input
 * parameter and return the student who has the highest average. (Remember: You can use a
 * dictionary to represent a student. Do not define a class for the student at this time)
 */
public class Problem4 {

    public static String getSmartestStudent(ArrayList<HashMap<String, String>> studentsInfo) {

        int max = -1;
        String smartestStudent = "";
        for (HashMap<String, String> student: studentsInfo) {
            int average = Integer.parseInt(student.get("Average"));
            if (average > max) {
                max = average;
                smartestStudent = student.get("firstName");
            }
        }

        return smartestStudent;
    }

}
