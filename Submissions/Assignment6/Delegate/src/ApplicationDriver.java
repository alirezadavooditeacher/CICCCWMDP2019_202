import services.*;
import homeWork.*;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client usuario = new Client("Ali", "Vancouver", "778");
		PaintingProvider camellador = new PaintingProvider("David", "Burnaby", "YourBestPainter");
		usuario.setPaintingProvider(camellador);
		camellador.receiveService();
		
		CleaningProvider cProvider = new CleaningProvider();
		usuario.setCleaniningProvider(cProvider);
		cProvider.receiveService();
		
		CarRepairServiceProvider carProvider=new CarRepairServiceProvider("Ricardo","Surrey","RickCar");
		usuario.setCarRepairProvider(carProvider);
		carProvider.recieveService();
		
		HomeServiceProvider homeWorker= new HomeServiceProvider("Juanes","Richmond","JuanClean");
		usuario.setHomeServiceProvider(homeWorker);
		homeWorker.recieveBabbyService();
		homeWorker.recieveCookingService();
		homeWorker.recieveWashingService();
		
		StudentServiceProvider studentWorker = new StudentServiceProvider("Mathew","Burnaby","MathewMath");
		usuario.setStudentProvider(studentWorker);
		studentWorker.recieveStudentService();
		
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
