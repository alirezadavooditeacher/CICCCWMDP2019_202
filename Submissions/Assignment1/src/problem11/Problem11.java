package problem11;

import java.util.Scanner;

public class Problem11 {
    private static int firstInput(){
        Scanner input11 = new Scanner( System.in );
        System.out.println( "Please enter a  number :" );
        String firstInput = input11.nextLine();
        int firstNumber = 0;

        for (int i = 0; i < firstInput.length(); i++) {
            if (firstInput.charAt( 0 ) == '-'){
                for (int j = 1; j < firstInput.length(); j++){
                    if (Character.isDigit(firstInput.charAt(j))) {
                        firstNumber = Integer.parseInt( firstInput );
                    }
                }
            } else if (Character.isDigit(firstInput.charAt(i))){
                firstNumber = Integer.parseInt( firstInput );
            }
        }

        return firstNumber;
    }

    private static int secondInput(){
        Scanner input11 = new Scanner( System.in );
        System.out.println( "Please enter another  number :" );
        String secondInput = input11.nextLine();
        int secondNumber = 0;

        for (int i = 0; i < secondInput.length(); i++) {
            if (secondInput.charAt( 0 ) == '-'){
                for (int j = 1; j < secondInput.length(); j++){
                    if (Character.isDigit(secondInput.charAt(j))) {
                        secondNumber = Integer.parseInt( secondInput );
                    }
                }
            } else if (Character.isDigit(secondInput.charAt(i))){
                secondNumber = Integer.parseInt( secondInput );
            }
        }

        return secondNumber;
    }

    public static void runProblem11(){
        Scanner input11 = new Scanner( System.in );
        int firstNumber = firstInput();
        int secondNumber = secondInput();
        int max = 0;
        int min = 0;
        boolean check = false;

        if (firstNumber == 0){
            System.out.println( "The first input is not valid." );
        } else if (secondNumber == 0){
            System.out.println( "The second input is not valid." );
        } else {
            if (firstNumber >= secondNumber){
                max = firstNumber;
                min = secondNumber;
            } else {
                max = secondNumber;
                min = firstNumber;
            }
            check = true;
        }

        int count = 0;
        int temp = 0;
        while (check == true){
            System.out.println( "Please enter another  number :" );
            String inputs = input11.next();
            for (int i = 0; i < inputs.length(); i++) {
                if (inputs.charAt( 0 ) == '-'){
                    for (int j = 1; j < inputs.length(); j++){
                        if (Character.isDigit(inputs.charAt(j))) {
                            temp = Integer.parseInt( inputs );
                            if (temp > max){
                                max = temp;
                            } else if (temp < min){
                                min = temp;
                            }
                        }
                    }
                } else if (Character.isDigit(inputs.charAt(i))){
                    temp = Integer.parseInt( inputs );
                    if (temp > max){
                        max = temp;
                    } else if (temp < min){
                        min = temp;
                    }
                } else {
                    check = false;
                }
            }
        }


        int distance = Math.abs( (max - min) );
        System.out.println( "Max = " + max + "\nMin = " + min + "\nThe distance is " + distance );

    }
}
