package assignment1;

import java.util.Scanner;
/**
 * Design a function which receive a number for the input and check whether the number is
 * a  prime number or not. If it is a prime number the algorithm which return true and
 * if not the algorithm will return galse.
 *
 * 入力用の数値を受け取る関数を設計し、その数値が素数かどうかを確認します。
 * もしそれが素数なら真を返すアルゴリズム、そうでなければアルゴリズムは偽を返すでしょう。
 */

public class problem3 {
    public static void main(String[] args) {
        reciavePrimeNumber();

    }

    public static boolean reciavePrimeNumber() {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 2; i <= (num - 1); i++) {
            if (num % i == 0) {
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;
    }
}
