import java.util.ArrayList;

/**
 * Problem4
 *
 * Design a function which keeps receiving a number from input and add the numbers
 * together. The application keeps doing it until the user enter 0. Then the application will
 * stop and return the total sum, average and standard deviation of the numbers the user had
 * entered.
 */

public class Problem04 {
    /**
     * Ask numbers and return total, mean, stdev as an array
     */
    public static double[] askNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = Util.askInteger();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        double[] result = {
            sum(numbers),
            average(numbers),
            stdev(numbers)
        };

        return result;
    }

    /**
     * Calculate total sum of the numbers
     */
    private static int sum(ArrayList<Integer> numbers) {
        int total = 0;
        for (Integer num: numbers) {
            total += num;
        }
        return total;
    }

    /**
     * Calculate average of the numbers
     */
    private static double average(ArrayList<Integer> numbers) {
        double total = sum(numbers);
        return total / numbers.size();
    }

    /**
     * Calculate standard deviation of the numbers
     */
    private static double stdev(ArrayList<Integer> numbers) {
        double mean = average(numbers);
        double standardDeviation = 0.0;

        for(double num: numbers) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / numbers.size());
    }
}
