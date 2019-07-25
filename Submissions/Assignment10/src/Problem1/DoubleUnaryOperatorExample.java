package Problem1;

import java.util.function.DoubleUnaryOperator;

// move the decimal point of a double to the right
public class DoubleUnaryOperatorExample {
    public static void main(String[] args){
        DoubleUnaryOperator operator =
                num -> num * 10;
        System.out.println(operator.applyAsDouble(12.53));
    }
}
