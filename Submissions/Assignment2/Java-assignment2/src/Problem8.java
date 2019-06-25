import java.util.ArrayList;

public class Problem8 {

	public ArrayList<Integer> removeNum(int[] arr, int x) {
		// TODO Auto-generated method stub
		ArrayList<Integer> removedNum = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != x) {
				removedNum.add(arr[i]);
			}
		}
		
		
		return removedNum;
	}
	
}
