package services;

public class CookingService extends HomeService {
    private boolean vegan;

    public CookingService(String description, boolean vegan) {
        super(description);
        this.vegan = vegan;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }
}
