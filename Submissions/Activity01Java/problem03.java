public class problem03 {
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

  public static void main(String[] args) {
    int numTest = 8;
    System.out.println(isPrime(numTest));
  }
}