package assignment9.problem4;

 public class ApplicationDriver {
	 public static class Solution{
		 public static void solution(int[] A, int K) {
				for (int i = 0; i < K; i++) {
					for (int j= 0; j < A.length; j++) {
						int flag = A[j];
						A[j] = A[A.length - 1];
						A[A.length - 1] = flag;
				}
				
			}
	 }
	 
	 
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Solution.solution(arr, 2);
		for (int i : arr) {
			System.out.println(i);
		}
		
		

	}

}
}
