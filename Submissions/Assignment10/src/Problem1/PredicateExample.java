package Problem1;

import java.util.function.Predicate;

// check if a student is 19 or higher
public class PredicateExample {
    public static void main(String[] args){
        Predicate<Student> predicate =
                student -> student.getAge() >= 19;
        Student student = new Student("Alphose", 22, null);
        System.out.println(predicate.test(student));
    }
}
