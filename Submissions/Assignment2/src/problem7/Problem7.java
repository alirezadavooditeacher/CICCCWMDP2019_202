package problem7;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem7 {
    public static void runProblem7(Integer[] listOfNumbers, Integer[] numbersToSearch){
        ArrayList<Integer> newList = new ArrayList<Integer>(  );

        for (int i = 0; i < numbersToSearch.length; i++){
            for (int j = 0; j < listOfNumbers.length; j++){
                if (numbersToSearch[i] == listOfNumbers[j]){
                    newList.add( j );
                    break;
                }
            }
        }

        System.out.println( newList );
    }
}
