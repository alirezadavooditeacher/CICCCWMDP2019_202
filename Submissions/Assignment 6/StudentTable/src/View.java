import java.util.ArrayList;

public class View {
    private ArrayList<Student> students;

    public View(ArrayList<Student> students) {
        this.students = students;
    }

    public void createTable(){
        Table.createTable(this.students);
    }
}
