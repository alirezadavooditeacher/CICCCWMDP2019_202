import java.util.HashMap;

/**
 * Write a Java class with an instance method which has no input parameter but return a dictionary. The method let’s
 * the user enter names as long as the user enter 0. The user can enter a same name over and over. At the end the
 * method will print and return a dictionary which shows all the name the user has entered and how many times each name
 * is repeated.
 */
public class Problem5 {
    public HashMap<String, Integer> main() {
        HashMap<String, Integer> counter = new HashMap<>();

        while (true) {
            String maybeName = Util.askString("Enter a name");
            if (maybeName.equals("0")) {
                break;
            }

            counter.put(maybeName, counter.getOrDefault(maybeName, 0) + 1);
        }

        return counter;
    }
}
