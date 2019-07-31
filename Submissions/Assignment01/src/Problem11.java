/**
 * Problem11
 * Write a function which keeps asking the user to enter numbers (positive or negative) until
 * the user enters an invalid input. (An invalid input is an input which includes at least one
 * alphabet, like 123d4). The program should print the Max and Min of the numbers the user
 * had entered as well as the distance between the Max and Min. (Remember to calculate the
 * absolute distance).
 */
public class Problem11 {
    /**
     * Ask user to input numbers and print summary of the numbers
     */
    public static void main() {
        Integer min = null;
        Integer max = null;

        while (true) {
            String input = Util.askString();
            if (!Util.isInteger(input)) {
                break;
            }
            int number = Integer.parseInt(input, 10);
            min = min != null ? Math.min(min, number) : number;
            max = max != null ? Math.max(max, number) : number;
        }

        if (min == null) {
            System.out.println("You did not provide numbers");
            return;
        }

        summary(min, max);
    }

    /**
     * Print max, minimum numbers and the distance of it
     */
    private static void summary(int min, int max) {
        System.out.format("The minimum number is %s\n", min);
        System.out.format("The max number is %s\n" , max);
        System.out.format("The distance of the two is %s\n", max - min);
    }
}
