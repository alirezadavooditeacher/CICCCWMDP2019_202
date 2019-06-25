/**
 *
 */
package assignment;

import java.util.List;

/**
 * @author miyamotoatsushi
 *  impliment problem0
 */
public class Problem0 {

    /**
     *
     * @param numberList
     * @return
     */
    public static Integer ReturnRepeatNumber(List<Integer> numberList) {

        int maxRepateCount = 0;
        int maxRepateNumber = 0;
        for (int a : numberList) {
            int count = 0;
            for (int n : numberList) {
                if (a == n) {
                    count++;
                }
            }

            if (maxRepateCount < count) {
                maxRepateCount = count;
                maxRepateNumber = a;
            }

        }
        return maxRepateNumber;

    }

}
