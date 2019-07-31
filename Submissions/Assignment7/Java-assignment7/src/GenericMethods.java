import java.util.ArrayList;

public class GenericMethods <T extends Comparable<T>> {
	
//	public static <K, V, C> int getNumbers(ArrayList<SearchObject<K, V, C>> objectList, V searchValue) {
//		int foundNumber = 0;
//		for (SearchObject object: objectList) {
//			if (object.serachByValue()searchValue) {
//				foundNumber++;
//			}
//		}
//		return foundNumber;
//	}
	
	public static <T> int countNumberOfElementsWithSpecificProperty(ArrayList<SearchObject> objectList, T value) {
		int foundNumber = 0;
		for (SearchObject st: objectList) {
			int compareResult = ((Comparable<T>) st.searchByValue()).compareTo(value);
			if (compareResult > 0) {
				foundNumber++;
			}
		}
		return foundNumber;
	}
	
	public static <T> void exchangeElements(T[] sthList, int length) {
		for (int i = 0; i < length/2; i++) {
			int reverseIndex = length - (i + 1);
			T tempValue = sthList[i];
			sthList[i] = sthList[reverseIndex];
			sthList[reverseIndex] = tempValue;
		}
		
		int index = 1;
		for (T sth: sthList) {
			System.out.println(index + ": " + sth);
			index++;
		}
	}
	
	private ArrayList<T> sthList = new ArrayList<T>();
	
	public void addItemToList(T e) {
		this.sthList.add(e);
	}
	
	public void removeItemFromTheList(T e) {
		this.sthList.remove(e);
	}
	
	public ArrayList<T> performOperation(T x) {
		ArrayList<T> resultList = new ArrayList<T>();
		for (T sth: this.sthList) {
			if (sth.compareTo(x) >= 0) {
				resultList.add(x);
			}
		}
		return resultList;
	}
	
}
