package home;

import home.HomeService;

public class BabySittingService extends HomeService {
    private int hour;
    private String babyName;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }

    public BabySittingService(String description, int hour, String babyName) {
        super(description);
        this.hour = hour;
        this.babyName = babyName;
    }
}
