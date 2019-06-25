package assignment2;

import java.util.*;
/**
 * Implement a Java class called Problem1 with at least one static method which
 * receives an ArrayList of integer as its input parameter. The array might have
 * repeated numbers. The method will find all numbers that are repeated more than
 * once and print them in the following format:
 * Example:
 * 4 : 2
 * 10 : 4
 * 123 : 2
 */
public class problem1 {

    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,4,4,5)); // This answer is 1:2:4
        // 1 is the most repeated number
        System.out.println(getNumbersAndCheckRepeatedNumbers((ArrayList<Integer>) numlist));
    }

    public static String getNumbersAndCheckRepeatedNumbers(ArrayList<Integer> numlist) {
        int cnt = -1;
        List<Integer> numcnt = new ArrayList<Integer>();
        List<Integer>  numbers = new ArrayList<Integer>();
        for (int i = 0; i < numlist.size(); i++) {
            if (!(numbers.contains(numlist.get(i)))) {
                numbers.add(numlist.get(i));
                for (int j = 0; j < numlist.size(); j++) {
                    if (numlist.get(i) == numlist.get(j)) {
                        cnt += 1;
                    }
                }
                numcnt.add(cnt);
                cnt = -1;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int k = 0; k < numcnt.size(); k++) {
            if (numcnt.get(k) > 0) {
                ans.add(numbers.get(k));
            }
        }

        for (int l = 0; l < ans.size() -1; l++) {
            System.out.print(ans.get(l) + ":");
        }
        System.out.print(ans.get(ans.size() -1));
        return "";
    }
}
