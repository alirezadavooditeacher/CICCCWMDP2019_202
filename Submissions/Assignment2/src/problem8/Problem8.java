package problem8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Problem8 {
    public static void runProblem8(Integer[] listOfNumbers, Integer inputNumber){
        ArrayList<Integer> newList = new ArrayList<Integer>(  );

        for (int i = 0; i < listOfNumbers.length; i++){
            if (inputNumber != listOfNumbers[i]){
                newList.add( listOfNumbers[i] );
            }
        }

        System.out.println( newList );
    }
}
