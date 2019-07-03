package problem1;

import java.util.Scanner;

public class Problem1{
    public static class InputException extends Exception {
        @Override
        public void printStackTrace() {
            super.printStackTrace();
            System.out.print( "Input is not valid." );
        }
    }

    private static int inputFirstNumber() throws InputException{
        Scanner scannerOne = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        String A = scannerOne.nextLine();
        int firstNumber = 0;

        if ((A != null) && (A.matches( "^[0.0-9.0]+$" ))){
            firstNumber = Integer.parseInt( A );
        } else {
            throw new InputException();
        }
        return firstNumber;
    }

    private static int inputSecondNumber()  throws InputException{
        Scanner scannerOne = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        String B = scannerOne.nextLine();
        int secondNumber = 0;

        if ((B != null) && (B.matches( "^[0.0-9.0]+$" ))) {
            secondNumber = Integer.parseInt( B );
        } else {
            throw new InputException();
        }
        return secondNumber;
    }

    public static void inputOperatorAndCalculator() throws InputException {
        int number1 = Problem1.inputFirstNumber();
        int number2 = Problem1.inputSecondNumber();

        Scanner scannerOperator = new Scanner( System.in );
        System.out.print( "Please enter an operator: " );
        String operator = scannerOperator.nextLine();

        if (operator == "/") {
            if (number2 == 0){
                System.out.print( "The second input can not be 0" );
            } else {
                int ans = number1 / number2;
                System.out.print( "The answer is : " + ans );
            }
        } else if (operator == "+"){
            int ans = number1 + number2;
            System.out.print( "The answer is : " + ans );
        } else if (operator == "-"){
            int ans = number1 - number2;
            System.out.print( "The answer is : " + ans );
        } else if (operator == "*"){
            int ans = number1 * number2;
            System.out.print( "The answer is : " + ans );
        } else {
            System.out.print( "Input operator is not valid." );
        }
    }
}
