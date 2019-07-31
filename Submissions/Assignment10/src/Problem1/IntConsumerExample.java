package Problem1;

import java.util.function.IntConsumer;

// print out the square of a number
public class IntConsumerExample {
    public static void main(String[] args){
        IntConsumer consumer =
                num -> System.out.println(num * num);
        consumer.accept(10);
    }
}
