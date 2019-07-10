import java.util.ArrayList;
import java.util.Iterator;

public class Table {

    public static void createTable(ArrayList<Student> students){
        Iterator<Student> si = students.iterator();
        while(si.hasNext()){
            Table.createRow(si.next());
        }
    }

    private static void createRow(Student student){
        System.out.println(student.getName() + ", " + student.getGrade());
        System.out.println("----------------");
    }
}
