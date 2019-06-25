package problems;

import java.util.Scanner;

public class Problem_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("statement: ");
        String statement = scanner.next();

        boolean isValid = isValidArthitmaticStatement(statement);

        System.out.printf("%s isValid? = %b", statement,  isValid);

    }



    private static final char OPEN_PARANTHESIS = '(';
    private static final char CLOSE_PARANTHESIS = ')';

    public static boolean isValidArthitmaticStatement(String statement) {

        return Problem_15.isValidBasedOnRule1(statement) && Problem_15.isValidBasedOnRule2(statement);
    }

    private static boolean isValidBasedOnRule1(String statement) {

        int openPCounter = 0;
        int clasedPCounter = 0;

        for(int i=0; i<statement.length(); i++) {
            if(statement.charAt(i)==OPEN_PARANTHESIS) {
                openPCounter++;
            } else if(statement.charAt(i)==CLOSE_PARANTHESIS) {
                clasedPCounter++;
            }
        }

        if(openPCounter==clasedPCounter) {
            return true;
        }
        return false;
    }

    private static boolean isValidBasedOnRule2(String statement) {

        int openPCounter = 0;
        int clasedPCounter = 0;

        for(int i=0; i<statement.length(); i++) {
            if(statement.charAt(i)==OPEN_PARANTHESIS) {
                openPCounter++;
            } else if(statement.charAt(i)==CLOSE_PARANTHESIS) {
                clasedPCounter++;
            }

            if(openPCounter<clasedPCounter) {
                return false;
            }
        }

        return true;
    }
}
