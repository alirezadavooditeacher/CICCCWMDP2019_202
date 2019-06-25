import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class Problem9 {
	

	public ArrayList<ArrayList<Integer>> mkTable(int row, int column) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> weightTable = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer, Integer> zeroList = new HashMap<Integer, Integer>();
		zeroList.put(0, 0);
		zeroList.put(0, 7);
		zeroList.put(0, 8);
		zeroList.put(1, 2);
		zeroList.put(3, 5);
		zeroList.put(3, 8);
		zeroList.put(4, 5);
		zeroList.put(4, 8);
		zeroList.put(5, 1);
		zeroList.put(5, 2);
		zeroList.put(5, 3);
		zeroList.put(5, 4);
		zeroList.put(5, 5);
		zeroList.put(5, 8);
		zeroList.put(6, 7);
		zeroList.put(7, 3);
		zeroList.put(7, 4);
		zeroList.put(7, 5);
		zeroList.put(7, 6);
//		int[][] zeroList = {
//				{0, 0},{0,7},{0, 8},
//				{1, 2},
//				{3, 5},{3, 8},
//				{4, 5},{4, 8},
//				{5, 1},{5, 2},{5, 3},{5, 4},{5, 5},{5, 8},
//				{6, 5},
//				{7, 3},{7, 4},{7, 5},{7, 6}
//			};
		for (int i = 0; i < row; i++) {
			ArrayList<Integer> rowTable = new ArrayList<Integer>();
			for (int j = 0; j < column; j++) {
				HashMap<Integer, Integer> compList = new HashMap<Integer, Integer>();
				compList.put(i, j);
				int weight;
				if (zeroList.equals(compList)) {
					weight = 0;
					System.out.printf("%3d", weight);
				} else {
					weight = (i + j) * 3 - 10;
					System.out.printf("%3d", weight);
				}
				rowTable.add(weight);
			}
			System.out.println("");
			weightTable.add(rowTable);
		}
		return weightTable;
	}

//	public ArrayList<HashMap<Integer, Integer>> mkTable(int row, int column) {
		// TODO Auto-generated method stub
		
//		ArrayList<HashMap<Integer, Integer>> table = new ArrayList<HashMap<Integer, Integer>>();
//		HashMap<Integer, Integer> columnValue = new HashMap<Integer, Integer>();
//		
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < column; j++) {
//				columnValue.put(j, i);
//			}
//			table.add(columnValue);
//		}
//		return table;
		
		
//	}


	
}
