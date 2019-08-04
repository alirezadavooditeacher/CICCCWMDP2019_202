package assignment10.problem1;

import java.util.function.IntSupplier;

/**
 * IntSupplier represents a supplier of int-valued results.
 * This is the int-producing primitive specialization of Supplier.
 *
 * int値の結果のサプライヤを表します。これは、Supplierに対して、
 * intを生成するプリミティブ特殊化を行ったものです。
 * サプライヤを呼び出すたびに異なる結果が返される必要はありません。
 *
 * これは、getAsInt()を関数メソッドに持つ関数型インタフェースです。
 */

// ???

public class IntSupplierExample {

    public static void main(String[] args) {

        int num1 = 23;
        int num2 = 13;
        IntSupplier i = () -> num1 * num2;
        System.out.println(i.getAsInt());

    }


}
