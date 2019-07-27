package src.problem1;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionExample {

    public static void main(String[] args) {
        LongToDoubleFunction i = (l) -> Math.sin(l);

        System.out.println(i.applyAsDouble(Long.MAX_VALUE));
    }

}
