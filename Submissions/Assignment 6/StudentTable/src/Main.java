import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Vlad", 56);
        Student s2 = new Student("Vitaly", 87);
        Student s3 = new Student("Ilya", 78);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        View view = new View(students);
        view.createTable();
    }
}
