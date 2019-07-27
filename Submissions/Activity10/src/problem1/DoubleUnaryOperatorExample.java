package src.problem1;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorExample {

    public static void main(String[] args) {
        DoubleUnaryOperator dl = (x) -> x*x;
        System.out.println(dl.applyAsDouble(3.14));
    }

}
