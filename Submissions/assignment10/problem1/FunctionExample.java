package assignment10.problem1;

/**
 * Function represents a function that accepts one argument and produces a result.
 *
 * 1つの引数を受け取って結果を生成する関数を表します。
 */

// Receive a number then return the cubed number by function.

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer,Integer> function = (num) -> num*num*num;

        System.out.println(function.apply(100));
    }

}
