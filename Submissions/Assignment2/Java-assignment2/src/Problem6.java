import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Problem6 {
	public int calcSum() {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList = this.mkNumList();
		int sumList = this.getSum(numList);
		
		return sumList;
		
	}
	
	public static int getSum(ArrayList<Integer> numList) {
		// TODO Auto-generated method stub
		int sumList = 0;
		
		for (int number: numList) {
			sumList = sumList + number;
		}
		
		return sumList;
	}

	public static ArrayList<Integer> mkNumList() {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		while (!(flag)) {
			System.out.print("Type your favorite number(0 is quit): ");
			int number = scanner.nextInt();
			if (number == 0) {
				flag = true;
			} else {
				numList.add(number);
			}
		} 
		
		return numList;
		
	}
}
