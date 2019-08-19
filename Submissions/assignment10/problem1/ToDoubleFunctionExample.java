package assignment10.problem1;

import java.util.function.ToDoubleFunction;

/**
 * double値の結果を生成する関数を表します。
 * これは、Functionに対して、doubleを生成するプリミティブ特殊化を行ったものです。
 * これは、applyAsDouble(Object)を関数メソッドに持つ関数型インタフェースです。
 */


public class ToDoubleFunctionExample {

    public static void main(String[] args){

        ToDoubleFunction<Integer> d = num -> num / 5;
        System.out.println(d.applyAsDouble(24));

    }

}
