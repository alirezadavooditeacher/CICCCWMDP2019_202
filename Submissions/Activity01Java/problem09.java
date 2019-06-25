import java.util.Scanner;

/**
 * problem09
 */
public class problem09 {
  private static int power(int base, int exp) { // base^exp

    int result = 1;
    for (int i = 1; i <= exp; i++) {
      result = result * base;
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base number");
    int base = Integer.parseInt(input.nextLine());
    System.out.println("Enter the power exp number");
    int exp = Integer.parseInt(input.nextLine());
    System.out.printf("the %d to the power of %d is: %d", base, exp, power(base, exp));
    input.close();
  }

}