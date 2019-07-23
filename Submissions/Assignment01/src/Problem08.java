/**
 * Problem8
 * Design a function which reads a number from input (like 123). Only whole numbers are
 * valid (floating points are not valid). The number entered by the user should not be divisible
 * by 10 and if the user enters a number that is divisible by 10 (like 560), it is considered
 * invalid and the application should keep asking until the user enters a valid input. Once the
 * user enters a valid input, the program calculate the reverse of the number (for 153, the
 * reverse is 351) and prints the result.
 */
public class Problem08 {
    /**
     * Ask user to input number and print the reversed number
     */
    public static void main() {
        int number;

        while (true) {
            number = Util.askInteger();
            if (number % 10 != 0) {
                break;
            }
        }
        System.out.println(reverseNumber(number));
    }

    /**
     * Return reversed number
     */
    private static int reverseNumber(int number) {
        int counter = Util.countDigits(number) - 1;
        int reversed = 0;

        while (number > 0) {
            reversed += number % 10 * Math.pow(10, counter);
            number = number / 10;
            counter = counter - 1;
        }

        return reversed;
    }
}
