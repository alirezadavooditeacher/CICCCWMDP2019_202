package problem0;

import java.util.*;

public class Problem0 {
    public static void problem0arrayList(ArrayList<Integer> problem0List) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        for (int i = 0; i < problem0List.size(); i++) {
            for (int j = i + 1; j < problem0List.size(); j++) {
                if (problem0List.get( i ).equals( problem0List.get( j ) )) {
                    newArrayList.add( problem0List.get( i ) );
                    break;
                }
            }
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;

        for (Integer number : newArrayList) {
            if (map.containsKey( number )) {
                count++;
                map.put( number, map.get( number ).intValue() + 1 );
            } else {
                map.put( number, 1 );
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort( list, (o1, o2) -> (o2.getValue() - o1.getValue()) );
        System.out.println( list.get(0).getKey() );
    }
}
