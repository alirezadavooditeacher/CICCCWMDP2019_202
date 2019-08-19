package assignment10.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import  java.util.function.BiConsumer;


/**
 * BiConsumer represents an operation that accepts two input arguments and returns no result.
 * BiConsumerは、2つの入力引数を受け取り、結果を返さない操作を表します。
 *
 * この課題では、それぞれの機能インターフェースについて1つの例を考えます。
 * この目的のために、それぞれの組み込み機能インターフェースについて、問題を思いつき、
 * 機能インターフェースを使用して解決できる1,2行の問題記述を書きます。
 */


// Using BiCosumer, write a method which takes two array lists of integer and print which total number begger is.


public class BiCosumerExample {
    public static void main(String[] arge) {
        BiConsumer<ArrayList<Integer>, ArrayList<Integer>> biConsumer = (listA, listB) -> {
            int suma = 0;
            int sumb = 0;

            for(int i = 0; i < listA.size(); i++){
                suma += listA.get(i);
            }
            for(int j = 0; j < listB.size(); j++){
                sumb += listB.get(j);
            }

            System.out.println("Sum of A is "+ suma +"\nSum of B is "+ sumb);

            if (suma > sumb){
                System.out.println("listA is bigger.");
            } else {
                System.out.println("listB is bigger.");
            }
        };

        ArrayList<Integer> la = new ArrayList<>(Arrays.asList(4,6,2,6,1,3));
        ArrayList<Integer> lb = new ArrayList<>(Arrays.asList(2,1,3,7,1,9));

        biConsumer.accept(la, lb);
    }

}
