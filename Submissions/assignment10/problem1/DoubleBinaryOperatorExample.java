package assignment10.problem1;

/**
 * DoubleBinaryOperator represents an operation on two double-valued operands and producing a double-valued result.
 *
 * 2つのdouble値オペランドに作用してdouble値の結果を生成する演算を表します。
 * これは、BinaryOperatorに対してプリミティブ型特殊化(double向け)を行ったものです。
 * これは、applyAsDouble(double, double)を関数メソッドに持つ関数型インタフェースです。
 */

// print answer which x divide by y with DoubleBinaryOperator

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorExample {

    public static void main(String[] args) {
        DoubleBinaryOperator dbo = (x,y) -> x/y;
        System.out.println(dbo.applyAsDouble(0.43, 0.11));
    }

}
