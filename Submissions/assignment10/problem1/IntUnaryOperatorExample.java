package assignment10.problem1;

import java.util.function.IntUnaryOperator;

/**
 * IntUnaryOperator represents an operation on a single int-valued operand that produces an int-valued result.
 * This is the primitive type specialization of UnaryOperator for int.
 *
 * 単一のint値オペランドに作用してint値の結果を生成する演算を表します。
 * これは、UnaryOperatorに対してプリミティブ型特殊化(int向け)を行ったものです。
 * これは、applyAsInt(int)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a number then the number multiple 2 finally return the number divided by 3

public class IntUnaryOperatorExample {

    public static void main(String[] args){
        IntUnaryOperator iuo = num -> num * 2;
        iuo = iuo.andThen(num -> num / 3);
        System.out.println(iuo.applyAsInt(100));
    }


}
