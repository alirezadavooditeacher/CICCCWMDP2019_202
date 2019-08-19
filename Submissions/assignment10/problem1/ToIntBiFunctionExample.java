package assignment10.problem1;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionExample {

    public static void main(String[] args) {
        ToIntBiFunction<Integer, String> i = (x, y) -> x + Integer.parseInt(y);
        System.out.println(i.applyAsInt(123, "321"));

    }

}
