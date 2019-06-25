import java.util.Scanner;

/**
 * problem01 // // Design for an algorithmwhich takes 2 operands ( // number)
 * and one operator (plus, minus, multiplication and devision) // and apply the
 * operator on the operands and print the result.Note: If // operand1 is a
 * non-zero number and the operand2 is zero, then the program // should not
 * perform the devision operand and should print the operation is // not
 * possible because one number if zero (this is only for devision operator).
 */
public class problem01 {

  // public static String getInput(Scanner input) {
  // System.out.println(" Enter a data: \n");
  // String num = input.nextLine();
  // return num;
  // }

  private static int division(int a, int b) {
    return a / b;
  }

  private static int multiplication(int a, int b) {
    return a * b;
  }

  private static int sum(int a, int b) {
    return a + b;
  }

  private static int subtract(int a, int b) {
    return a - b;
  }

  public static float calc(int a, int b, String operand) {
    if (operand.charAt(0) == '-') {
      return subtract(a, b);
    } else if (operand.charAt(0) == '+') {
      return sum(a, b);
    }

    else if (operand.charAt(0) == '*') {
      return multiplication(a, b);
    }

    else if (operand.charAt(0) == '/') {

      if (a > 0) {
        return (int) division(a, b);
      } else {
        System.out.println("We can't have division by 0");
      }
    }
    // else {
    // System.out.println("Enter a right opperand");
    // }
    return 0;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter a num1: ");
    int num1 = Integer.parseInt(input.nextLine());
    System.out.println(" Enter a num2: ");
    int num2 = Integer.parseInt(input.nextLine());
    System.out.println(" Enter a operator ('-', '+', '/','*'): ");
    String operand = input.nextLine();

    System.out.println(calc(num1, num2, operand));
    input.close();
  }

}