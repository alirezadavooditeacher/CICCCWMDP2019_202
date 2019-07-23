package services;

import java.util.Random;

public class Client implements PaintingServiceProtocolInterface, CleaningServiceProtocolInterface, CarRepairServiceProtocolInterface, HomeServiceProtocolInterface, StudentServiceProtocolInterface {

    private String name;
    private String address;
    private String contactNo;
    private PaintingProvider paintingProvider;
    private CleaningProvider cleaningProvider;
    private CarRepairProvider carRepairProvider;
    private HomeServiceProvider homeServiceProvider;
    private StudentServicesProvider studentServiceProvider;

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

    public void setCarRepairProvider(CarRepairProvider provider) {
        carRepairProvider = provider;
        carRepairProvider.delegate = this;
    }

    public void setHomeServiceProvider(HomeServiceProvider provider) {
        homeServiceProvider = provider;
        homeServiceProvider.delegate = this;
    }

    public void setStudentServiceProvider(StudentServicesProvider provider) {
        studentServiceProvider = provider;
        studentServiceProvider.delegate = this;
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
        return new CarRepairService("Car Repair Service", "Toyota 86");
    }


    @Override
    public CookingService cookingService() {
        Random r = new Random();
        return new CookingService("Cooking Service", r.nextBoolean());
    }

    @Override
    public WashingService washingService() {
        return new WashingService("Washing Service", 10);
    }

    @Override
    public BabysittingService babysittingService() {
        return new BabysittingService("Babysitting", "John");
    }

    @Override
    public StudentService studentService() {
        return new StudentService("John Doe");
    }
}
