/**
 * Problem10
 * Write a function which receives a number in base 10 (any positive, whole number, like
 * 452), and convert it to binary and prints the results. (Please research yourself on how to
 * convert a number in base 10 to a binary number).
 */
public class Problem10 {
    /**
     * Convert base 10 number to base 2 string
     */
    public static String base10to2(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuffer bin = new StringBuffer();
        while (number > 0) {
            bin.insert(0, number % 2);
            number = number / 2;
        }

        return bin.toString();
    }
}
