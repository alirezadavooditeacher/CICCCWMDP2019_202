package assignment5;

import java.util.List;

public class Food extends Product{

    private Integer foodCalorie;
    private Integer foodSize;
    private List<String> foodIngredients;

    public Food(Integer productID, String productName, Float productPrice, String productMadeInCountry, Integer foodCalorie, Integer foodSize, List<String> foodIngredients) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }
}
