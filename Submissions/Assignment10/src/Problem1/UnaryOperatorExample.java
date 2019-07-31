package Problem1;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args){
        UnaryOperator<Student> ageIncrease =
                student -> {
                    student.setAge(student.getAge() + 1);
                    return student;
                };
        Student student = new Student("Alphose", 22, null);
        System.out.println(ageIncrease.apply(student).getAge());
    }
}
