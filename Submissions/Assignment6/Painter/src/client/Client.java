package client;

import services.*;

public class Client implements PrintingServiceProtocolInterface, CleaningServiceProtocolInterface, CarRepairServiceProtocolInterface, HomeServiceProtocolInterface, StudentServiceProtocolInterface{
	
	@Override
	public PaintingService paintingService() {
		String description = "Paint my bedroom";
		String startDate = "May 2019";
		String expectedEndDate = "June 2019";
		String painingColor = "Pink";
		int size = 1000;
		String address = "Hastings";
		
		PaintingService ps = new PaintingService(description, startDate, expectedEndDate, painingColor, size, address);
		return ps;
	}

	@Override
	public CleaningService cleaningService() {
		String description = "Clean my garden.";
		
		CleaningService cs = new CleaningService(description);
		return cs;
	}

	@Override
	public CarRepairService carRepairService() {
		// TODO Auto-generated method stub
		String description = "Repair my car.";
		String model = "Honda ZEST";
		
		CarRepairService crs = new CarRepairService(description, model);
		return crs;
	}

	@Override
	public HomeService cooking() {
		// TODO Auto-generated method stub
		
		String category = "Cooking";
		String description = "Cook Japanese food";
		float budget = 30;
		
		HomeService hsc = new HomeService(category, description, budget);
		return hsc;
	}

	@Override
	public HomeService doingTheDishes() {
		// TODO Auto-generated method stub
		String category = "Doing the dishes";
		String description = "Remove the stains on cups";
		int date = 20190623;
		
		HomeService hsd = new HomeService(category, description, date);
		return hsd;
	}

	@Override
	public HomeService babySitting() {
		// TODO Auto-generated method stub
		String category = "Baby sitting";
		String description = "Don't make my baby cry.";
		int age = 3;
		String gender = "boy";
		
		HomeService hsb = new HomeService(category, description, age, gender);
		return hsb;
	}

	@Override
	public StudentService studentService() {
		// TODO Auto-generated method stub
		String name = "Shin";
		int age = 37;
		
		StudentService ss = new StudentService(name, age);
		return ss;
	}
	
	
}