/**
 * Problem5
 * Design a function which receives a number from input and print the sum of the number’s
 * digits. For instance if the number is 123 the algorithm return 6 which is the result of 1+2+3.
 */
public class Problem05 {
    /**
     * Print the sum of digits
     */
    public static void sumDigits(int number) {
        int digits = Util.countDigits(number);

        int total = 0;
        for (int i = 0; i < digits + 1; i++) {
            total += number % 10;
            number = number / 10;
        }

        System.out.println(total);
    }
}
