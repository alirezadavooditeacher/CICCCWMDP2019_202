package assignment2;

import java.util.*;

/**
 * Write a Java class with at least one static method which receives a list of integer which
 * may contains repeated numbers. The method will removes the repeated numbers and
 * keeps the distinct number. The method should return the list of distinct numbers.
 * The program should print the original list as well as the list of distinct numbers.
 *
 * 繰り返し数を含む可能性のある整数のリストを受け取る少なくとも1つの静的メソッドを持つJavaクラスを作成します。
 * このメソッドは、繰り返し番号を削除し、固有の番号を保持します。 メソッドは、固有の番号のリストを返す必要があります。
 * プログラムは元のリストと個別の番号のリストを印刷する必要があります。
 */

public class problem2 {

    public static void main(String[] args){
        List<Integer> numlist = new ArrayList<Integer>(Arrays.asList(3,2,1,7,2,3,4,8)); // This answer is {1,7,4,8}
        System.out.println(getNumbersAndPrintNoRepeatedNumbers((ArrayList<Integer>) numlist));

    }

    public static String getNumbersAndPrintNoRepeatedNumbers(ArrayList<Integer> numlist) {
        int cnt = -1;
        List<Integer> numcnt = new ArrayList<Integer>();
        List<Integer>  numbers = new ArrayList<Integer>();
        for (int i = 0; i < numlist.size(); i++) {
            for (int j = 0; j < numlist.size(); j++) {
                if (numlist.get(i) == numlist.get(j)) {
                    cnt += 1;
                }
            }
            if (cnt == 0) {
                numbers.add(numlist.get(i));
            }
            cnt = -1;
        }
        List<Integer> ans = new ArrayList<Integer>();

        System.out.println("Distinct Numbers: " + numbers);
        System.out.print("Original Numbers: " + numlist);
        return "";
    }

}
