import services.*;
import services.CarRepair.CarRepairServiceProvider;
import services.Home.HomeServiceProvider;
import services.Student.*;

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
