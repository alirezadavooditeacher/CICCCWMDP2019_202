import java.util.Scanner;

/**
 * problem05
 */
public class problem05 {

  public static int getLastDigit(int num) {
    int digit = num % 10;
    return digit;
  }

  public static int sumOfDigits(int number) {
    int result = 0;
    while (number != 0) {
      result += getLastDigit(number);
      number /= 10;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("Digite um numero:");
    Scanner input = new Scanner(System.in);
    int a = Integer.parseInt(input.nextLine());
    System.out.printf("The sum of digts is: %d\n", sumOfDigits(a));
    input.close();
  }
}