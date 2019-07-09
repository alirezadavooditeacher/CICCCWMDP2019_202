package problem15;

import java.util.Scanner;

public class Problem15 {
    private static String inputString() {
        Scanner scanner15 = new Scanner( System.in );
        System.out.print( "Please enter a string statement: " );
        String inputString = scanner15.nextLine();
        return inputString;
    }

    private static String checkIntput(){
        String input = inputString();
        int count = 0;

        for (int i = 0; i < input.length(); i++){
            char check = input.charAt( i );
            if ((check >= 'A' && check <= 'Z') || (check >= 'a' && check <= 'z') || check == '+' || check == '-' || check == '*' || check == '/' || check == '%' || check == '(' || check == ')') {
                count = count;
            } else {
                count++;
            }
        }

        if (count != 0){
            input = "false";
        }
        return input;
    }

    public static void runProblem15(){
        String input = checkIntput();
        int count = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            char check = input.charAt( i );
            if ((check >= 'A' && check <= 'Z') || (check >= 'a' && check <= 'z')) {
                char checkNext = input.charAt( i + 1 );
                if (checkNext != '+' && checkNext != '-' && checkNext != '*' && checkNext != '/' && checkNext != '%' && checkNext != '(' && checkNext != ')') {
                    count++;
                }
            }
        }

        if (count != 0){
            System.out.println( "The input is not a valid arithmetic statement." );
        } else {
            System.out.println( "The input is a valid arithmetic statement." );
        }
    }
}
