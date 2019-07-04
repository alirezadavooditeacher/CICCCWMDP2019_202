package problem5;

import java.util.Scanner;

public class Problem5 {
    public static void sumOfDigits(){
        Scanner scannerFive = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        int inputNumber = scannerFive.nextInt();
        int sum = 0;

        while (inputNumber > 0){
            int remainder = inputNumber % 10;
            sum = sum + remainder;
            inputNumber = inputNumber / 10;
        }

        System.out.println( "Sum = " + sum );
    }
}
