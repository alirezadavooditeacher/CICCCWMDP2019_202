package problem9;

import java.util.Scanner;

public class Problem9 {
    private static void divisibleBy3And5(int A, int B){
        //(A and B not included), which are divisible to both 3 and 5
        System.out.println( "Numbers are divisible to both 3 and 5.(A and B not included)");
        while ((A + 1) < (B - 1)){
            if ((A + 1) % 3 == 0 && (A + 1) % 5 == 0){
                System.out.println( A );
            }
            A = A + 1;
        }
    }

    private static void divisibleBy6Or7(int A, int B){
        //(A included by B not included), which are divisible by either 6 or 7.
        System.out.println( "Numbers are divisible by either 6 or 7.(A included by B not included)");
        while (A < (B - 1)){
            if (A % 6 == 0 || A % 7 == 0){
                System.out.println( A );
            }
            A = A + 1;
        }
    }

    private static void notDivisibleBy3(int A, int B){
        //(A and B both included), which are not divisible by 3.
        System.out.println( "Numbers are not divisible by 3.(A and B both included)" );
        while (A < B){
            if (A % 3 != 0){
                System.out.println( A );
            }
            A = A + 1;
        }
    }

    public static void runProblem9(){
        divisibleBy3And5( 10,35 );
        divisibleBy6Or7( 10, 35 );
        notDivisibleBy3( 10, 35 );
    }
}
