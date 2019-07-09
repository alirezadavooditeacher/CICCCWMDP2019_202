import java.util.ArrayList;
import java.util.List;

public class Problem8 {
	public static List<Integer> removeItem(List<Integer> listInteger, int key){    
        for(int i = 0; i< listInteger.size();i++){    
            if(listInteger.get(i) == key){    
                listInteger.remove(i);
            }    
        }    
        return listInteger;    
    }
	
	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);
		listInteger.add(4);
		int key = 4;
		System.out.println(Problem8.removeItem(listInteger, key));
	}
}
