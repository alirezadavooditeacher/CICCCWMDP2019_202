package assignment10.problem1;

import java.util.function.LongPredicate;

public class LongPredicateExample {

    public static void main(String[] args){

        LongPredicate lp = num -> {
            return (num == 100);
        };

        System.out.println(lp.test(99));
    }

}
