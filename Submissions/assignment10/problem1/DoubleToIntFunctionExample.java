package assignment10.problem1;

/**
 * DoubleToIntFunction represents a function that accepts a double-valued argument and
 * produces an int-valued result. This is the double-to-int primitive specialization for Function.
 *
 * 1つのdouble値引数を受け取ってint値の結果を生成する関数を表します。
 * これは、Functionに対してdoubleからintへのプリミティブ特殊化を行ったものです。
 * これは、applyAsInt(double)を関数メソッドに持つ関数型インタフェースです。
 *
 */

// Receive a double number then return the number above decimal point by int


import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionExample {

    public static void main(String[] args) {

        DoubleToIntFunction dtif = num -> (int) num;

        System.out.println(dtif.applyAsInt(1.9999999999));

    }
}
