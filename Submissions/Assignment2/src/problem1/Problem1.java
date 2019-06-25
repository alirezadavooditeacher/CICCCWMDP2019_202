package problem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void problem1(ArrayList<Integer> problem1List) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        for (int i = 0; i < problem1List.size(); i++) {
            for (int j = i + 1; j < problem1List.size(); j++) {
                if (problem1List.get( i ).equals( problem1List.get( j ) )) {
                    newArrayList.add( problem1List.get( i ) );
                    break;
                }
            }
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 1;

        for (Integer number : newArrayList) {
            if (map.containsKey( number )) {
                count++;
                map.put( number, map.get( number ).intValue() + 1 );
            } else {
                map.put( number, 2 );
            }
        }

        for (Object key : map.keySet()) {
            System.out.println( key + " : " + map.get(key) );
        }
    }
}
