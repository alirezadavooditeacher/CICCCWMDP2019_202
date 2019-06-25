import java.util.Scanner;

public class problem04 {
  public static int ask_number() {
    int number, sum = 0;
    boolean isNotZero = true;
    Scanner input = new Scanner(System.in);
    while (isNotZero) {
      System.out.println("Enter a number: exit: 0");
      number = Integer.parseInt(input.nextLine());
      if (number == 0) {
        input.close();
        return sum;
      } else {
        sum += number;
      }
    }
    input.close();
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(ask_number());
  }
}