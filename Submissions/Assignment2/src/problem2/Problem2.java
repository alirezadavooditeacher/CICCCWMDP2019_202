package problem2;

import problem0.Problem0;
import java.util.ArrayList;

public class Problem2 {
    public static void problem2() {
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

        System.out.println( "The original list : " + arrayList );

        ArrayList<Integer> distinctArray = new ArrayList<Integer>( arrayList );
        ArrayList<Integer> repeatNumbers = Problem0.newArrayList(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < repeatNumbers.size(); j++) {
                if (arrayList.get( i ).equals( repeatNumbers.get( j ) )) {
                    distinctArray.remove( arrayList.get( i ) );
                }
            }
        }

        System.out.println( "The list of distinct numbers : " + distinctArray );
    }
}
