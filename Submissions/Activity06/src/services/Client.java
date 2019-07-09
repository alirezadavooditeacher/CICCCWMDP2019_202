package services;

import services.CarRepair.CarRepairService;
import services.CarRepair.CarRepairServiceProtocolInterface;
import services.CarRepair.CarRepairServiceProvider;
import services.Home.*;
import services.Student.StudentService;
import services.Student.StudentServiceProtocolInterface;
import services.Student.StudentServiceProvider;

public class Client implements
		ServiceProtocolInterface
		, CleaningServiceProtocolInterface
		, CarRepairServiceProtocolInterface
		, HomeServiceProtocolInterface
		, StudentServiceProtocolInterface
{

	private String name;
	private String address;
	private String contactNo;
	private PaintingProvider paintingProvider;
	private CleaningProvider cleaningProvider;
	private CarRepairServiceProvider carRepairServiceProvider;
	private HomeServiceProvider homeServiceProvider;
	private StudentServiceProvider studentServiceProvider;

	public Client(String name, String address, String contactNo) {
		super();
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public void setPaintingProvider(PaintingProvider paintingP) {
		this.paintingProvider = paintingP;
		this.paintingProvider.delegate = this;
	}

	public void setCleaningProvider(CleaningProvider cleaningP) {
		this.cleaningProvider = cleaningP;
		this.cleaningProvider.delegate = this;
	}

	public void setCarRepairProvider(CarRepairServiceProvider carRepairProvider) {
		this.carRepairServiceProvider = carRepairProvider;
		this.carRepairServiceProvider.delegate = this;
	}

	public void setHomeServiceProvider(HomeServiceProvider homeServiceProvider) {
		this.homeServiceProvider = homeServiceProvider;
		this.homeServiceProvider.delegate = this;
	}

	public void setStudentServiceProvider(StudentServiceProvider studentServiceProvider) {
		this.studentServiceProvider = studentServiceProvider;
		this.studentServiceProvider.delegate = this;
	}

	@Override
	public PaintingService paintingService() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		CleaningService cleaningService = new CleaningService("Cleaning Service");
		return cleaningService;
	}

	@Override
	public CarRepairService carRepairService() {
		CarRepairService carRepairService = new CarRepairService("Car Repair Service");
		return carRepairService;
	}

	@Override
	public BabySittingService babySittingService() {
		return new BabySittingService(2,3, "baby sitting service");
	}

	@Override
	public WashingService washingService() {
		return new WashingService(4, 50, "washing service");
	}

	@Override
	public CookingService cookingService() {
		return new CookingService(true, "Indian", "cooking service");
	}

	@Override
	public StudentService studentService() {
		return new StudentService("Marcus", 4);
	}
}
