import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment {
	// Problem1
	/**
	 * Calculator
	 * 
	 * @param number1  operands1
	 * @param number2  operands2
	 * @param operator : plus, minus,multiplication and division
	 */
	public void calculator(float number1, float number2, String operator) {
		float result = 0;
		switch (operator) {
		case "plus":
			result = number1 + number2;
			break;
		case "minus":
			result = number1 - number2;
			break;
		case "multiplication":
			result = number1 * number2;
			break;
		case "division":
			if (number1 != 0 && number2 == 0) {
				System.out.println("Can not division because number2 = 0");
				result = -1;
			} else {
				result = number1 / number2;
			}
			break;
		default:
			break;
		}

		if (result >= 0) {
			System.out.println("Result of " + operator + " is " + result);
		}
	}

	// Problem2
	/**
	 * Detect shape
	 * 
	 * @param number    input is 5
	 * @param shapeName shape name
	 */
	public void detectShape(int number, String shapeName) {
		if (number == 5) {
			switch (shapeName) {
			case "SHAPE1":
				System.out.println("*****");
				System.out.println(" *** ");
				System.out.println("  *   ");
				break;
			case "SHAPE2":
				System.out.println("*****");
				System.out.println("****");
				System.out.println("***");
				System.out.println("**");
				System.out.println("*");
				break;
			case "SHAPE3":
				System.out.println("*");
				System.out.println("**");
				System.out.println("***");
				System.out.println("****");
				System.out.println("*****");
				break;
			default:
				break;
			}
		}
	}

	// Problem3
	/**
	 * Check is prime number
	 * 
	 * @param number interger number
	 * @return true/false
	 */
	public boolean isPrimeNumber(int number) {
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			return true;
		else
			return false;
	}

	// Problem4
	public void findResultNumber() {
		List<Integer> arr = new ArrayList<Integer>();
		int n = 0;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Please enter numbers : ");
			try {
				n = in.nextInt();
				if (n == 0) {
					break;
				}

				sum += n;
			} catch (Exception e) {
			}

			arr.add(n);
		}
		
		int length = arr.size();
		double average = sum/length;
		double standardDeviation = 0.0;
		
		for(double number: arr) {
            standardDeviation += Math.pow(number - average, 2);
        }

		System.out.println("Sum is : " + sum);
		System.out.println("Average is : " + average);
		System.out.println("Standard deviation is : " + Math.sqrt(standardDeviation/length));
	}

	// Problem5
	/**
	 * Sum of number
	 * 
	 * @param number
	 */
	public void sumOfNumber(int number) {
		int sum = 0;

		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;
		}

		System.out.println("Sum is " + sum);
	}

	// Problem6
	/**
	 * Find next prime number
	 * 
	 * @param number
	 * @return
	 */
	public boolean findNextPrimeNumber(int number) {
		int nextNumber = number + 1;
		return isPrimeNumber(nextNumber);
	}

	// Problem7
	/**
	 * Calculate quotient
	 * 
	 * @param A
	 * @param B
	 */
	public void calculateQuotient(int A, int B) {
		System.out.println("Result is " + (A / B));
	}

	// Problem8
	/**
	 * Reverse number
	 */
	public void reverseNumber() {
		int n, reverse = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Enter an integer to reverse : ");
			n = in.nextInt();

			if (n % 10 == 0) {
				continue;
			}
			break;
		}

		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}

		System.out.println("Reverse of the number is " + reverse);
	}

	// Problem9
	/**
	 * Print number between A And B
	 * 
	 * @param A
	 * @param B
	 */
	public void printNumberBetweenAAndB(int A, int B) {
		// Print Number Divisible Three And Five
		printNumberDivisibleThreeAndFive(A, B);

		// Print Number Divisible Six Or Seven
		printNumberDivisibleSixOrSeven(A, B);

		// Print Number Not Divisible three
		printNumberNotDivisibleThree(A, B);
	}

	/**
	 * Print Number Divisible Three And Five
	 * 
	 * @param A
	 * @param B
	 */
	public void printNumberDivisibleThreeAndFive(int A, int B) {
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = A + 1; i < B; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				arr.add(i);
			}
		}

		System.out.println("All numbers between A and B (A and B not included), which are divisible to both 3 and 5 : "
				+ arr.toString());
	}

	/**
	 * Print Number Divisible Six Or Seven
	 * 
	 * @param A
	 * @param B
	 */
	public void printNumberDivisibleSixOrSeven(int A, int B) {
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = A; i < B; i++) {
			if ((i % 6 == 0) && (i % 7 == 0)) {
				arr.add(i);
			}
		}

		System.out.println(
				"All numbers between A and B (A included by B not included), which are divisible by either 6 or 7 : "
						+ arr.toString());
	}

	/**
	 * Print Number Not Divisible three
	 * 
	 * @param A
	 * @param B
	 */
	public void printNumberNotDivisibleThree(int A, int B) {
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = A; i <= B; i++) {
			if (i % 3 != 0) {
				arr.add(i);
			}
		}

		System.out.println("All numbers between A and B (A and B both included), which are not divisible by 3 : "
				+ arr.toString());
	}

	// Problem10
	/**
	 * Convert Interger To Binary
	 * 
	 * @param number
	 */
	public void convertIntergerToBinary(int number) {
		String binary = "";
		while (number > 0) {
			int a = number % 2;
			binary = a + binary;
			number = number / 2;
		}
		System.out.println(binary);
	}

	// Problem11
	/**
	 * Find min max input
	 */
	public void findMinMaxInput() {
		List<Integer> arr = new ArrayList<Integer>();
		int n;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Please enter numbers (positive or negative) : ");
			try {
				n = in.nextInt();
			} catch (Exception e) {
				break;
			}

			arr.add(n);
		}

		// Find Max
		int maxNumber = Collections.max(arr);
		// Find Min
		int minNumber = Collections.min(arr);

		System.out.println("Max is : " + maxNumber);
		System.out.println("Min is : " + minNumber);
		System.out.println("Distance between the Max and Min is : " + Math.abs(maxNumber - minNumber));
	}

	public static void main(String[] args) {
		Assignment assignment = new Assignment();
		// Test Problem1
		// assignment.calculator(5, 7, "plus");
		// assignment.calculator(5, 7, "minus");
		// assignment.calculator(5, 7, "multiplication");
		// assignment.calculator(5, 7, "division");
		// assignment.calculator(5, 0, "division");

		// Test Problem2
		// assignment.detectShape(5, "SHAPE1");
		// assignment.detectShape(5, "SHAPE2");
		// assignment.detectShape(5, "SHAPE3");

		// Test Problem3
		// System.out.println(assignment.isPrimeNumber(5));
		
		// Test Problem4
		// assignment.findResultNumber();

		// Test Problem5
		// assignment.sumOfNumber(234);

		// Test Problem6
		// System.out.println(assignment.findNextPrimeNumber(5));

		// Test Problem7
		// assignment.calculateQuotient(8, 3);

		// Test Problem8
		// assignment.reverseNumber();

		// Test Problem9
		// assignment.printNumberBetweenAAndB(1, 43);

		// Test Problem10
		// assignment.convertIntergerToBinary(19);

		// Test Problem11
		// assignment.findMinMaxInput();
	}
}
