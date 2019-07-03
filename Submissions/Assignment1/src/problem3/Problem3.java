package problem3;

import java.util.Scanner;

public class Problem3 {
    public static int inputNumber(){
        Scanner scannerThree = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        int inputNumber = scannerThree.nextInt();

        while (inputNumber <= 0){
            System.out.print( "The input is not valid, please try again.\nPlease enter a number:" );
            inputNumber = scannerThree.nextInt();
        }
        return inputNumber;
    }

    public static boolean checkPrime(){
        int inputNumber = Problem3.inputNumber();

        for( int i = 3; i < inputNumber; i++){
            if (inputNumber <= 2) {
                System.out.println( "true" );
                return true;
            } else if (inputNumber % 2 == 0) {
                System.out.println( "false" );
                return false;
            } else if (inputNumber % i == 0) {
                System.out.println( "false" );
                return false;
            }
        }
        System.out.println( "true" );
        return true;
    }
}
