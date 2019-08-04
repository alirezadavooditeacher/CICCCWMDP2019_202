package assignment10.problem1;

import java.util.function.DoubleToLongFunction;

/**
 * DoubleToLongFunction represents a function that accepts a double-valued argument and produces a long-valued result.
 * This is the double-to-long primitive specialization for Function.
 *
 * 1つのdouble値引数を受け取ってlong値の結果を生成する関数を表します。
 * これは、Functionに対してdoubleからlongへのプリミティブ特殊化を行ったものです。
 * これは、applyAsLong(double)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a double number then return the number above decimal point by long

public class DoubleToLongFunctionExample {

    public static void main(String[] args) {

        DoubleToLongFunction dtlf = num -> (long)num;

        System.out.println(dtlf.applyAsLong(13.1313131313));

    }

}
