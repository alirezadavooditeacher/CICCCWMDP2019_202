package problem7;

import java.util.Scanner;

public class Problem7 {
    private static int inputFirstNumber(){
        Scanner scannerSeven = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        int A = scannerSeven.nextInt();

        while (A <= 0){
            System.out.print( "The input is not valid, please try again.\nPlease enter a number:" );
            A = scannerSeven.nextInt();
        }
        return A;
    }

    private static int inputSecondNumber(){
        Scanner scannerSeven = new Scanner( System.in );
        System.out.print( "Please enter another number: " );
        int B = scannerSeven.nextInt();

        while (B <= 0){
            System.out.print( "The input is not valid, please try again.\nPlease enter a number:" );
            B = scannerSeven.nextInt();
        }
        return B;
    }

    public static void calculateQuotient(){
        int ans = inputFirstNumber();
        int B = inputSecondNumber();

        while(ans >= B){
            ans = ans - B;
        }
        System.out.println( "The quotient is " + ans );
    }
}
