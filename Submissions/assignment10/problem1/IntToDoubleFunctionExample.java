package assignment10.problem1;

import java.util.function.DoubleFunction;

/**
 * IntToDoubleFunction represents a function that accepts an int-valued argument and
 * produces a double-valued result. This is the int-to-double primitive specialization for Function.
 *
 * 1つのint値引数を受け取ってdouble値の結果を生成する関数を表します。
 * これは、Functionに対してintからdoubleへのプリミティブ特殊化を行ったものです。
 * これは、applyAsDouble(int)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a number then return the 8% of the number by using DoubleFunction.

public class IntToDoubleFunctionExample {

    public static void main(String[] args){

        DoubleFunction<String> df = num -> String.valueOf(num*0.08);
        System.out.println(df.apply(416));

    }

}
