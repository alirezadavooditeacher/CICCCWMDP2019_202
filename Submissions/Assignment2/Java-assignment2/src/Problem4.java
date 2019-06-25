import java.util.ArrayList;
import java.util.HashMap;

public class Problem4 {
	public static HashMap<String, String> findTopStudent(ArrayList<HashMap<String, String>> allStudents) {
		// TODO Auto-generated method stub
		HashMap<String, String> topStudent = new HashMap<String, String>();
		int maxAverage = 0;
		
		for (int i = 0; i < allStudents.size(); i++) {
			int aveNum = Integer.parseInt(allStudents.get(i).get("average"));
			if (maxAverage < aveNum) {
				maxAverage = aveNum;
				topStudent = allStudents.get(i);
			}
		}
		
		
		return topStudent;
	}
	
}
