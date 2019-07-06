package services;

public class CarRepairService {
    private String description;
    private String model;

    public CarRepairService(String description, String model) {
        this.description = description;
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
