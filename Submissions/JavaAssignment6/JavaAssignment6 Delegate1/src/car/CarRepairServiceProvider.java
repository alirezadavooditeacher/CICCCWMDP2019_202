package car;

import car.CarRepairService;
import car.CarRepairServiceProtocolInterface;

public class CarRepairServiceProvider {
    public CarRepairServiceProtocolInterface delegate; //delegate

    public void receiveService(){
        CarRepairService crs = this.delegate.carRepairService();

        System.out.println("description" + crs.getDescription());
        System.out.println("model" + crs.getCarModel());

    }
}
