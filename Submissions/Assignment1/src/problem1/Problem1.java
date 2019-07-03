package problem1;

import java.util.Scanner;

public class Problem1{

    private static int inputFirstNumber(){
        Scanner scannerOne = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        int firstNumber = scannerOne.nextInt();
        return firstNumber;
    }

    private static int inputSecondNumber(){
        Scanner scannerOne = new Scanner( System.in );
        System.out.print( "Please enter another number: " );
        int secondNumber = scannerOne.nextInt();
        return secondNumber;
    }

    public static void inputOperatorAndCalculator(){
        int number1 = inputFirstNumber();
        int number2 = inputSecondNumber();
        Scanner scannerOne = new Scanner( System.in );
        System.out.print( "Please enter an operator: " );
        String operator = scannerOne.nextLine();

        if (operator.equals( "/" )) {
            while (number2 == 0){
                System.out.print( "The second input can not be 0, please try again.\nPlease enter another number: " );
                number2 = scannerOne.nextInt();
            }
            int ans = number1 / number2;
            System.out.print( "The answer is " + ans );
        } else if (operator.equals( "+" )){
            int ans = number1 + number2;
            System.out.print( "The answer is " + ans );
        } else if (operator.equals( "-" )){
            int ans = number1 - number2;
            System.out.print( "The answer is " + ans );
        } else if (operator.equals( "*" )){
            int ans = number1 * number2;
            System.out.print( "The answer is " + ans );
        } else {
            System.out.print( "Input operator is not valid." );
        }
    }
}
