package services;

public class CarRepairServiceProvider {

    public CarRepairServiceProtocolInterface delegate;
    
    public void receiveService(){
        CarRepairService crs = this.delegate.carRepairService();
        System.out.println(crs.getDescription());
    }
}
