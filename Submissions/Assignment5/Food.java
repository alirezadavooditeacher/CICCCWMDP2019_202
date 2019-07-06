import java.lang.reflect.Array;
import java.util.*;

public class Food extends Product{

    private Integer foodCalorie;
    private Integer foodSize;
    private Array foodIngredients;

    public Food(Integer productID, String productName, float productPrice, String productMadeInCountry, Integer foodCalorie, Integer foodSize, Array foodIngredients) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }

    public Integer getFoodCalorie() {
        return foodCalorie;
    }

    public void setFoodCalorie(Integer foodCalorie) {
        this.foodCalorie = foodCalorie;
    }

    public Integer getFoodSize() {
        return foodSize;
    }

    public void setFoodSize(Integer foodSize) {
        this.foodSize = foodSize;
    }

    public Array getFoodIngredients() {
        return foodIngredients;
    }

    public void setFoodIngredients(Array foodIngredients) {
        this.foodIngredients = foodIngredients;
    }
}
