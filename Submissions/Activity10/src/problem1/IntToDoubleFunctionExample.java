package src.problem1;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionExample {

    public static void main(String[] args) {
        IntToDoubleFunction i = (x) -> Math.sin(x);
        System.out.println(i.applyAsDouble(2));
    }

}
