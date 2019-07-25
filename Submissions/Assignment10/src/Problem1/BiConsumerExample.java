package Problem1;

import java.util.function.BiConsumer;

// Print out the addition of two numbers
public class BiConsumerExample {
    public static void main(String[] args){
        BiConsumer<Integer, Integer> addition =
                (num1, num2) -> System.out.println(num1 + num2);

        addition.accept(5, 10);
    }
}


//public class Problem1.BiConsumerExample {
//    public static void main(String[] args){
//
//    }
//}