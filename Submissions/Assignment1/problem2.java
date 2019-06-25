package assignment1;

import java.util.Scanner;
/**
 *Design a function for an application which receive a number and a shape format (which is
 * either SHAPE1 or SHAPE2 or SHAPE3) from the input and prints a shape like this: (if the
 * input is 5)
 *
 * 入力から数値と形状フォーマット（SHAPE1、SHAPE2、またはSHAPE3のいずれか）を受け取り、
 * 次のように形状を印刷するアプリケーション用の関数を設計します。（入力が5の場合）
 *
 * - Example: input: 5 format: SHAPE1
 * *****
 *  ***
 *   *
 * - Example: input: 5 format: SHAPE2
 * *****
 * ****
 * ***
 * **
 * *
 * - Example: input: 5 format: SHAPE3
 * *
 * **
 * ***
 * ****
 * *****
 */

public class problem2 {

    public static void main(String[] args) {
        reciaveAndPrint();
    }

    public static int reciaveAndPrint() {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print("Choose a shape(1,2 or 3): ");
        int shape = scan.nextInt();

        if (shape==1) {
            int cnt = num;
            int space = 1;

            for (int i = 1; i <= cnt; i++) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
                System.out.println();
                for (int k = 1; k <= space; k++) {
                    System.out.print(" ");
                }
                space +=1;
                cnt -=1;
                num -=2;
            }
        } else if (shape==2) {
            int cnt = num;
            for (int i = 1; i <= cnt; i++) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }

                System.out.println();
                num--;
            }
        } else if (shape==3) {
            int cnt = num;
            num = 1;
            for (int i = 1; i <= cnt; i++) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }

                System.out.println();
                num +=1;
            }
        }
        return 0;
    }
}
