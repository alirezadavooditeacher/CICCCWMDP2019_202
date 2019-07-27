package src.problem1;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionExample {

    public static void main(String[] args) {
        DoubleToLongFunction dl = (x) -> Long.MAX_VALUE - (long)x;
        System.out.println(dl.applyAsLong(3.14));
    }

}
