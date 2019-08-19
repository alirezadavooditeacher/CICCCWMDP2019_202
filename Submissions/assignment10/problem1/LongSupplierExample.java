package assignment10.problem1;

/**
 * LongSupplier represents a supplier of long-valued results.
 * This is the long-producing primitive specialization of Supplier.
 *
 * long値の結果のサプライヤを表します。これは、Supplierに対して、longを生成するプリミティブ特殊化を行ったものです。
 * サプライヤを呼び出すたびに異なる結果が返される必要はありません。
 * これは、getAsLong()を関数メソッドに持つ関数型インタフェースです。
 */


import java.util.function.LongSupplier;

public class LongSupplierExample {

    public static void main(String[] args){

        LongSupplier ls= () -> (long)(Math.random() * Long.MAX_VALUE);

        System.out.println(ls.getAsLong());

    }


}
