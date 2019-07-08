package services.Problem1;

import services.Problem1.CarRepair.CarRepairServiceProvider;
import services.Problem1.Home.HomeServiceProvider;
import services.Problem1.Student.ClientInform;
import services.Problem1.Student.StudentServiceProvider;

public class ApplicationDriver {

	public static void main(String[] args) {
		Client client = new Client("Marcus", "Vancouver", "1123");

		PaintingProvider provider = new PaintingProvider("Chris", "Vancouver", "PaintJohn");
		client.setPaintingProvider(provider);
		provider.receiveService();

		CleaningProvider cleaningProvider = new CleaningProvider();
		client.setCleaningProvider(cleaningProvider);
		cleaningProvider.receiveService();

		CarRepairServiceProvider carProvider = new CarRepairServiceProvider();
		client.setCarRepairProvider(carProvider);
		carProvider.receiveService();

		HomeServiceProvider homeServiceProvider = new HomeServiceProvider();
		client.setHomeServiceProvider(homeServiceProvider);
		homeServiceProvider.receiveService();

		StudentServiceProvider studentServicesProvider = new StudentServiceProvider("Marcus");
		client.setStudentServiceProvider(studentServicesProvider);
		studentServicesProvider.receiveService();

		ClientInform clientInform = new ClientInform();
		clientInform.setStudentServiceProvider(studentServicesProvider);
		studentServicesProvider.receiveService();
	}

}
