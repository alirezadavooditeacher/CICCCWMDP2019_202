/**Read two numbers from input (like A and B) and
 * 
 * First prints all numbers between A and B (A and B not included), which are divisible to both 3 and 5.
 * Then prints all numbers between A and B (A included by B not included), which are divisible by either 6 or 7.
 *Finally prints all numbers between A and B (A and B both included), which are not divisible by 3.
 */


public class Problem2 {

	public static void printNumbersDivisibleBy3And5(int A, int B) {
		//ToDo
		
		System.out.println("printNumbersDivisibleBy3And5"); // to go the next line
		
		//for i in range(A+1,B,1):  Python
		//i++ is the same as i=i+1
		for(int i=A+1 ; i<=B-1; i++) { //for(//initialization; condition; update)
	
			if(i%3==0 && i%5==0) {
				System.out.print(i+",");
			}
			
		}
		System.out.println(); // to go the next line
	}
	
	public static void printNumbersDivisibleEitherTo6Or7(int A, int B) {
		//To Do
		System.out.println("printNumbersDivisibleEitherTo6Or7"); // to go the next line
		for(int i=A; i<B; i++) {
			if(i%6==0 || i%7==0) {
				System.out.print(i+",");
			}
		}
		System.out.println(); // to go the next line
	}
	
	public static void printNumbersNotDivisibleBy3(int A, int B) {
		//To Do
		
		System.out.println("printNumbersNotDivisibleBy3"); // to go the next line
		
		for(int i=A; i<=B; i++) {
			if(i%3 != 0) {
				System.out.print(i+",");
			}
		}
		System.out.println(); // to go the next line
	}
	
}
