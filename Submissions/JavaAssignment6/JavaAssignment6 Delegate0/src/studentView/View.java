package studentView;

import java.util.ArrayList;

public class View implements TableProvider{
    ArrayList<Student> students;

    public View() {
        students = new ArrayList<>();
    }

    @Override
    public int rows() {
        return students.size();
    }

    @Override
    public String data(int index) {
        Student student = students.get(index);
        return String.format("%s %s, %.2f", student.getFirstName(), student.getLastName(), student.getGPA());
    }

    @Override
    public int height(int index) {
        return 100;
    }
}