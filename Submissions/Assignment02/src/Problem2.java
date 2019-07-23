import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * - Write a Java class with at least one static method which receives a list of integer which
 * may contains repeated numbers. The method will removes the repeated numbers and
 * keeps the distinct number. The method should return the list of distinct numbers.
 * - The program should print the original list as well as the list of distinct numbers.
 */
public class Problem2 {

    public static List<Integer> distinctAndPrint(List<Integer> originalNumbers) {
        List<Integer> distinct = distinctList(originalNumbers);
        System.out.print("Original Numbers: ");
        dumpList(originalNumbers);
        System.out.print("Distinct Numbers: ");
        dumpList(distinct);
        return distinct;
    }

    public static List<Integer> distinctList(List<Integer> numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer n: numbers) {
            set.add(n);
        }

        return new ArrayList<>(set);
    }

    public static void dumpList(List<Integer> numbers) {
        System.out.println(numbers);
//        for (Integer n: numbers) {
//            System.out.println(n);
//        }
    }
}
