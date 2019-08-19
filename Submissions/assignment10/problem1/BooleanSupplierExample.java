//package assignment10.problem1;
//
///**
// * BooleanSupplier represents a supplier of boolean-valued results.
// *
// * boolean値の結果のサプライヤを表します。これは、Supplierに対して、
// * booleanを生成するプリミティブ特殊化を行ったものです。
// * サプライヤを呼び出すたびに新しい(異なる)結果が返される必要はありません。
// *
// * これは、getAsBoolean()を関数メソッドに持つ関数型インタフェースです。
// *
// * BooleanSupplierインタフェースは、Javaで関数型プログラミングを実装するために、
// * Java 8以降導入されているjava.util.functionパッケージの一部です。
// * 引数を取らずにブール値を生成する関数を表します。
// *
// * BooleanSupplier型のオブジェクトに割り当てられたラムダ式は、
// * そのgetAsBoolean（）を定義するために使用され、最終的にその引数に指定された操作を適用します。
// * Supplier <Boolean>型のオブジェクトを使用するのと似ています。
// */
//
////???
//
//import java.util.function.BooleanSupplier;
//
//public class BooleanSupplierExample {
//
//    public static void main(String[] args) {
//        BooleanSupplier bs = () -> true;
//
//        int x = 0, y = 1;
//        bs = () -> x > y;
//        System.out.println(bs.getAsBoolean());
//    }
//
//}
