package problem3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem3 {
    public static void problem3(ArrayList<Integer> problem3List) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        for (int i = 0; i < problem3List.size(); i++) {
            for (int j = i + 1; j < problem3List.size(); j++) {
                if (problem3List.get( i ).equals( problem3List.get( j ) )) {
                    newArrayList.add( problem3List.get( i ) );
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

        List<Object> keyList = new ArrayList<>();
        for(Object key: map.keySet()){
            if(map.get(key).equals(1)){
                keyList.add(key);
            }
        }
        System.out.println( keyList );
    }
}
