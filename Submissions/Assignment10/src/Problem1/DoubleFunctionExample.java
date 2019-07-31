package Problem1;

import java.util.function.DoubleFunction;

// Check if the inputted integer is above average
public class DoubleFunctionExample {
    public static double average = 3.1;

    public static void main(String[] args){
        DoubleFunction<Boolean> check =
                num -> num > average;
        System.out.println(check.apply(3.2));
    }
}
