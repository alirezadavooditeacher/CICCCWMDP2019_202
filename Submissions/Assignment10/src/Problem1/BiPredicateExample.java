package Problem1;// Check if an integer value is the same as a String value

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args){
        BiPredicate<Integer, String> tester =
                (num, word) -> Integer.toString(num).equals(word);
        System.out.println(tester.test(5, "5"));
    }
}

