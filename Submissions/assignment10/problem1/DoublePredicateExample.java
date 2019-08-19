package assignment10.problem1;


// Recive a number then return true if the number is bigger than 10.

import java.util.function.DoublePredicate;

public class DoublePredicateExample {

    public static void main(String[] args) {
        DoublePredicate dp = num -> num > 10;

        System.out.println(dp.test(9.9));
    }

}
