package viewAndTable;

import java.util.ArrayList;

public class View implements DataTransfer{
	//in delegate protocol: View has the information
	private ArrayList<String[]> informationTable= new ArrayList<String[]>();
	private Table table;

	public ArrayList<String[]> getInformationTable() {
		return informationTable;
	}

	public void addInformationTable(String[] individualInfo) {
		this.informationTable.add(individualInfo);
	}
	public void removeInformationTable(String[] individualInfo) {
		this.informationTable.remove(individualInfo);
	}
	public void setTablePrinter (Table tablePrinter) {
		this.table = tablePrinter;
		this.table.delegate = this;
	}
	
	 
	
	@Override
	public ArrayList<String[]> informationTableTransfer() {
		return this.informationTable;
	}

	public int tableRows() {
		ArrayList<String[]> infoTable=this.informationTable;
		int tablerow=infoTable.size();
		return 0;
	}
}
