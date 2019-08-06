
public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Weather w = new Weather(); //observable
		
		NewStation ns1 = new NewStation(); //observer
		w.addObserver(ns1);
		
		RadioStation rs1 = new RadioStation(); //observer
		w.addObserver(rs1);
		
		//changes
		try {
			Thread.sleep(2000);
			w.setTemprature(10);
			Thread.sleep(2000);
			w.setTemprature(20);
			Thread.sleep(2000);
			w.setTemprature(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
