package assignment10.problem1;

import java.util.function.UnaryOperator;

/**
 * 単一のオペランドに作用してオペランドと同じ型の結果を生成する演算を表します。
 * これは、Functionを特殊化したもの(オペランドと結果の型が同じである場合)です。
 */

public class UnaryOperatorExample {

    public static void main(String[] args){

        UnaryOperator<String> uo = (s) -> s.toUpperCase();

        System.out.println(uo.apply("otukaresama"));
    }

}
