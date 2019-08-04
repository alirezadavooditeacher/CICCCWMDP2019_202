package assignment10.problem1;

import java.util.function.DoubleUnaryOperator;

/**
 * DoubleUnaryOperator represents an operation on a single double-valued operand that produces a double-valued result.
 * This is the primitive type specialization of UnaryOperator for double.
 *
 * 単一のdouble値オペランドに作用してdouble値の結果を生成する演算を表します。
 * これは、UnaryOperatorに対してプリミティブ型特殊化(double向け)を行ったものです。
 * これは、applyAsDouble(double)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a double number then the number multiply 4.
// After that the number divide by 2 by DoubleUnaryOperator then return answer.

public class DoubleUnaryOperatorExample {

    public static void main(String[] args){

        DoubleUnaryOperator duo = num -> num * 4;

        duo = duo.andThen(num -> num / 2);

        System.out.println(duo.applyAsDouble(0.533423));

    }


}
