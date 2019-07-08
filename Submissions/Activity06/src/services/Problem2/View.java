package services.Problem2;

import java.util.ArrayList;

// this class has a list of students information
public class View implements TableProvider {
    ArrayList<Student> students;

    public View() {
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    @Override
    public int numberOfStudents() {
        return this.students.size();
    }

    @Override
    public Student data(int index) {
        return this.students.get(index);
    }

    @Override
    public int height(int index) {
        return 1;
    }
}
