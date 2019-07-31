package src.problem1;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer,String> converter = (i)-> Integer.toString(i);

        System.out.println(converter.apply(3).length());
        System.out.println(converter.apply(30).length());
    }

}
