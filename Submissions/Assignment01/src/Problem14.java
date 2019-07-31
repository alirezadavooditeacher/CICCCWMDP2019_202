/**
 * Problem 14
 * Write a function which receives a string as input and does the following:
 * • Check whether the input string and the its reverse is the same (like BaBa),
 * if yes it return 1 and if false, it returns 0 with a proper message. It considers
 * case-sensitivity which means (Baba and BaBa are not the same)
 */
public class Problem14 {
    /**
     * Check if the string is palindrome
     */
    public static int isPalindrome(String txt) {
        StringBuffer reversed = new StringBuffer();
        for (int i = 0; i < txt.length(); i++) {
            reversed.insert(0, txt.charAt(i));
        }
        System.out.println(reversed.toString());
        boolean is = reversed.toString().equals(txt);
        if (is) {
            System.out.println("String is palindrome :)");
            return 1;
        }
        System.out.println("String is not palindrome :(");
        return 0;
    }
}
