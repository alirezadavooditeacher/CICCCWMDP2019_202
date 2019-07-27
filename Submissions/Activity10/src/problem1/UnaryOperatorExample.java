package src.problem1;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<String> i  = (x)-> x.toUpperCase();

        System.out.println(i.apply("java2s.com"));
    }
}
