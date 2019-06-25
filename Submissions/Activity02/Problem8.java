package Activity02;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Design and implement a Java class with a static method which receives two input
 * parameters 1) a list of integer numbers and 2) a number. The method will find any
 * occurrence of the given input number in the list and remove the number from the list and
 * finally will return the new list.
 */

public class Problem8 {

    public static ArrayList<Integer> removeElementsInArray(ArrayList<Integer> numList, int number) {

//        ArrayList<Integer> newList = new ArrayList<>();

        if (numList.indexOf(number) != -1) {
            ArrayList<Integer> array = new ArrayList<>(numList.indexOf(number));
            array.add(number);
            numList.removeAll(array);
        }

        return numList;

//        int length = numList.size();
//        for (int i = 0; i < length; i++ ) {
//            if (number == numList.get(i)) {
//                return i;
//            }
//        }
//
//        for (int i = 0; i < length; i++) {
//        }
//
//        return -1;
    }

}
