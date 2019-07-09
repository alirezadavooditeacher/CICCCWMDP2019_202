package problem14;

import java.util.Scanner;

public class Problem14 {
    private static String inputString(){
        Scanner scanner14 = new Scanner( System.in );
        System.out.println( "Please enter a word :" );
        String input14 = scanner14.nextLine();

        return input14;
    }

    public static void reverseWord(){
        String input14 = inputString();
        StringBuffer reverseWord = new StringBuffer(input14);
        reverseWord.reverse();

        int count = 0;
        for (int i = 0; i < input14.length(); i++) {
            if (input14.charAt(i) == reverseWord.charAt(i)) {
                count++;
            }
        }

        if (count == input14.length()) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
