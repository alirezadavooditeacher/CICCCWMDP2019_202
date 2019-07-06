package services;

public class CarRepairService extends Service {
    private String carModel;

    public String getCarModel() {
        return carModel;
    }

    public CarRepairService(String description, String startDate, String endDate, String carModel){
        super(description, startDate, endDate);
        this.carModel = carModel;
    }
}
