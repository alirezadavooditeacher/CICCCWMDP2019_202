package viewAndTable;

import java.util.ArrayList;

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
		
	}
}
