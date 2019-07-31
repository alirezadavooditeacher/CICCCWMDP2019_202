package src.problem1;

import java.util.function.LongPredicate;

public class LongPredicateExample {

    public static void main(String[] args) {
        LongPredicate i = (l) -> l>0;

        System.out.println(i.test(Long.MAX_VALUE));
    }

}
