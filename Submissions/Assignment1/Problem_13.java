package problems;

import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;
        System.out.println("A:");
        A = scanner.nextInt();

        printMultipicationTable(A);
    }



    private static void printLine(int A) {
        System.out.printf("%6s", "x");
        for(int i=1; i<=A; i++) {
            System.out.printf("%6s", String.valueOf(i));
        }
    }


    public static void printMultipicationTable(int A) {
        printLine(A);

        System.out.println();
        for(int i=1; i<=A; i++) {
            System.out.printf("%6s", String.valueOf(i));
            for(int j=1; j<=A; j++) {
                System.out.printf("%6s", String.valueOf(i*j));
            }
            System.out.println();
        }
    }
}
