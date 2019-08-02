import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int land [] = {0,4,5,3,8,2,9,9,10};
		
		countBuildingsToBuild(land);
			

	}

	public static void countBuildingsToBuild(int[] arr) {
		int buildings = 0;
		
		int curr = 1;
		
		int previsiousElment = arr[curr-1];
		int currElement = arr[curr];
		int nextElment = arr[curr+1];
		
		ArrayList<Integer> peaks = new ArrayList<Integer>();

		ArrayList<Integer> valley = new ArrayList<Integer>();
		
		
		//System.out.println(previsiousElment + " " + currElement + " " + nextElment);
		
		if(arr.length > 0) {
			buildings++;
		}
		
		for (int i = 1; i < arr.length-2; i++) {
			
			curr++;
			
			previsiousElment = arr[curr-1];
			currElement = arr[curr];
			nextElment = arr[curr+1];
			
			//System.out.println(previsiousElment + " " + currElement + " " + nextElment);
			
			if (currElement> previsiousElment && currElement>nextElment || currElement == nextElment) {
				peaks.add(currElement);
				//System.err.println(currElement + " is a peak");
				buildings++;
			}
			
			if (currElement < previsiousElment && currElement < nextElment ) {
				valley.add(currElement);
				//System.err.println(currElement + " is a valley");
				buildings++;
			}
		}
		
		System.out.println("The number of building in this land is : " + buildings);
	}


}
