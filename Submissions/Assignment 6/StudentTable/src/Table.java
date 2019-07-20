import java.util.ArrayList;
import java.util.Iterator;

public class Table implements TableCreation {

    public TableCreation delegate;

    public void drawTable(){

        ArrayList<Student> students = this.delegate.getListOfStudent();

        System.out.println(students);

        for(int i=0; i<students.size(); i++) {
            System.out.println(this.delegate.getStudentForRow(i));
        }


    }


}
