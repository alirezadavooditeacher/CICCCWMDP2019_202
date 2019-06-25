/**
 *
 */
package assignment;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author miyamotoatsushi
 * implement problem5
 */
public class Problem5 {

    /**
     * return a dictionary which shows all the name the user has entered and how many times each name is repeated
     * @return dictionry which is including names
     */
    public static HashMap<String, Integer> returnName() {
        Scanner intReader = new Scanner(System.in);
        Scanner strReader = new Scanner(System.in);
        HashMap<String, Integer> resultDict = new HashMap<String, Integer>();
        int nameCount = 0;

        while (intReader.nextInt() == 0) {

            String inputName = strReader.next();

            if (!resultDict.containsKey(inputName)) {
                resultDict.put(inputName, nameCount);
            } else {
                resultDict.put(inputName, resultDict.get(inputName) + 1);
            }

        }

        return resultDict;

    }

}
