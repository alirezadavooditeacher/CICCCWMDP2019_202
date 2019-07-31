package src.problem1;

import java.util.function.ToLongFunction;

public class ToLongFunctionExample {

    public static void main(String[] args) {
        ToLongFunction<String> i  = (x)-> Long.parseLong(x);

        System.out.println(i.applyAsLong("2"));
    }

}
