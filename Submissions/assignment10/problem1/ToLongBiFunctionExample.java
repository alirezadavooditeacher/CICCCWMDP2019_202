package assignment10.problem1;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionExample {

    public static void main(String[] args){

        ToLongBiFunction<String, String> l = (num1, num2) -> Long.parseLong(num1)*Long.parseLong(num2);
        System.out.println(l.applyAsLong("1000000","1000000"));

    }

}
