package problems;

import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, format;

        System.out.println("num:");
        num = scanner.nextInt();

        System.out.println("format:");
        format = scanner.nextInt();

        if (format == 1) {
            shape1(num);
        } else if (format == 2) {
            shape2(num);
        } else shape3(num);


    }

    public static void shape1(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num - i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void shape2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++)
                if (i <= j)
                    System.out.print("*");
            System.out.println();
        }
    }

    public static void shape3(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++)
                if (i >= j)
                    System.out.print("*");
            System.out.println();
        }
    }


}
