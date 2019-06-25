import java.util.Scanner;

/**
 * problem07
 */
public class problem07 {

  public static Boolean isPrime(int num) {
    if (num < 1) {
      return false;
    } else if (num == 1) {
      return true;
    } else {
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          return false;
        }
      }
      return true;
    }
  }

  public static void nextprime() {
    System.out.println("Enter num");
    Scanner in = new Scanner(System.in);
    int num = Integer.parseInt(in.nextLine());
    num += 1;
    while (!isPrime(num)) {
      num++;
    }
    System.out.println(num);
    in.close();
  }

  public static void main(String[] args) {
    nextprime();
  }
}