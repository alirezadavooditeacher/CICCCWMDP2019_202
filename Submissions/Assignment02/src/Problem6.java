import java.util.HashSet;

/**
 * Write a Java class with an instance method which has no input parameter but return a dictionary. The method let’s
 * the user enter names as long as the user enter 0. The user can enter a same name over and over. At the end the
 * method will print and return a dictionary which shows all the name the user has entered and how many times each name
 * is repeated.
 */
public class Problem6 {
    private HashSet<Integer> numbers = new HashSet<>();

    public int main() {
        int total = 0;
        while (true) {
            int number = Util.askInteger();
            if (number == 0) {
                break;
            }
            if (numbers.contains(number)) {
                System.out.println("You already entered it.");
                continue;
            }

            numbers.add(number);
            total += number;
        }

        return total;
    }
}
