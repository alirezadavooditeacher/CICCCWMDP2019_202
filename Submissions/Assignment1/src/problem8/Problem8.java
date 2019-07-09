package problem8;

import java.util.Scanner;

public class Problem8 {
    private static int inputNumber(){
        Scanner scannerEight = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        int inputNumber = scannerEight.nextInt();

        while (inputNumber < 0){
            System.out.print( "The input is not valid, please try again.\nPlease enter a number:" );
            inputNumber = scannerEight.nextInt();
        }
        while (inputNumber % 10 == 0){
            System.out.print( "The input is not valid, please try again.\nPlease enter a number:" );
            inputNumber = scannerEight.nextInt();
        }
        return inputNumber;
    }

    public static void reverseOfNumber(){
        int inputNumber = inputNumber();
        int reverseNumber = 0;


        while (inputNumber > 0){
            int remainder = inputNumber % 10;
            reverseNumber = remainder + (reverseNumber * 10);
            inputNumber = inputNumber / 10;
        }

        System.out.println( "The reverse number is " + reverseNumber );
    }
}
