package src.problem1;

import java.util.function.IntPredicate;

public class IntPredicateExample {

    public static void main(String[] args) {
        IntPredicate i = (x)-> x < 0;

        System.out.println(i.test(123));
    }

}
