package src.problem1;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<String, String,String> bi = (x, y) -> {
            return x + y;
        };

        System.out.println(bi.apply("java2s.com", " tutorial"));
    }

}
