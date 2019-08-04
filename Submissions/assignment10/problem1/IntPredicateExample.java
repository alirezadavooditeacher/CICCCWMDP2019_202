package assignment10.problem1;

import java.util.function.IntPredicate;

/**
 * IntPredicate represents a predicate, which is a boolean-valued function, of one int-valued argument.
 * This is the int-consuming primitive type specialization of Predicate.
 *
 * 1つのint値引数の述語(boolean値関数)を表します。これは、Predicateに対して、intを消費するプリミティブ型特殊化を行ったものです。
 * これは、test(int)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a number. If the number bigger than 100, return true. If not, return false with IntPredicate.

public class IntPredicateExample {

    public static void main(String[] args) {
        IntPredicate ip = (num) -> num > 100;

        System.out.println(ip.test(777));
    }


}
