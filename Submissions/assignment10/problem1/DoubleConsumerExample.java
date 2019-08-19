package assignment10.problem1;


/**
 * DoubleConsumer functional interface represents an operation that accepts a single double-valued argument and
 * returns no result. This is the primitive type specialization of Consumer for double.
 *
 * 単一のdouble値引数を受け取って結果を返さないオペレーションを表します。
 * これは、Consumerに対してプリミティブ型特殊化(double向け)を行ったものです。
 * DoubleConsumerは他のほとんどの関数型インタフェースと異なり、副作用を介して動作することを期待されます。
 * これは、accept(double)を関数メソッドに持つ関数型インタフェースです。
 */

// Receive a double number then the number multiply 10 and print the answer

import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {

    public static void main(String[] args){

        DoubleConsumer dc = num -> System.out.println(num * 10);

        dc.accept(0.26);

    }
}
