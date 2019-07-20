
import client.Client;
import services.*;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PaintingProvider pProvider = new PaintingProvider(new Client());
//		pProvider.receiveService();
//		
//		CleaningProvider cProvider = new CleaningProvider(new Client());
//		cProvider.receiveService();
		
		//Assignment6 Problem0-1
		CarRepairProvider crProvider = new CarRepairProvider(new Client());
		crProvider.recieveService();
		
		//Assignment6 Problem0-2
		HomeServiceProvider hsProvider = new HomeServiceProvider(new Client());
		hsProvider.recieveService();
		
		//Assignment6 Problem0-3
		StudentServiceProvider ssProvider = new StudentServiceProvider(new Client());
		boolean result = ssProvider.receiveService();
		ssProvider.infom(result);
	}

}