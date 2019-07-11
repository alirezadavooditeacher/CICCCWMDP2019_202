import java.util.ArrayList;

public class View implements TableCreation {
    private Table table;
    private ArrayList<Student> students;

    public View(ArrayList<Student> students) {
        this.students = students;
        this.table = new Table();
        this.table.delegate = this;

    }


    void ArrayList<Student> getListOfStudent(){
        return this.students;
    }

    Student getStudentForRow(int rowNumber){
        return this.students.get(rowNumber);
    }

    int getNumberOfStudent(){
        return this.students.size();

    }



}
