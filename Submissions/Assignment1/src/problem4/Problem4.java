package problem4;

import java.util.Scanner;

public class Problem4 {
    public static void sum(){
        Scanner scannerFour = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        int inputNumber = scannerFour.nextInt();
        int sum = 0;

        while (inputNumber != 0) {
            sum = sum + inputNumber;
            System.out.print( "Please enter a number: " );
            inputNumber = scannerFour.nextInt();
        }
        System.out.println( "Sum = " + sum );
    }
}
