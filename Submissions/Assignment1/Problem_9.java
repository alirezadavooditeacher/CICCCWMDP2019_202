package problems;

import java.util.Scanner;

public class Problem_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;

        System.out.println("numA:");
        A = scanner.nextInt();
        System.out.println("numB:");
        B = scanner.nextInt();

        printNumbersDivisibleBy3And5(A, B);
        printNumbersDivisibleEitherTo6Or7(A, B);
        printNumbersNotDivisibleBy3(A, B);

    }


    public static void printNumbersDivisibleBy3And5(int A, int B) {

        System.out.println("printNumbersDivisibleBy3And5");

        for (int i = A + 1; i <= B - 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ",");
            }

        }
        System.out.println();
    }

    public static void printNumbersDivisibleEitherTo6Or7(int A, int B) {
        System.out.println("printNumbersDivisibleEitherTo6Or7");
        for (int i = A; i < B; i++) {
            if (i % 6 == 0 || i % 7 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
    }

    public static void printNumbersNotDivisibleBy3(int A, int B) {
        System.out.println("printNumbersNotDivisibleBy3");

        for (int i = A; i <= B; i++) {
            if (i % 3 != 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
    }

}
