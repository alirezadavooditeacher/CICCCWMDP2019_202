package assignment10.problem1;

import java.util.function.LongToIntFunction;

/**
 * 1つのlong値引数を受け取ってint値の結果を生成する関数を表します。これは、Functionに対してlongからintへのプリミティブ特殊化を行ったものです。
 * これは、applyAsInt(long)を関数メソッドに持つ関数型インタフェースです。
 *
 */

public class LongToIntFunctionExample {

    public static void main(String[] args) {
        LongToIntFunction ltif = num -> (int)num * 1234567;
        System.out.println(ltif.applyAsInt(2));

    }
}
