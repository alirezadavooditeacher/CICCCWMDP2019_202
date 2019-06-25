package Activity02;

import java.util.ArrayList;

/**
 * Define and implement a Java class with a static method which does linear search. This
 * function receives two input parameters, one is a list of integers and the other one is a
 * number to search for. The method returns -1 if the number (the second parameter of the
 * function) does not exist in the list or return the index of the number if the number exists
 * in the list.
 * o If there are more than one occurrence of the number, the function will return the
 * index of the first occurrence
 */

public class Problem7 {

    public static int linearSearch(ArrayList<Integer> numList, int number) {
        int length = numList.size();
        for (int i = 0; i < length; i++) {
            if (number == numList.get(i)) {
                return i;
            }
        }

        return -1;
    }

}
