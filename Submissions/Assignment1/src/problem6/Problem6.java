package problem6;

import problem3.*;

public class Problem6 {
    public static void checkNextPrime(){
        int inputNumber = Problem3.inputNumber() + 1;

        for( int i = 3; i < inputNumber; i++){
            if (inputNumber <= 2) {
                System.out.println( "Next prime number is " + inputNumber );
            } else if (inputNumber % 2 == 0) {
                while (inputNumber % 2 == 0){
                    inputNumber = inputNumber + 1;
                }
            } else if (inputNumber % i == 0) {
                while (inputNumber % i == 0){
                    inputNumber = inputNumber + 1;
                }
            }
        }
        System.out.println( "Next prime number is " + inputNumber );
    }
}
