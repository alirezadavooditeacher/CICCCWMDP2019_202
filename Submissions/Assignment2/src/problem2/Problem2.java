package problem2;

import java.util.ArrayList;

public class Problem2 {
    public static void problem2(ArrayList<Integer> problem2List) {
        System.out.println( problem2List );

        for (int i = 0; i < problem2List.size(); i++) {
            for (int j = i + 1; j < problem2List.size(); j++) {
                if (problem2List.get( i ).equals( problem2List.get( j ) )) {
                    problem2List.remove( problem2List.get( i ) );
                    break;
                }
            }
        }

        System.out.println( problem2List );
    }
}
