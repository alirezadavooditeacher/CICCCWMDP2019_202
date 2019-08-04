package assignment10.problem1;

import java.util.function.LongFunction;

/**
 * LongFunction represents a function that accepts a long-valued argument and produces a result.
 * This is the long-consuming primitive specialization for Function.
 *
 * 1つのlong値引数を受け取って結果を生成する関数を表します。
 * これは、Functionに対して、longを消費するプリミティブ特殊化を行ったものです。
 * これは、apply(long)を関数メソッドに持つ関数型インタフェースです。
 */

public class LongFunctionExample {

    public static void main(String[] args){

        LongFunction lf = num -> Long.MAX_VALUE/num;
        System.out.println(lf.apply(Long.MAX_VALUE));

    }

}
