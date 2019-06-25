package Activity01;

import java.util.*;

public class Problem04 {

    /**
     * calculate the total, average, standard deviation of the numbers the user had entered
     *
     * @return ArrayList<Double> following 3 numbers
     */
    public static ArrayList<Double> stdevCalculator() {

        int count = 0;
        double total = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        while (true) {
            System.out.println("input number: ");
            Scanner reader = new Scanner(System.in);
            String inputWord = reader.nextLine();
            int num = Integer.parseInt(inputWord);
            if (num == 0) {
                break;
            }
            nums.add(num);
            count += 1;
            total += num;
        }
        double average = total / count;
        ArrayList<Double> squaredDifferences = new ArrayList<>();
        for (int i: nums) {
            squaredDifferences.add(Math.pow((i - average), 2));
        }
        double sumDifference = sum(squaredDifferences);
        double stdev = Math.pow(sumDifference, 0.5);

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(total);
        numbers.add(average);
        numbers.add(stdev);

        return numbers;
    }

    /**
     * Return the sum of the element of the parameter array
     *
     * @param numbers ArrayList<Double>
     * @return double sum
     */
    private static double sum(ArrayList<Double> numbers) {
        double result = 0;
        for (double i: numbers) {
            result += i;
        }

        return result;
    }
}
