package problem2;

import java.util.Scanner;

public class Problem2 {
    private static int inputNumber(){
        Scanner scannerTwo = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        int inputNumber = scannerTwo.nextInt();

        if (inputNumber % 1 != 0){
            System.out.print( "The input is not valid." );
        }
        return inputNumber;
    }

    public static void printStars(){
        int number = Problem2.inputNumber();

        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
