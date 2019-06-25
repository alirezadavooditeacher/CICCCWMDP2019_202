import java.util.Scanner;

public class problem02 {

  public static void printShape(int number) {

    for (int linha = number; linha > 0; linha--) {
      for (int i = 0; i < number; i++) {
        System.out.print("*");
      }
      System.out.println();
      number--;
    }

    System.out.println();

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter a number of *: ");
    int num1 = Integer.parseInt(input.nextLine());
    printShape(num1);
    input.close();
  }

}
