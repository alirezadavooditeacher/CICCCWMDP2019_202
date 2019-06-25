import java.util.Scanner;

/**
 * problem8
 */
public class problem08 {

  public static void teste() {
    System.out.println("Enter num");
    Scanner in = new Scanner(System.in);
    int num = Integer.parseInt(in.nextLine());
    System.out.println("Enter num2");
    int num2 = Integer.parseInt(in.nextLine());

    System.out.println(num / num2);
    in.close();
  }

  public static void main(String[] args) {
    teste();
  }
}