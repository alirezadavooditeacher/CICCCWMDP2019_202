package problems;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.println("num:");
        num = scanner.nextInt();

        System.out.print("next prime num is : " + nextprime(num));
    }

    private static int nextprime(int num) {
        num = num + 1;
        while (checkPrime(num) == false) {
            num = num + 1;
        }
        return num;
    }

    public static boolean checkPrime(int num) {
        boolean boolVariable = true;
        if (num < 2) {
            boolVariable = false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                boolVariable = false;
            }
        }
        return boolVariable;
    }
}
