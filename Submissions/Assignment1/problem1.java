package assignment1;

import java.util.Scanner;

/**
 * Design for an function which takes 2 operands (number) and one operator (plus, minus,
 * multiplication and division) and apply the operator on the operands and print the result.
 * Note: If operand1 is a non-zero number and the operand2 is zero, then the program should
 * not perform the division operand and should print the operation is not possible because one
 * number if zero (this is only for division operator).
 *
 * 2つのオペランド（数値）と1つの演算子（プラス、マイナス、
 * 乗算と除算）を実行してオペランドに演算子を適用し、結果を出力します。
 * 注：operand1がゼロ以外の数で、operand2がゼロの場合、プログラムは除算オペランドを実行せず、
 * 1つの数がゼロの場合は演算を実行できません（これは除算演算子に対してのみです）。
 */

public class problem1 {

    public static void main(String[] args) {
        calculate();
    }

    public static int calculate() {
        System.out.print("Enter two number: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (!(num1==0) && (num2==0)) {
            System.out.println("Second number 0 is impossible to calculate!");
        } else {
            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
            System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        }
        return 0;
    }


}
