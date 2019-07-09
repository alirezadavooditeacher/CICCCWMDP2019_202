package problem10;

public class Problem10 {
    public static void runProblem10(int number){
        int remainder = 0;
        int binaryNumber = 0;
        int times = 0;

        while (number > 0){
            remainder = number % 2;
            binaryNumber = (int) (binaryNumber + remainder * Math.pow( 10, times ));
            number = number / 2;
            times = times + 1;
        }

        System.out.println( "The binary number is " + binaryNumber );
    }
}
