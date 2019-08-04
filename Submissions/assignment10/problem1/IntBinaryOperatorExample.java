package assignment10.problem1;

import java.util.function.IntBinaryOperator;

/**
 * IntBinaryOperator represents an operation upon two int-valued operands and producing an int-valued result.
 * This is the primitive type specialization of BinaryOperator for int.
 *
 */

// Receive 2 numbers then return the canadian tax(15%) of the numbers

public class IntBinaryOperatorExample {

    public static void main(String[] args) {
        IntBinaryOperator ibo = (num1,num2) -> (int) ((num1+num2)*0.15);

        System.out.println(ibo.applyAsInt(120,56));
    }

}
