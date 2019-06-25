import java.util.HashSet;
import java.util.List;

/**
 * - Write a Java class with an instance method which receives a list of integers. From each number in the list has
 * been repeated exactly 2 times in the list except one number that is repeated only once. The method should return
 * the number that is repeated only once.
 */
public class Problem3 {
    private List<Integer> numbers;

    public Problem3 (List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Integer findRepeatedNumbers () throws Exception {
        HashSet<Integer> set = new HashSet<>();
        for (Integer n: numbers) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }

        for (Integer n: set) {
            return n;
        }

        throw new Exception("The list of numbers does not satisfy the criteria");
    }
}
