package services;

public class Client implements ServiceProtocolInterface, CleaningServiceProtocolInterface, CarRepairServiceProtocolInterface , HomeServiceProtocolInterface{

	private String name;
	private String address;
	private String contactNo;
	private PaintingProvider paintingProvider;
	private CleaningProvider cleaningProvider;
	private CarRepairServiceProvider carRepairServiceProvider;
	private HomeServiceProvider homeServiceProvider;
	
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
		return null;
	}

	@Override
	public CookingService cookingService() {
		return null;
	}

	@Override
	public WashingService washingService() {
		return null;
	}

	@Override
	public BabySittingService babysittingService() {
		return null;
	}
}
