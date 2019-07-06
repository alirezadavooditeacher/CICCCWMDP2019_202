import java.util.ArrayList;

public class View implements TableDataProvider {
    ArrayList<Student> students;

    public View() {
        students = new ArrayList<>();
        students.add(new Student("Zuzana", "Beeze", 99));
        students.add(new Student("Julissa", "Ventura", 71));
        students.add(new Student("Danya", "Matthews", 76));
        students.add(new Student("Giacopo", "Sheen", 84));
    }

    @Override
    public int rows() {
        return students.size();
    }

    @Override
    public String data(int index) {
        Student student = students.get(index);
        return String.format("%s %s, %d", student.getFirstName(), student.getLastName(), student.getGpa());
    }

    @Override
    public int height(int index) {
        return 100;
    }
}
