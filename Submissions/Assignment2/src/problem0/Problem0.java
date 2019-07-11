package problem0;

import java.util.*;

public class Problem0 {
    public static ArrayList newArrayList(ArrayList<Integer> problem0List) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        for (int i = 0; i < problem0List.size(); i++) {
            for (int j = i + 1; j < problem0List.size(); j++) {
                if (problem0List.get( i ).equals( problem0List.get( j ) )) {
                    newArrayList.add( problem0List.get( i ) );
                    break;
                }
            }
        }
        return newArrayList;
    }

    public static Map newMap(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(  );
        arrayList.add( 10 );
        arrayList.add( 109 );
        arrayList.add( 10 );
        arrayList.add( 10 );
        arrayList.add( 14 );
        arrayList.add( 112 );
        arrayList.add( 14 );
        arrayList.add( 10 );
        arrayList.add( 14 );
        arrayList.add( 5 );
        arrayList.add( 5 );

        ArrayList<Integer> newArrayList = newArrayList( arrayList );
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (Integer number : newArrayList) {
            if (map.containsKey( number )) {
                map.put( number, map.get( number ).intValue() + 1 );
            } else {
                map.put( number, 2 );
            }
        }
        return map;
    }

    public static void runProblem0(){
        Map map = newMap();
        List<Map.Entry<Integer, Integer>> list = new ArrayList( map.entrySet() );
        Collections.sort( list, (o1, o2) -> (o2.getValue() - o1.getValue()) );
        System.out.println( list.get( 0 ).getKey() );
    }
}
