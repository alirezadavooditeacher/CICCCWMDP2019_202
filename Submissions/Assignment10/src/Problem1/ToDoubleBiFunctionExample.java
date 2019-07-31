package Problem1;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionExample {
    public static void main(String[] args){

        ToDoubleBiFunction<Double, Integer> divisor =
                (doubleNum, intNum) -> doubleNum / intNum;
        System.out.println(divisor.applyAsDouble(12.3, 4));
    }
}
