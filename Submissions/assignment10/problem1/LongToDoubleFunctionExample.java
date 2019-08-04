package assignment10.problem1;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionExample {

    public static void main(String[] args) {
        LongToDoubleFunction ltdf = num -> 100 / num;
        System.out.println(ltdf.applyAsDouble(3));

    }

}
