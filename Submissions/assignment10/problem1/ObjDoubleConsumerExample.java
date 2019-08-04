package assignment10.problem1;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjDoubleConsumer;

/**
 * ObjDoubleConsumer represents an operation that accepts an object-valued and a double-valued argument,
 * and returns no result. This is the reference, double specialization of BiConsumer.
 *
 * オブジェクト値とdouble値の引数を受け取って結果を返さないオペレーションを表します。
 * これは、BiConsumerに対して(reference, double)特殊化を行ったものです。
 * ObjDoubleConsumerは他のほとんどの関数型インタフェースと異なり、副作用を介して動作することを期待されます。
 * これは、accept(Object, double)を関数メソッドに持つ関数型インタフェースです。
 */

public class ObjDoubleConsumerExample {

    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        ObjDoubleConsumer<List<Integer>> odc = (list, num) -> {
            list.stream().forEach(x -> System.out.println(x / num));
        };
        odc.accept(numList, 2.0);

    }

}
