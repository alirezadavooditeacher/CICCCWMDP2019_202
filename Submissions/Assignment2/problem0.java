package assignment2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;

/**
 * Implement a Java class called Problem0 with at least one instance method which receives
 * an ArrayList of integer as its input parameter. The array might have repeated numbers.
 * The method return the number that is repeated the most. Make this assumption that
 * there is only one number which is repeated the most.
 *
 * 入力パラメータとしてintegerのArrayListを受け取る少なくとも1つのインスタンスメソッドを使用して、
 * Problem0というJavaクラスを実装します。 配列には繰り返し番号があります。
 * このメソッドは、最も繰り返されている数を返します。
 * 最も頻繁に繰り返される数が1つだけであるというこの仮定を立てます。
 */
public class problem0 {

    public static void main(String[] args) {
        // List<Integer> numlist = Arrays.asList(1,3,1,5,1,6,2);
        // Arrays.asListで要素を複数読み込みその後ArrayListに変換しないといけない
        List<Integer> numlist = new ArrayList<Integer>(Arrays.asList(9,3,1,5,1,6,2,1));
        // 1 is the most repeated number
        System.out.println(getNumbersAndReturnTheMostRepeatedNumber((ArrayList<Integer>) numlist));
    }

    public static Entry<Integer, Integer> getNumbersAndReturnTheMostRepeatedNumber(ArrayList<Integer> numlist) {
        int cnt = 0;
        HashMap<Integer, Integer> numbercnt = new HashMap<Integer, Integer>();
        for (int i = 0; i < numlist.size(); i++) {
            for (int j = 0; j < numlist.size(); j++) {
                if (numlist.get(i) == numlist.get(j)) {
                    cnt +=1;
                }
            }
            // if index of numlist is not in numbercnt(map), add the index of numlist to numbercnt
            if (!(numbercnt.containsKey(numlist.get(i)))) {
                numbercnt.put(numlist.get(i), cnt);
            }
            cnt = 0;
        }

        // find the most repeated number in numbercnt(map)
        Entry<Integer,Integer> maxEntry = null;

        for (Entry<Integer,Integer> entry : numbercnt.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }

}
