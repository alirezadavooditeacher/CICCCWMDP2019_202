import java.util.ArrayList;

/**
 * Design and implement a Java class with a static method which receives two input
 * parameters 1) a list of integer numbers and 2) a number. The method will find any
 * occurrence of the given input number in the list and remove the number from the list and
 * finally will return the new list.
 */
public class Problem8 {
    public static ArrayList<Integer> removeNumber(ArrayList<Integer> integers, int subject) {
        ArrayList<Integer> removed = new ArrayList<>();
        for (int number : integers) {
            if (number != subject) {
                removed.add(number);
            }
        }

        return removed;
    }
}
