package problems;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numA, numB;

        System.out.println("numA:");
        numA = scanner.nextInt();
        System.out.println("numB:");
        numB = scanner.nextInt();

        System.out.println("quotient: " + calculateTheQuotient(numA, numB));
    }

    private static int calculateTheQuotient(double numA, double numB) {
        int count = 0;
        while (numA > numB && numB != 0) {
            numA = numA - numB;
            count = count + 1;
        } return count;
    }

}
