package services;

public class CarRepairServiceProvider extends Provider{

    public CarRepairServiceProtocolInterface delegate;

    public CarRepairServiceProvider(String name, String address, String company){
        super(name, address, company);
    }

    public void receiveService(){
        CarRepairService crs = this.delegate.carRepairService();
        System.out.println(crs.getDescription());
        System.out.println(crs.getStartDate());
        System.out.println(crs.getExpectedEndDate());
        System.out.println(crs.getCarModel());
    }
}
