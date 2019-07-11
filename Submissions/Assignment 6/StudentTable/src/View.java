import java.util.ArrayList;

public class View {
    private ArrayList<Student> students;
    private Table delegate;

    public View(ArrayList<Student> students) {
        this.students = students;
        this.delegate = new Table();
    }

    public void createTable(){
        this.delegate.createTable(this.students);
    }
}
