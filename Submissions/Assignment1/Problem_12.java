package problems;

import java.util.Scanner;

public class Problem_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, result;
        System.out.println("A:");
        A = scanner.nextInt();
        System.out.println("B:");
        B = scanner.nextInt();

        result = findTheTippingPoint(A, B);
        System.out.println("The result is " + result);


    }

    private static int f1(int A, int x) {
        return Problem_12.power(A, x);
    }

    private static int f2(int x, int B) {
        return Problem_12.power(x, B);
    }

    private static int power(int base, int exp) {

        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        return result;
    }

    public static int findTheTippingPoint(int A, int B) {
        int x = 3;
        while (f2(x, B) > f1(A, x)) {
            x = x + 1;
        }

        return x;
    }
}

