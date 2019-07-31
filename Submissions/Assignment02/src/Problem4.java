import java.util.List;

/**
 * - Each student is represented by the following properties:
 * • firstName
 * • lastName
 * • address
 * • Year of bird
 * • Average
 * Write a Java class with a static method which receives a list of students as its input
 * parameter and return the student who has the highest average. (Remember: You can use a
 * dictionary to represent a student. Do not define a class for the student at this time)
 */
public class Problem4 {
    public static Student findRepeatedNumbers (List<Student> students) {
        Student smartest = null;

        for(Student student: students) {
            if (smartest == null || smartest.getAverage() < student.getAverage()) {
                smartest = student;
            }
        }

        return smartest;
    }
}
