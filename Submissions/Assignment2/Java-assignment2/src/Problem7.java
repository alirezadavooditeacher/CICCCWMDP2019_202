
public class Problem7 {

	public static int search(int[] arr, int x) {
		// TODO Auto-generated method stub
		int n = arr.length; 
	    for(int i = 0; i < n; i++) 
	    { 
	        if(arr[i] == x) 
	            return i; 
	    } 
	    return -1;
	}

}
