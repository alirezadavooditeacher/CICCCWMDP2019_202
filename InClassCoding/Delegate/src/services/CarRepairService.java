package services;

public class CarRepairService {
    private String description;
    private String carModel;

    public String getDescription() {
        return description;
    }

    public String getCarModel() {
        return carModel;
    }

    public CarRepairService(String description, String carModel){
        super();
        this.description = description;
        this.carModel = carModel;
    }
}
