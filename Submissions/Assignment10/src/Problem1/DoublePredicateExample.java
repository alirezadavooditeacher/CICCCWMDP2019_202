package Problem1;

import java.util.function.DoublePredicate;

// Check if given GPA is higher than the average
public class DoublePredicateExample {
    public static double AVERAGE = 3.1;

    public static void main(String[] args){
        DoublePredicate predicate =
                (num) -> num > AVERAGE;
        System.out.println(predicate.test(2.8));
    }

}
