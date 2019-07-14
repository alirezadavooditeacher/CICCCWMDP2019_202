package program3;
import java.util.ArrayList;

public class BusinessLogicP3 {
	public static <E> void exchangeElements(ArrayList<E> array, E element1, E element2) {
		int e1Index = array.indexOf(element1);
		int e2Index = array.indexOf(element2);
		E temp = element1;
		//array.remove(e1Index);
		array.set(e1Index, element2);
		array.set(e2Index, temp);
		
		//e1Index-1 < 0 ? e1Index=0 : e1Index--;
		
	}

}
