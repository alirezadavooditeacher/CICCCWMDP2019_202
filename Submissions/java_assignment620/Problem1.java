/**
 *
 */
package assignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miyamotoatsushi
 *  implement problem1
 */
public class Problem1 {

    /**
     * print repeated number
     * @param numberList integer number list
     */
    public static void ReturnRepeatNumber(List<Integer> numberList) {

        ArrayList<Integer>checkList = new ArrayList<Integer>();

        for (int a : numberList) {
            int count = 0;
            for (int n : numberList) {
                if (a == n) {
                    count++;
                }
            }

            if (count > 0 && !checkList.contains(a)) {
                System.out.println(String.format("%d : %d", a, count));
            }
            checkList.add(a);

        }

    }


}
