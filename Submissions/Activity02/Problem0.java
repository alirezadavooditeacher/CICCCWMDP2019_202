package Activity02;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Implement a Java class called Problem0 with at least one instance method which receives
 * an ArrayList of integer as its input parameter. The array might have repeated numbers.
 * The method return the number that is repeated the most. Make this assumption that there
 * is only one number which is repeated the most.
 */
public class Problem0 {

    public int getMostRepeatedNumber(ArrayList<Integer> numbers) {

        HashMap<Integer, Integer> map = getCountsOfNumbers(numbers);

        int max = 0;
        int keyNumber = 0;
        for (Integer key: map.keySet()) {
            int count = map.get(key);
            if (max < count) {
                max = count;
                keyNumber = (int)key;
            }
        }

        return keyNumber;
    }

    public static HashMap<Integer, Integer> getCountsOfNumbers(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer number: numbers) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);

            } else {
                map.put(number, 1);
            }
        }

        return map;
    }

}
