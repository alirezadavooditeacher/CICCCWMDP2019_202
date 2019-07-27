package src.problem1;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionExample {

    public static void main(String[] args) {
        DoubleToIntFunction df = (x) -> (int)x+2;

        System.out.println(df.applyAsInt(3.14));
    }

}
