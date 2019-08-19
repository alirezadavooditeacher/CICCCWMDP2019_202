package assignment10.problem1;

import java.util.function.IntToLongFunction;

/**
 * IntToLongFunction represents a function that accepts an int-valued argument and produces a long-valued result.
 * This is the int-to-long primitive specialization for Function.
 *
 * 1つのint値引数を受け取ってlong値の結果を生成する関数を表します。これは、Functionに対してintからlongへのプリミティブ特殊化を行ったものです。
 * これは、applyAsLong(int)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a int number then change the number to long number by using IntToLongFunction.

public class IntToLongFunctionExample {

    public static void main(String[] args){
        IntToLongFunction itlf = num -> num;

        System.out.println(itlf.applyAsLong(200));
    }


}
