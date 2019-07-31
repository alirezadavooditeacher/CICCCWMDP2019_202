package src.problem1;

import java.util.function.IntFunction;

public class IntFunctionExample {

    public static void main(String[] args) {
        IntFunction<String> i = (x)->Integer.toString(x);

        System.out.println(i.apply(3).length());
    }

}
