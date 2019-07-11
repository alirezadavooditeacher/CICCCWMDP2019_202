package home;

import home.HomeService;

public class CookingService extends HomeService {
    private int price;
    private String food;


    public CookingService(String description, int price, String food) {
        super(description);
        this.price = price;
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


}
