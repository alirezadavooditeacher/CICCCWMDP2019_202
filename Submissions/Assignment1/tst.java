package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tst {
	public static void main() {
		System.out.println("\n");
	
		List<List<String>> list = new ArrayList<List<String>>();
		for(int i = 0; i < 10; i++)  {
	        list.add(new ArrayList<String>());
	    }
		System.out.println(list);
		
		ArrayList<String>[][] list1 = new ArrayList[10][10];
		list1[0][0] = new ArrayList<>();
		list1[0][0].add("test");
	
		System.out.println(list1);
	}

}
