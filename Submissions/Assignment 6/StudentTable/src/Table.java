import java.util.ArrayList;
import java.util.Iterator;

public class Table implements TableCreation {

    public void createTable(ArrayList<Student> students){
        Iterator<Student> si = students.iterator();
        while(si.hasNext()){
            this.createRow(si.next());
        }
    }

    private void createRow(Student student){
        System.out.println(student.getName() + ", " + student.getGrade());
        System.out.println("----------------");
    }
}
