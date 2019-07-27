package src.problem1;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorExample {

    public static void main(String[] args) {
        IntBinaryOperator io = (x, y)->x +y;

        System.out.println(io.applyAsInt(2,3));
    }

}
