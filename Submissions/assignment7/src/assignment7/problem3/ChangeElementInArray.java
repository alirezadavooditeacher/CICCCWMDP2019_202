package assignment7.problem3;

import java.util.Arrays;

public class ChangeElementInArray {
	public static void main(String[] args) {
		String[] arrayString = {"thang","thang1", "thang2"};
		Integer[] arrayInt = {1,2,3};
		exchangeElements(arrayString, 0, 1);
		System.out.println(Arrays.toString(arrayString));
		exchangeElements(arrayInt, 0, 1);
		System.out.println(Arrays.toString(arrayInt));
	}
	
	//method change element in array
	
	public static <T> void exchangeElements(T[] array, int postionOne, int positionTwo) {
		try {
			T swap = array[postionOne];
			array[postionOne] = array[positionTwo];
			array[positionTwo] = swap;
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
