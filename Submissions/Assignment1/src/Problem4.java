import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    // Problem4
    public void findResultNumber() {
        List<Integer> arr = new ArrayList<Integer>();
        int n = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter numbers : ");
            try {
                n = in.nextInt();
                if (n == 0) {
                    break;
                }

                sum += n;
            } catch (Exception e) {
            }

            arr.add(n);
        }

        int length = arr.size();
        double average = sum/length;
        double standardDeviation = 0.0;

        for(double number: arr) {
            standardDeviation += Math.pow(number - average, 2);
        }

        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + average);
        System.out.println("Standard deviation is : " + Math.sqrt(standardDeviation/length));
    }
    public static void main(String[] args) {
        Problem4 p4 = new Problem4();

        // Test Problem4
        p4.findResultNumber();

    }
}
