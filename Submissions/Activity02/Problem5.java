package Activity02;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a Java class with an instance method which has no input parameter but return a
 * dictionary. The method let’s the user enter names as long as the user enter 0. The user can
 * enter a same name over and over. At the end the method will print and return a dictionary
 * which shows all the name the user has entered and how many times each name is
 * repeated.
 */
public class Problem5 {

    public HashMap<String, Integer> printNamesAndCounts() {

        HashMap<String, Integer> names = new HashMap<>();
        while (true) {
            System.out.print("input name: ");
            Scanner reader = new Scanner(System.in);
            String name = reader.nextLine();
            if (name.equals("0")) {
                break;
            }

            if (!names.containsKey(name)) {
                names.put(name, 1);

            } else {
                int count = names.get(name);
                names.put(name, count + 1);
            }
        }

        System.out.println(names);

        return names;
    }

}
