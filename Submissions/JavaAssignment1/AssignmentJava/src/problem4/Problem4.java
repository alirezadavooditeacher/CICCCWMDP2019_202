package problem4;

import java.util.Scanner;

public class Problem4 {

    private static int readInput() {
        System.out.println("Enter an input: ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        //scanner.close();
        return number;
    }

    //public interface of this class
    public static void calculateSum() {
        int number = Problem4.readInput();
        int sum = 0;
        while (number > 0) {
            sum = sum + number;
            number = Problem4.readInput();
        }
            System.out.println("The sum of the numbers is: " + sum);
    }

}
