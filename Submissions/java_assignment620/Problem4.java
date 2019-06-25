/**
 *
 */
package assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author miyamotoatsushi
 * implement problem4
 */
public class Problem4 {

    /**
     * check high average student
     * @param studrntDict student info dictionary
     * @return high average student info
     */
    public static HashMap<String, String> returnHighAvarageStudent(HashMap<String, List<String>> studrntDict) {
        int highAvarage = 0;
        int studentIndexNumber = 0;
        HashMap<String, String> highAvarageStudent = new HashMap<String, String>();
        for (int i = 0; i < studrntDict.get("avarage").size(); i++) {
            if (highAvarage < Integer.parseInt(studrntDict.get("avarage").get(i))) {
                highAvarage = Integer.parseInt(studrntDict.get("avarage").get(i));
                studentIndexNumber = i;
            }
        }

        for (Entry<String, List<String>> entry : studrntDict.entrySet()) {
            highAvarageStudent.put(entry.getKey(), entry.getValue().get(studentIndexNumber));
        }


        return highAvarageStudent;

    }

}
