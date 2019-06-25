/**
 *
 */
package assignment;

import java.util.List;

/**
 * @author miyamotoatsushi
 * implement problem3
 */
public class Problem3 {

    /**
     * find number that is repeated only once
     * @param numberList integer number list
     * @return number which is repeated only once
     */
    public static Integer returnDistinctNumber(List<Integer> numberList) {
        for (int a : numberList) {
            int count = 0;
            for (int n : numberList) {
                if (a == n) {
                    count ++;
                }
            }
            if (count == 2) {
                return a;
            }
        }
        return null;
    }


}
