package assignment10.problem1;

import java.util.function.Supplier;

/**
 * 結果のサプライヤを表します。
 * サプライヤを呼び出すたびに新しい(異なる)結果が返される必要はありません。
 *
 * これは、get()を関数メソッドに持つ関数型インタフェースです
 *
 */

public class SupplierExample {

    public static void main(String[] args){

        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());

    }


}
