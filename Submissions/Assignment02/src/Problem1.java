import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * - Implement a Java class called Problem1 with at least one static method which receives an ArrayList of integer as
 * its input parameter. The array might have repeated numbers. The method will find all numbers that are repeated more
 * than once and print them in the following format:
 * - Example:
 * 4:2
 * 10: 4
 * 123: 2
 */
public class Problem1 {
    public static void printRepeatedNumbers(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (Integer n: numbers) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> item : counter.entrySet()) {
            if (item.getValue() > 1) {
                System.out.format("%d: %d\n", item.getKey(), item.getValue());
            }
        }
    }
}
