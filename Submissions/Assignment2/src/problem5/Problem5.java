package problem5;

import java.util.*;

public class Problem5 {
    private static ArrayList inuptNames(){
        Scanner readInput = new Scanner( System.in );
        ArrayList<String> listOfNames = new ArrayList<String>(  );

        System.out.println( "Please enter a name :" );
        String inputName = readInput.nextLine();

        if (!inputName.equals( "0" )){
            listOfNames.add( inputName );
            while (!inputName.equals( "0" )){
                System.out.println( "Please enter a name :" );
                inputName = readInput.nextLine();
                listOfNames.add( inputName );
            }
        } else {
            System.out.println( "The First input name can not be 0." );
        }

        return listOfNames;
    }

    public static void runProblem5(){
        ArrayList<String> listOfNames = inuptNames();
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String names : listOfNames) {
            if (map.containsKey( names )) {
                map.put( names, map.get( names ).intValue() + 1 );
            } else if (names.equals( "0" )){

            } else {
                map.put( names, 1 );
            }
        }

        System.out.println( map );
    }
}
