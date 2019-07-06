package problems;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.println("num:");
        num = scanner.nextInt();

        System.out.println(numSum(num));


    }

    private static int numSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }

}
