package assignment10.problem1;

/**
 * 単一のlong値オペランドに作用してlong値の結果を生成する演算を表します。
 * これは、UnaryOperatorに対してプリミティブ型特殊化(long向け)を行ったものです。
 * これは、applyAsLong(long)を関数メソッドに持つ関数型インタフェースです。
 */

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorExample {

    public static void main(String[] args){

        LongUnaryOperator luo = num -> Long.MAX_VALUE - num;
        System.out.println(luo.applyAsLong(Long.MAX_VALUE*2));

    }

}
