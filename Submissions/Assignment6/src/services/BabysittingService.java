package services;

public class BabysittingService extends HomeService {
    private String babyName;

    public BabysittingService(String description, String babyName) {
        super(description);
        this.babyName = babyName;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }
}
