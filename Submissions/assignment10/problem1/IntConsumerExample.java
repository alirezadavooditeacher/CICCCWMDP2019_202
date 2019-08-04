package assignment10.problem1;

import java.util.function.IntConsumer;

/**
 * IntConsumer represents an operation that accepts a single int-valued argument and returns no result.
 * This is the primitive type specialization of Consumer for int.
 *
 * 単一のint値引数を受け取って結果を返さないオペレーションを表します。
 * これは、Consumerに対してプリミティブ型特殊化(int向け)を行ったものです。
 * IntConsumerは他のほとんどの関数型インタフェースと異なり、副作用を介して動作することを期待されます。
 * これは、accept(int)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a number then return 4 time that number by IntConsumer.

public class IntConsumerExample {

    public static void main(String[] args) {
        IntConsumer ic =(num) -> System.out.println(num*4);

        ic.accept(294);
    }

}
