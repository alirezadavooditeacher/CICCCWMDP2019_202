import java.util.Scanner;

public class Problem8 {
    // Problem8
    /**
     * Reverse number
     */
    public void reverseNumber() {
        int n, reverse = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer to reverse : ");
            n = in.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            break;
        }

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse of the number is " + reverse);
    }
    public static void main(String[] args) {
        Problem8 p8 = new Problem8();

        // Test Problem8
        p8.reverseNumber();

    }
}
