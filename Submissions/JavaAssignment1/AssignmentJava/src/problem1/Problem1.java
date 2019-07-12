package problem1;
import java.util.Scanner;

public class Problem1 {

    public static int printSumOfTwoNumbers( int A, int B, char op ) {
        if(op == '+') {
            return A + B;
        }else if(op == '-') {
            return A - B;
        }else if(op == '/') {
            return A / B;
        }else if(op =='*') {
            return A * B;
        }
        return 0;
    }
    public static boolean isValid(int B, char op) {
        if(op == '/' && B == 0 ) {
            System.out.println("Invalid input");
            return false;
        }else {
            return true;
        }
    }

}