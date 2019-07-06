package problems;

import java.util.Scanner;

public class Problem_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word, reversed;
        System.out.println("numA:");

        word = scanner.next();
        reversed = reverse(word);

        boolean isEqual;
        isEqual = isStringAndReversedTheSame(word, reversed);

        System.out.println("Word is: " + word);
        System.out.println("Reverse is: " + reverse(word));
        System.out.println("is Equal?:" + isEqual);


    }


    public static String reverse(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + String.valueOf(word.charAt(i));
        }
        return reversed;
    }

    public static boolean isStringAndReversedTheSame(String word, String reversed) {

        if (word.equals(reversed)) {
            return true;
        }
        return false;
    }
}
