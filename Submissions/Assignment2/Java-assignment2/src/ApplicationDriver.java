import java.util.ArrayList;
import java.util.HashMap;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem0 problem0 = new Problem0();
		Problem1 problem1 = new Problem1();
		Problem2 problem2 = new Problem2();
		Problem3 problem3 = new Problem3();
		Problem4 problem4 = new Problem4();
		Problem5 problem5 = new Problem5();
		Problem6 problem6 = new Problem6();
		Problem7 problem7 = new Problem7();
		Problem8 problem8 = new Problem8();
		Problem9 problem9 = new Problem9();
		
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(5);
		nums.add(6);
		
		//Problem0
//		int result = problem0.findMostRepeatedNumber(nums);
//		System.out.println(result);
		
		//Problem1
//		HashMap<Integer, Integer> mapPro1 = problem0.mkNumAndRepeated(nums);
//		Problem1.showMap(mapPro1);
		
		//Problem2
//		System.out.println(nums);
//		HashMap<Integer, Integer> mapPro2 = problem0.mkNumAndRepeated(nums);
//		ArrayList<Integer> distinctNum = new ArrayList<Integer>();
//		distinctNum = problem2.findDistictNums(mapPro2);
//		System.out.println(distinctNum);
		
//		//Problem3
//		int[] listNums = {2, 2, 3, 3, 1, 4, 4, 5, 5};
//		int number = Problem3.findSingleNumber(listNums);
//		System.out.println("The number that is not repeated is "+number);
		
		//Problem4
//		HashMap<String, String> s1 = new HashMap<String, String>();
//		s1.put("firstName", "Shinzo");
//		s1.put("lastName", "Abe");
//		s1.put("address", "Japan");
//		s1.put("Year", "1960");
//		s1.put("average", "88");
//		HashMap<String, String> s2 = new HashMap<String, String>();
//		s2.put("firstName", "Donald");
//		s2.put("lastName", "Trump");
//		s2.put("address", "America");
//		s2.put("Year", "1965");
//		s2.put("average", "60");
//		HashMap<String, String> s3 = new HashMap<String, String>();
//		s3.put("firstName", "Justin");
//		s3.put("lastName", "Trudeau");
//		s3.put("address", "Canada");
//		s3.put("Year", "1970");
//		s3.put("average", "70");
//		
//		ArrayList<HashMap<String, String>> allStudents = new ArrayList<HashMap<String, String>>();
//		allStudents.add(s1);
//		allStudents.add(s2);
//		allStudents.add(s3);
//		
//		HashMap<String, String> topStudent = new HashMap<String, String>();
//		topStudent = problem4.findTopStudent(allStudents);
//		System.out.println(topStudent);
				
		
		//Problem5
//		HashMap<String, Integer>nameCall = new HashMap<String, Integer>();
//		nameCall = problem5.countNameCall();
//		System.out.println(nameCall);
		
		//Problem6
//		int inputSum = problem6.calcSum();
//		System.out.println(inputSum);
		
		//Problem7
//		int arr[] = { 2, 10, 4, 10, 40 };  
//	    int x = 9; 
//	      
//	    int result = problem7.search(arr, x); 
//	    if(result == -1) 
//	        System.out.print("Element is not present in array"); 
//	    else
//	        System.out.print("Element is present at index " + result); 
		
		//Problem8
//		int arr[] = { 2, 10, 4, 10, 40 };  
//	    int x = 10;
//	    
//	    ArrayList<Integer> removedList = problem8.removeNum(arr, x);
////	    System.out.println(removedList);
//		
//		//Problem9
		int row = 8;
		int column = 10;
//		ArrayList<HashMap<Integer, Integer>> table = new ArrayList<HashMap<Integer, Integer>>();
		ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
		table =	problem9.mkTable(row, column);
		
		int columnIndex;
		int rowIndex = table.size() - 1;
		int i = 0;
		int sumWeight = 0;
		int maxWeight = 0;
		while (i <= rowIndex) {
			columnIndex = table.get(i).size() - 1;
			int j = 0;
			while (j <= columnIndex) {
				if (i == 0) {
					if (j == 0) {
						sumWeight = table.get(i).get(j + 1) + table.get(i + 1).get(j);
					} else if (j == columnIndex) {
						sumWeight = table.get(i + 1).get(j) + table.get(i).get(j - 1);
					} else {
						sumWeight = table.get(i - 1).get(j) + table.get(i).get(j + 1) + table.get(i + 1).get(j);
					}
				} else if (i == rowIndex) {
					if (j == 0) {
						sumWeight = table.get(i - 1).get(j) + table.get(i).get(j + 1);
					} else if (j == columnIndex) {
						sumWeight = table.get(i - 1).get(j) + table.get(i).get(j - 1);
					} else {
						sumWeight = table.get(i - 1).get(j) + table.get(i).get(j + 1) + table.get(i).get(j - 1);
					}
				} else {			 			
					if (j == 0) {
						sumWeight = table.get(i - 1).get(j) + table.get(i).get(j + 1) + table.get(i + 1).get(j);
					} else if (j == columnIndex) {
						sumWeight = table.get(i - 1).get(j) + table.get(i + 1).get(j) + table.get(i).get(j - 1);
					} else {
						sumWeight = table.get(i - 1).get(j) + table.get(i).get(j + 1) +table.get(i + 1).get(j) + table.get(i).get(j - 1);
					}
				}
				if (maxWeight < sumWeight) {
					maxWeight = sumWeight;
				}
				j += 1;
			}
			i += 1;
		}
		System.out.println(maxWeight);

	}

			


}
