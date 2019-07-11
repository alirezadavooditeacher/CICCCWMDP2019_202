package problem1;

import problem0.Problem0;
import java.util.Map;

public class Problem1 {
    public static void runProblem1(){
        Map map = Problem0.newMap();

        for (Object key : map.keySet()) {
            System.out.println( key + " : " + map.get(key) );
        }
    }
}
