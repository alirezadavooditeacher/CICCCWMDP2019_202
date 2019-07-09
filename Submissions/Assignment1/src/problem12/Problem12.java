package problem12;

public class Problem12 {
    public static void runProblem12(double A, double B){
        double x = 2;
        double fx1 = Math.pow( A, x );
        double fx2 = Math.pow( x, B );

        while (fx1 < fx2){
            x++;
            fx1 = Math.pow( A, x );
            fx2 = Math.pow( x, B );
        }

        System.out.println( "The answer is " + x );
    }
}
