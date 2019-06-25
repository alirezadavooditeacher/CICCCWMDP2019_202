package assignment1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Design a function which keeps receiving a number from input and add the numbers
 * together. The application keeps doing it until the user enter 0. Then the application will
 * stop and return the total sum, average and standard deviation of the numbers the user had
 * entered.
 *
 * 入力から数字を受け取り続け、それらの数字を足し合わせる関数を設計します。
 * アプリケーションは、ユーザーが0を入力するまでそれを実行し続けます。その後、アプリケーションは停止し、
 * ユーザーが入力した数値の合計、平均、および標準偏差を返します。
 */

public class problem4 {
    public static void main(String[] args) {
        reciaveNumbers();
    }

    public static void reciaveNumbers() {
        Scanner scan = new Scanner(System.in);
        List<Integer> numlist = new ArrayList<Integer>();
        double sum = 0;
        int cnt = 0;
        while (true) {
            System.out.print("Enter a number: ");
            double x = scan.nextDouble();
            cnt +=1;
            if (x == 0) {
                cnt -=1;
                break;
            } else {
                numlist.add((int) x);   // sum
                sum = sum + x;
            }

        }
        int ave = (int) (sum / cnt);    // average
        System.out.println("sum: " + sum);
        System.out.println("ave: " + ave);

        List<Integer> devlist = new ArrayList<Integer>();   // standard deviation
        for (int i : numlist) {
            int num1 = i;
            int deviation = num1 - ave;
            devlist.add(deviation);
        }
        int devsq = 0;
        int y = 0;
        double avedevsq = 0;
        for (int j : devlist) {
            int num2 = j;
            y = num2 * num2;
            devsq = devsq + y;
        }
        avedevsq = (double)devsq / cnt;
        double std = Math.pow(avedevsq,0.5);
        System.out.println("std: " + std);
    }
}
