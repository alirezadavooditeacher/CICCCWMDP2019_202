package problem3;

import problem0.Problem0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Problem3 {
    public static void runProblem3() {
        Map map = Problem0.newMap();
        List<Object> keyList = new ArrayList<>();

        for(Object key: map.keySet()){
            if(map.get(key).equals(2)){
                keyList.add(key);
            }
        }

        System.out.println( keyList );
    }
}
