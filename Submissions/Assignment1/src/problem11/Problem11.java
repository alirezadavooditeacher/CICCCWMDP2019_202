package problem11;

import java.util.Scanner;

public class Problem11 {
    private static int firstInput(){
        Scanner input11 = new Scanner( System.in );
        System.out.println( "Please enter a  number :" );
        String firstInput = input11.nextLine();
        int firstNumber = 0;
        for (int i = 0; i < firstInput.length(); i++) {
            if (Character.isDigit(firstInput.charAt(i))) {
                firstNumber = Integer.parseInt(firstInput);
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
            if (Character.isDigit( secondInput.charAt( i ) )) {
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
        int temp = 0;
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
        while (check == true){
            System.out.println( "Please enter another  number :" );
            String inputs = input11.next();
            for (int i = 0; i < inputs.length(); i++) {
                if (Character.isDigit(inputs.charAt(i))) {
                    count ++;
                    if (count == inputs.length()){
                        int number = Integer.parseInt(inputs);
                    }
                } else {
                    check = false;
                }
            }

        }

        System.out.println( "Max = " + max + "\nMin = " + min );

    }
}
