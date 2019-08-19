package assignment10.problem1;

import java.util.function.IntFunction;

/**
 * IntFunction represents a function that accepts an int-valued argument and produces a result.
 * This is the int-consuming primitive specialization for Function.
 *
 * 1つのint値引数を受け取って結果を生成する関数を表します。
 * これは、Functionに対して、intを消費するプリミティブ特殊化を行ったものです。
 * これは、apply(int)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a number then return the number divided by 2 with IntFunction.

public class IntFunctionExample {

    public static void main(String args[]){
        IntFunction<Double> intFunction = num -> num / 2.0;

        System.out.println(intFunction.apply(7));
    }

}
