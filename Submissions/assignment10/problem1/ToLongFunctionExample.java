package assignment10.problem1;

import java.util.function.ToLongFunction;

public class ToLongFunctionExample {

    public static void main(String[] args) {

        ToLongFunction<String> l = num -> Long.parseLong(num);

        System.out.println(l.applyAsLong("100000000000"));

    }

}
