package Activity02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Write a Java class with at least one static method which receives a list of integer which
 * may contains repeated numbers. The method will removes the repeated numbers and
 * keeps the distinct number. The method should return the list of distinct numbers.
 *
 * The program should print the original list as well as the list of distinct numbers.
 */
public class Problem2 {

    public static ArrayList<Integer> getDistinctNumbers(ArrayList<Integer> numbers) {

        System.out.println(numbers.toString());

        HashMap<Integer, Integer> map = Problem0.getCountsOfNumbers(numbers);

        for (Iterator<Integer> i = map.keySet().iterator(); i.hasNext();) {
            int key = i.next();
            if (map.get(key) >= 2) {
                i.remove();
            }
        }

        ArrayList<Integer> array = new ArrayList<>(map.keySet());

        System.out.println(array);

        return array;
    }

}
