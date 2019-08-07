package Problem0.services;

public class Client implements ServiceProtocolInterface, CleaningServiceProtocolInterface,
		CarRepairServiceProtocalInterface, HomeServiceProtocolInterface, StudentServiceProtocalInterface {

	private String name;
	private String address;
	private String contactNo;
	private PaintingProvider paintingProvider;
	private CleaningProvider cleaningProvider;
	private CarRepairServiceProvider carRepairServiceProvider;
	private HomeServiceProvider homeServiceProvider;
	private StudentServicesProvider studentServicesProvider;

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

	public void setCleaniningProvider(CleaningProvider cleaningP) {
		this.cleaningProvider = cleaningP;
		this.cleaningProvider.delegate = this;
	}
	
	public void setCarRepairServiceProvider(CarRepairServiceProvider carRepairServiceProvider) {
		this.carRepairServiceProvider = carRepairServiceProvider;
		this.carRepairServiceProvider.delegate = this;
	}

	public void setHomeServiceProvider(HomeServiceProvider homeServiceProvider) {
		this.homeServiceProvider = homeServiceProvider;
		this.homeServiceProvider.delegate = this;
	}

	public void setStudentServicesProvider(StudentServicesProvider studentServicesProvider) {
		this.studentServicesProvider = studentServicesProvider;
		this.studentServicesProvider.delegate = this;
	}
	
	
	// =======================
//	@Override
//	public String jobDescription() {
//		// TODO Auto-generated method stub
//		return "This is a painting job of my bedroom";
//	}
//
//	@Override
//	public String address() {
//		// TODO Auto-generated method stub
//		return "Vancouver";
//	}
//
//	@Override
//	public String paintColor() {
//		// TODO Auto-generated method stub
//		return "Pink";
//	}
//
//	@Override
//	public int size() {
//		// TODO Auto-generated method stub
//		return 1000;
//	}
//
//	@Override
//	public String startDate() {
//		// TODO Auto-generated method stub
//		return "May 2019";
//	}
//
//	@Override
//	public String expectedEndDate() {
//		// TODO Auto-generated method stub
//		return "June 2019";
//	}

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
	public StudentServices studentServices() {
		StudentServices studentServices = new StudentServices("Student Services");
		return studentServices;
	}

	@Override
	public CookingService cookingService() {
		CookingService cookingService = new CookingService("Cooking Services");
		return cookingService;
	}

	@Override
	public WashingService washingService() {
		WashingService washingService = new WashingService("Washing Service");
		return washingService;
	}

	@Override
	public BabySittingService babySittingService() {
		BabySittingService babySittingService = new BabySittingService("BabySitting Service");
		return babySittingService;
	}

	@Override
	public CarRepairService carRepairService() {
		CarRepairService carRepairService = new CarRepairService("CarRepair Service", "12345");
		return carRepairService;
	}
}
