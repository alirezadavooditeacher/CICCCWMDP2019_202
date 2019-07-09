import viewAndTable.*;
public class ApplicationDriver {
	public static void main(String[] args) {
		//Has the info object.
		View v1 = new View();
		String[] s1= {"Theresa","May","59"};
		String[] s2= {"Thomas","Throdeau","74"};
		String[] s3= {"Tony","Blair","64"};
		v1.addInformationTable(s1);
		v1.addInformationTable(s2);
		v1.addInformationTable(s3);
		//Need the info object.
		Table table1 = new Table();
		//Object connection.
		v1.setTablePrinter(table1);
		table1.printData();
		
		
	}
}
