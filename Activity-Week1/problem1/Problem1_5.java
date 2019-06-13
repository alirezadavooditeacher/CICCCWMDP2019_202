package problem1;

public class Problem1_5 {

	//f1(x) = A^x
	private static int f1(int A, int x) {
		return Problem1_5.power(A, x);
	}
	
	private static int f2(int x, int B) {
		return Problem1_5.power(x, B);
	}
	
	private static int power(int base, int exp) {  //base^exp
		
		int result = 1;
		for(int i=1; i<=exp; i++) {
			result = result*base;
		}
		
		return result;
	}
	
	public static int findTheTippingPoint(int A, int B) {
		int x = 3;
		while(f2(x, B) > f1(A,x)) {
			x = x +1;
		}
		
		return x;
	}
}
