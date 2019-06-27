package Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem5 {
	public static Map<Integer, String> MakeEmpptyDictionary(){
		Map<Integer, String> dictionary = new HashMap<>();
		return dictionary;
	}
	public static Map<Integer,String> InputNameTillEnter0(Map<Integer,String> dictionary) {
		
		String  name;
		Scanner Read = new Scanner (System.in);
		System.out.println("Enter the Name untill input 0");
		int key=0;
		name = Read.nextLine();
		while (name!="0") {
			dictionary.put(key, name);
			name = Read.nextLine();
			key=key+1;
		if (name=="0") {
			break;
		}
		}
		System.out.println("aa"+dictionary);
		Read.close();
		return dictionary;
	}
	public static void TheMostRepeatedNum(Map<Integer,String> dictionary) {
		
		for (int i=0;i<dictionary.size();i++) {
		    String a=dictionary.get(i);
			int counter=0;
			for (int j=0;j<dictionary.size();j++) {
				String b=dictionary.get(j);
				
				if(a==b) {
					counter+=1;
				}	
			}
			System.out.println(a+":"+counter);
	        }	
	}
	
}
