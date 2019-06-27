package Problem;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
	public static void MakeDictionary() {
				String Num1, Num2, Num3, ave1, ave2, ave3;
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("name","Lea Axel");map1.put("add","224");map1.put("birth","May 13th");map1.put("ave","340");
		Map<String, String> map2 = new HashMap<>();
		map2.put("name","Sora Roxas");map2.put("add","232");map2.put("birth","Martch 13th");map2.put("ave","412");
		Map<String, String> map3 = new HashMap<>();
		map3.put("name","Braig Xigbar");map3.put("add","604");map3.put("birth","Jun 13th");map3.put("ave","263");
		
		Num1=map1.get("name");
		ave1=map1.get("ave");
		Num2=map2.get("name");
		ave2=map2.get("ave");
		Num3=map3.get("name");
		ave3=map3.get("ave");
		
		int Ave1=Integer.parseInt(ave1);
		int Ave2=Integer.parseInt(ave2);
		int Ave3=Integer.parseInt(ave3);
		
		if (Ave1>Ave2 && Ave1>Ave3) {
			System.out.println(Num1+":"+Ave1);
		}if (Ave2>Ave3) {
			System.out.println(Num2+":"+Ave2);
		}else {
			System.out.println(Num3+":"+Ave3);
		}
		
	}

}
