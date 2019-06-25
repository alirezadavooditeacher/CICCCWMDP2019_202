/**
 *
 */
package assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author miyamotoatsushi
 * implement problem2
 */
public class Problem2 {

    /**
     * find distinct number
     * @param numberList integer number list
     * @return list which is only including distinct number
     */
    public static List<Integer> checkDistinctNumber(List<Integer> numberList) {
        List<Integer> distinctlist = new ArrayList<>();

        for (int a : numberList) {
            int count = 0;
            for (int n : numberList) {
                if (a == n) {
                    count++;
                }
            }
            if (count < 2) {
                distinctlist.add(a);
            }

        }
        System.out.println(numberList);
        return distinctlist;

    }
}
