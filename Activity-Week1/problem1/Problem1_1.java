package problem1;
import java.util.Scanner;

public class Problem1_1 {
	
	/**Read a number from input (like 123). 
	You make the assumption that the user does not
	 enter a decimal number (like 123.4). 
	 The number entered by the user should 
	 not be divisible by 10 and if the user 
	 enters a number that is divisible by 10
	  (like 560), it is considered invalid 
	  and the application should keep asking 
	  until the user enters a valid input. 
	  Once the user enters a valid input, 
	  the program calculate the reverse of the number 
	  (for 153, the reverse is 351) and prints the result.
	*/
	
	/**
	 * sub-problem: Read a number from input
	 * sub-problem: If the input is valid
	 * sub-problem: reverse it and return it and print the result.
	 */
	
	//Section1: Instance variables
	
	
	//Section2: Static/class variables
	
	
	//Section3: Constrcutors
	
	
	//Section4: Instance methods
	
	
	//Sectiion5: Static/class methods
	public static String readFromInput() {
		
		//reads from input
		System.out.println("Please enter a number: ");
		Scanner reader = new Scanner(System.in);
		String word = reader.nextLine();
		
		//checks whether it is valid or not
		boolean isValid = Problem1_1.isInputValid(word);
		
		if(!isValid) {
			while(!isValid) {
				System.out.println("Please enter another number: ");
				word = reader.nextLine();				
				//checks whether it is valid or not
				isValid = Problem1_1.isInputValid(word);
			}
		}
		
		//At this point the word contains a valid input, therefore we can
		//go ahead with reversing it.
		
		return word;
	}
	
	public static boolean isInputValid(String word) {
		
		int number = Integer.parseInt(word);
		
		if (number%10==0) {
			return false;
		} else {
			return true;
		}
	}
	
	//will reverse the input number
	public static int reverseIt(String number) {
		
		int len = number.length(); //How many digits we have
		int dev = Integer.parseInt(number);
		int rem = 0;
		int sum = 0;
		
		while(dev>0) {
			
			rem = dev % 10;
			dev = dev / 10;
			sum = sum + rem * (int)(Math.pow(10,len-1));
			len = len -1;
		}
		
		return sum;
	}
	
}
