package assignment10.problem1;

import java.util.function.ToIntFunction;

public class ToIntFunctionExample {

    public static void main(String[] args){

        ToIntFunction<String> i = (num) -> Integer.parseInt(num)+64;

        System.out.println(i.applyAsInt("13"));

    }

}
