package src;

import java.util.ArrayList;

public class Food extends Product {
    private Integer foodId;
    private String foodName;
    private Float foodPrice;
    private String foodMadeInCountry;
    private Integer foodCalorie;
    private Integer foodSize;
    private ArrayList<String> foodIngredients;

    public Food(Integer foodId, String foodName, Float foodPrice, String foodMadeInCountry, Integer foodCalorie, Integer foodSize, ArrayList<String> foodIngredients) {
        super(foodId, foodName, foodPrice, foodMadeInCountry);
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodMadeInCountry = foodMadeInCountry;
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }

    public Integer getFoodSize() {
        return foodSize;
    }

    public Float getPrice() {
        return super.getPrice() * getFoodSize();
    }
}
