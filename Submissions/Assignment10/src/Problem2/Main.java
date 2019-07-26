package Problem2;

import Problem1.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        FilterArray<Student, Integer> filterByAge =
                (students, condition) -> {
                    ArrayList<Student> newStudents = new ArrayList<>();
                    for (int i = 0; i < students.size(); i++){
                        if(students.get(i).getAge() > condition){
                            newStudents.add(students.get(i));
                        }
                    }
                    return newStudents;
                };
        Student student1 = new Student("Josh", 23, null);
        Student student2 = new Student("Emily", 17, null);
        Student student3 = new Student("Natalie", 20, null);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students = filterByAge.filter(students, 18);
        for (int i = 0; i < students.size(); i ++){
            System.out.println(students.get(i).getName());
        }
    }
}
