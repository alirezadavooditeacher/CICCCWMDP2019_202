
import java.util.Scanner;
import problem1.*;
import problem2.*;
import problem3.*;
import problem5.Problem5;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//problem1();
		
		//problem2();
		
		//problem3();
		
		problem5();

	}
	
	private static void problem5() {
		
		//String statement = "a+b*a+c/c%y(";
		//String statement = "(a+++++++b)*(a/d-(a/b))";
		
		String statement = ")))))";
		
		
		boolean isValid =  Problem5.isValidArthitmaticStatement(statement);
		
		System.out.printf("%s isValid? = %b", statement,  isValid);
	}
	
	private static void problem3() {
		String word = "Bob";
		String reversed = Problem3.reverse(word);
		
		boolean isEqual = Problem3.isStringAndReversedTheSame(word, reversed);
		
		System.out.println("Word is: "+word);
		System.out.println("Reverse is: "+reversed);
		System.out.println("is Equal?:"+isEqual);
	}
	private static void problem2() {
		int A = 10;
		Problem2.printMultipicationTable(A);
	}

	private static void problem1() {
		//Testing problem 1
		String word = Problem1_1.readFromInput();
		int reversedNumber = Problem1_1.reverseIt(word);
		System.out.println("The reverse is:"+reversedNumber);
		
		//Test problem 2
		
		System.out.println("Enter the first number");
		Scanner s = new Scanner(System.in);
		String num1 = s.nextLine();
		
		System.out.println("Enter the second number");
		String num2 = s.nextLine();
		
		int A = Integer.parseInt(num1);
		int B = Integer.parseInt(num2);
		
		Problem1_2.printNumbersDivisibleBy3And5(A, B);
		Problem1_2.printNumbersDivisibleEitherTo6Or7(A, B);
		Problem1_2.printNumbersNotDivisibleBy3(A, B);
		
		//Test problem 3
		
		System.out.println("The binary is: "+Problem1_3.convertToBinary(0));
		System.out.println("The binary is: "+Problem1_3.convertToBinary(7));
		System.out.println("The binary is: "+Problem1_3.convertToBinary(1));
		System.out.println("The binary is: "+Problem1_3.convertToBinary(64));
		System.out.println("The binary is: "+Problem1_3.convertToBinary(127));
		System.out.println("The binary is: "+Problem1_3.convertToBinary(2));
		System.out.println("The binary is: "+Problem1_3.convertToBinary(234));
		
		//Test Problem 4
		Problem1_4.run();
		
		//Test Problem5
		int C = 2;
		int D = 5;
		int result = Problem1_5.findTheTippingPoint(C, D);
		System.out.println("The result is "+result);
	}
}
