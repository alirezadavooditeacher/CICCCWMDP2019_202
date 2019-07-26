package Problem1;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;
// check if a student is above average
public class ObjDoubleConsumerExample {

    public static void main(String[]args){

        ObjDoubleConsumer<Student> objDoubleConsumer =
                (student, average) -> {
                    int count = 0;
                    double total = 0;
                    for (int i = 0; i < student.getGrades().size(); i++){
                        total += student.getGrades().get(i);
                        count ++;
                    }
                    double studentAverage = total / count;
                    if(studentAverage >= average){
                        System.out.println(student.getName() + " is an above average student");
                    } else {
                        System.out.println(student.getName() + " is a below average student");
                    }
                };
        ArrayList<Double> jakeGrades = new ArrayList<>();
        jakeGrades.add(3.5);
        jakeGrades.add(2.0);
        jakeGrades.add(3.2);

        Student student = new Student("Jake", 18, jakeGrades);
        objDoubleConsumer.accept(student, 3.2);
    }

}
