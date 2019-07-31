package Problem1;

import java.util.function.IntPredicate;

// check if a number is even
public class IntPredicateExample {
    public static void main(String[] args){
        IntPredicate isEven =
                num -> num % 2 == 0;
        System.out.println(isEven.test(6));
    }
}
