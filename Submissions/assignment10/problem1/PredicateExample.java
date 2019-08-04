package assignment10.problem1;

import java.util.function.Predicate;

/**
 * Predicate represents a predicate, which is boolean-valued function, of one argument.
 *
 * 1つの引数の述語(boolean値関数)を表します。
 * これは、test(Object)を関数メソッドに持つ関数型インタフェースです。
 */

public class PredicateExample {

    public static void main(String[] args){

        Predicate<Integer> p = num -> num > 0;

        System.out.println(p.test(-1));

    }

}
