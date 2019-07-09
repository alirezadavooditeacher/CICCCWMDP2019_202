import java.util.ArrayList;
import java.util.List;

public class Problem7 {
	public static int linearSearch(List<Integer> listInteger, int key){    
        for(int i = 0; i< listInteger.size();i++){    
            if(listInteger.get(i) == key){    
                return i;    
            }    
        }    
        return -1;    
    }
	
	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);
		listInteger.add(4);
		int key = 4;
		System.out.println(Problem7.linearSearch(listInteger, key));
	}
}
