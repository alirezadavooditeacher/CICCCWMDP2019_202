package Activity02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Write a Java class with an instance method which receives a list of integers. From each
 * number in the list has been repeated exactly 2 times in the list except one number that is
 * repeated only once. The method should return the number that is repeated only once.
 */
public class Problem3 {

    public ArrayList<Integer> getNumberRepeatedOnly2Times(ArrayList<Integer> numbers) {

        HashMap<Integer, Integer> map = Problem0.getCountsOfNumbers(numbers);

        for (Iterator<Integer> i = map.keySet().iterator(); i.hasNext();) {
            int key = i.next();
            if (map.get(key) >= 3) {
                i.remove();
            }
        }

        return new ArrayList<>(map.keySet());
    }

}
