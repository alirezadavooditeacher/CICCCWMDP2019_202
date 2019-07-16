package assignment6;

public class CarRepairServiceProvider {

    private String description;
    private String carModel;
    public CarRepairServiceProvider(String description, String carModel) {
        this.description = description;
        this.carModel = carModel;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCarModel() {
        return this.carModel;
    }

}
