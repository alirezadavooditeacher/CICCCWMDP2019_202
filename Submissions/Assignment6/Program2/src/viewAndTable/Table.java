package viewAndTable;

import java.util.ArrayList;
import java.util.Iterator;

public class Table {

	public DataTransfer delegate;
	//in delegate protocol: TABLE needs the info.
	
	public ArrayList<String[]> recieveData() {
		ArrayList<String[]> t = this.delegate.informationTableTransfer();
		return t;
		}
	public void printData() {
		ArrayList<String[]> t = this.recieveData();
		int tableRows=t.size();
		Iterator<String[]> it = t.iterator();
		while(it.hasNext()) {
			String[] indivInfo = it.next();
			System.out.println("----------------------------------");
			System.out.println(indivInfo[0]+" "+indivInfo[1]+", "+indivInfo[2]);
			System.out.println("----------------------------------");
		}
	}
}
