import services.*;

public class ApplicationDriver {

	public static void main(String[] args) {
		Client client = new Client("Ali", "Vancouver", "778");
		PaintingProvider provider = new PaintingProvider("David", "Burnaby", "YourBestPainter");
		client.setPaintingProvider(provider);
		provider.receiveService();
		
		CleaningProvider cProvider = new CleaningProvider();
		client.setCleaningProvider(cProvider);
		cProvider.receiveService();
	}

}
