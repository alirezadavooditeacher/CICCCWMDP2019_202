package src.problem1;

import java.util.function.IntConsumer;

public class IntConsumerExample {

    public static void main(String[] args) {
        IntConsumer ic = (x)->System.out.println(x);

        ic.accept(3);
    }

}
