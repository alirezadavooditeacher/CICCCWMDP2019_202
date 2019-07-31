/**
 * Problem9
 * - Write a function which receives two number A and B as its parameters:
 * - First prints all numbers between A and B (A and B not included), which are divisible to
 * both 3 and 5.
 * - Then prints all numbers between A and B (A included by B not included), which are
 * divisible by either 6 or 7.
 * - Finally prints all numbers between A and B (A and B both included), which are not
 * divisible by 3.
 * - Hint: Design a function for each sub problem and then call them inside another function.
 */
public class Problem09 {
    /**
     * Ask user to input numbers and print numbers in the range
     */
    public static void main() {
        int number1 = Util.askInteger();
        int number2 = Util.askInteger();
        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);

        System.out.format("Numbers divisible by both 3 and 5 between %d, %d\n", min, max);
        printDivisible3and5(min, max);
        System.out.format("Numbers divisible by either 6 or 7 between %d, %d\n", min, max);
        printDivisible6or7(min, max);
        System.out.format("Numbers not divisible by 3 between %d, %d\n", min, max);
        printNotDivisible3(min, max);
    }

    /**
     * Print the numbers which is divisible by 3 and 5
     */
    private static void printDivisible3and5(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Print the numbers which is divisible by 6 or 7
     */
    private static void printDivisible6or7(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 6 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Print the numbers which is not divisible by 3
     */
    private static void printNotDivisible3(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}
