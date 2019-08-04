package assignment10.problem1;

/**
 * BiPredicate represents a predicate which is a boolean-valued function of two arguments.
 *
 * 2つの引数の述語(boolean値関数)を表します。これは、Predicateを、引数を2個取るように特殊化したものです。
 *
 * この課題では、それぞれの機能インターフェースについて1つの例を考えます。
 * この目的のために、それぞれの組み込み機能インターフェースについて、問題を思いつき、
 * 機能インターフェースを使用して解決できる1,2行の問題記述を書きます。
 */

// Using BinaryOperator, write a method which takes 2 numbers.
// Print ture if num1 can divided by num2. If not, print false.

import java.util.function.BiPredicate;



public class BiPredicateExample {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bi = (num1, num2) -> num1 % num2 == 0;

        System.out.println(bi.test(108, 27));
    }

}
