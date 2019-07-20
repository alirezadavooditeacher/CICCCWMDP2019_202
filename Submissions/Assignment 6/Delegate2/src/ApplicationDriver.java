import services.*;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client("Ali", "Vancouver", "778");
		PaintingProvider provider = new PaintingProvider("David", "Burnaby", "YourBestPainter");
		client.setPaintingProvider(provider);
		provider.receiveService();
		System.out.println("--------------");
		CarRepairServiceProvider carRepair = new CarRepairServiceProvider("Tommy", "Mexico", "Los Polos Hermanos");
		client.setCarRepairServiceProvider(carRepair);
		carRepair.receiveService();
	}

}
