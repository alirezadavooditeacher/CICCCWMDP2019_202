package assignment10.problem1;

import java.util.function.LongConsumer;

/**
 * LongConsumer represents an operation that accepts a single long-valued argument and returns no result.
 * This is the primitive type specialization of Consumer for long.
 *
 * 単一のlong値引数を受け取って結果を返さないオペレーションを表します。
 * これは、Consumerに対してプリミティブ型特殊化(long向け)を行ったものです。LongConsumerは他のほとんどの関数型インタフェースと異なり、副作用を介して動作することを期待されます。
 * これは、accept(long)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a number then print the number divided by 123 by using LongConsumer.

public class LongConsumerExample {

    public static void main(String[] args) {

        LongConsumer lc = num -> System.out.println(num / 123);
        lc.accept(369);

    }

}
