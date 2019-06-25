import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Implement a Java class called Problem0 with at least one instance method which receives an ArrayList of integer as
 * its input parameter. The array might have repeated numbers. The method return the number that is repeated the most.
 * Make this assumption that there is only one number which is repeated the most.
 */
public class Problem0 {
    private ArrayList<Integer> numbers;

    public Problem0 (ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public int findMaxRepeatedNumber() {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (Integer n: numbers) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }

        Integer theNumber = 0;
        Integer max = 0;

        for (Map.Entry<Integer, Integer> item : counter.entrySet()) {
            if (item.getValue() > max) {
                max =item.getValue();
                theNumber = item.getKey();
            }
        }

        return theNumber;
    }
}
