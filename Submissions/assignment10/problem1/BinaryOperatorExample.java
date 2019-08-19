package assignment10.problem1;

/**
 *BinaryOperator represents an operation upon two operands of the same type,
 * producing a result of the same type.
 *
 * 同じ型の2つのオペランドに作用してオペランドと同じ型の結果を生成する演算を表します。
 * これは、BiFunctionを特殊化したもの(オペランドと結果の型がすべて同じである場合)です。
 *
 * この課題では、それぞれの機能インターフェースについて1つの例を考えます。
 * この目的のために、それぞれの組み込み機能インターフェースについて、問題を思いつき、
 * 機能インターフェースを使用して解決できる1,2行の問題記述を書きます。
 */

// Using BinaryOperator, write a method which takes 2 numbers. Print a multiplied number by them.

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> adder = (n1, n2) -> n1 * n2;

        System.out.println(adder.apply(64, 23));
    }

}
