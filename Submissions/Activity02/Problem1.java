package Activity02;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Implement a Java class called Problem1 with at least one static method which receives an
 * ArrayList of integer as its input parameter. The array might have repeated numbers. The
 * method will find all numbers that are repeated more than once and print them in the
 * following format:
 * - Example:
 * 4 : 2
 * 10: 4
 * 123: 2
 */
public class Problem1 {

    public static int printNumbers(ArrayList<Integer> numbers) {

        HashMap<Integer, Integer> map = Problem0.getCountsOfNumbers(numbers);

        int keyNumber = 0;
        for (Integer key: map.keySet()) {
            int count = map.get(key);
            if (count >= 2) {
                System.out.println(key + " : " + count);
            }
        }

        return keyNumber;
    }

}
