package assignment10.problem1;

import java.util.function.DoubleFunction;

/**
 * DoubleFunction represents a function that accepts a double-valued argument and produces a result.
 * This is the double-consuming primitive specialization for Function.
 *
 * 1つのdouble値引数を受け取って結果を生成する関数を表します。これは、Functionに対して、
 * doubleを消費するプリミティブ特殊化を行ったものです。
 * これは、apply(double)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a double number then the number divided by 10 and print the answer

public class DoubleFunctionExample {

    public static void main(String[] args){

        DoubleFunction<Double> df = num -> (double)(num / 10);

        System.out.println(df.apply(0.412));

    }

}
