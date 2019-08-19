package assignment10.problem1;

import java.util.function.BiFunction;

/**
 * BiFunction represents a function that accepts two arguments and produces a result.
 * This is the two-arity specialization of Function.
 * BiFunctionは、2つの引数を受け入れて結果を返す関数を表します。
 * これはFunctionの2アリティスペシャライゼーションです。
 *
 * この課題では、それぞれの機能インターフェースについて1つの例を考えます。
 * この目的のために、それぞれの組み込み機能インターフェースについて、問題を思いつき、
 * 機能インターフェースを使用して解決できる1,2行の問題記述を書きます。
 */


// Using BiFunction, write a method which takes 2 numbers. Return the average of the numvers.


public class BiFunctionExample {

    public static void main(String[] args) {
        // BiFunction<num1, num2, ans>
        BiFunction<Integer, Integer, Integer> bi = (num1, num2) -> {
            int ans = (num1 + num2) / 2;
            return ans;
        };

        System.out.println(bi.apply(23, 52));

    }

}
