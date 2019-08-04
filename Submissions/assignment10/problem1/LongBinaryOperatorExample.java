package assignment10.problem1;

import java.util.function.LongBinaryOperator;

/**
 * LongBinaryOperator represents an operation upon two long-valued operands and producing a long-valued result.
 * This is the primitive type specialization of BinaryOperator for long.
 *
 * 2つのlong値オペランドに作用してlong値の結果を生成する演算を表します。
 * これは、BinaryOperatorに対してプリミティブ型特殊化(long向け)を行ったものです。
 * これは、applyAsLong(long, long)を関数メソッドに持つ関数型インタフェースです
 */

// Receive two long numbers(x,y) then return x divided by y by using LongBinaryOperator.

public class LongBinaryOperatorExample {

    public static void main(String[] args){
        LongBinaryOperator lbo = (x,y) -> x / y;
        System.out.println(lbo.applyAsLong(2000,134));
    }



}
