package assignment6;

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
