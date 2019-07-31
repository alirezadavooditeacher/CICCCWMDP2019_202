import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
    /**
     * Ask the user to input a Integer
     */
    public static int askInteger() {
        return askInteger("Input a number");
    }

    /**
     * Ask the user to input a Integer
     */
    public static int askInteger(String message) {
        System.out.print(message);
        System.out.println(": ");
        try {
            Scanner in = new Scanner(System.in);
            return in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("This is not a number :(");
            return askInteger(message);
        }
    }

    /**
     * Ask the user to input a String
     */
    public static String askString() {
        return askString("Input something");
    }

    /**
     * Ask the user to input a String
     */
    public static String askString(String message) {
        System.out.print(message);
        System.out.println(": ");
        try {
            Scanner in = new Scanner(System.in);
            return in.next();
        } catch (InputMismatchException e) {
            System.out.println("This is not a number :(");
            return askString(message);
        }
    }

    /**
     * Count the number of digits
     */
    public static int countDigits(int number) {
        int digits = 0;
        while (number > 0) {
            digits++;
            number = number / 10;
        }

        return digits;
    }

    /**
     * Repeat `original` `count` times
     */
    public static String repeatString(String original, int count) {
        StringBuffer repeated = new StringBuffer();
        for (int i = 0; i < count; i++) {
            repeated.append(original);
        }
        return repeated.toString();
    }

    /**
     * Check if the string express integer
     */
    public static boolean isInteger(String maybeInteger) {
        try {
            Integer.parseInt(maybeInteger, 10);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
