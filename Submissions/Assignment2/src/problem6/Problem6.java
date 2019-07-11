package problem6;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem6 {
    public static void runProblem6(){
        Scanner readInput = new Scanner( System.in );
        System.out.println( "Please enter a number :" );
        int inputNumber = readInput.nextInt();
        ArrayList<Integer> inputList = new ArrayList<Integer>(  );

        if (inputNumber != 0){
            inputList.add( inputNumber );
            while (inputNumber != 0){
                System.out.println( "Please enter a number :" );
                inputNumber = readInput.nextInt();
                if (inputList.contains( inputNumber )){

                } else if (inputNumber == 0){

                }else {
                    inputList.add( inputNumber );
                }
            }
        } else {
            System.out.println( "The First input can not be 0." );
        }

        System.out.println( inputList );
    }
}
