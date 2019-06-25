
/**
 * problem06
 */

import java.util.Scanner;

public class problem06 {

  private static void swapValues() {
    int num1, num2, temp;
    System.out.println("Enter num1 and num2");
    Scanner in = new Scanner(System.in);

    num1 = in.nextInt();
    num2 = in.nextInt();

    System.out.println("Before Swapping\nnum1 = " + num1 + "\nnum2 = " + num2);

    temp = num1;
    num1 = num2;
    num2 = temp;

    System.out.println("After Swapping\nnum1 = " + num1 + "\nnum2 = " + num2);
    in.close();
  }

  public static void main(String args[]) {
    swapValues();
  }
}