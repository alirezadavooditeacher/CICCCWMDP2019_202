import services.*;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client("Ali", "Vancouver", "778");
		PaintingProvider provider = new PaintingProvider("David", "Burnaby", "YourBestPainter");
		client.setPaintingProvider(provider);
		provider.receiveService();
	}

}
