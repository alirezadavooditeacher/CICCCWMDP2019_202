package Problem1;

import Problem1.service.CarRepairServiceProvider;
import Problem1.service.CleaningProvider;
import Problem1.service.Client;
import Problem1.service.HomeServiceProvider;
import Problem1.service.PaintingProvider;
import Problem1.service.StudentServicesProvider;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client("Ali", "Vancouver", "778");
		PaintingProvider provider = new PaintingProvider("David", "Burnaby", "YourBestPainter");
		client.setPaintingProvider(provider);
		provider.receiveService();
		
		CleaningProvider cProvider = new CleaningProvider();
		client.setCleaniningProvider(cProvider);
		cProvider.receiveService();
		
		
		CarRepairServiceProvider carRepairServiceProvider = new CarRepairServiceProvider();
		client.setCarRepairServiceProvider(carRepairServiceProvider);
		carRepairServiceProvider.receiveService();
		
		HomeServiceProvider homeServiceProvider = new HomeServiceProvider();
		client.setHomeServiceProvider(homeServiceProvider);
		homeServiceProvider.receiveCookingService();
		homeServiceProvider.receiveWashingService();
		homeServiceProvider.receiveBabySittingService();
		
		StudentServicesProvider studentServicesProvider = new StudentServicesProvider();
		client.setStudentServicesProvider(studentServicesProvider);
		studentServicesProvider.receiveService();
		
//		String description = "Paint my bedroom";
//		String startDate = "May 2019";
//		String expectedEndDate = "June 2019";
//		String painingColor = "Pink";
//		int size = 1000;
//		String address = "Hastings";
//	
//		
//		PaintingService paintingService = new PaintingService(description, 
//				startDate, 
//				expectedEndDate, 
//				painingColor, 
//				size, 
//				address, client);
//		
//		paintingService.setProvider(provider);
//		
	}

}
