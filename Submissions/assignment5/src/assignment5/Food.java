/**
 *
 */
package assignment5;

import java.util.ArrayList;

/**
 * @author miyamotoatsushi
 *
 */
public class Food extends Product{

    Integer foodID;
    String foodName;
    Float foodPrice;
    String foodMadeInCountry;
    Integer foodCalorie;
    Integer foodSize;
    ArrayList<String> foodIngredients;

    public Food(Integer foodId, String foodName, Float foodPrice, String foodMadeInCountry, Integer foodCalorie, Integer foodSize, ArrayList<String> foodIngredients) {
        super(foodId, foodName, foodPrice, foodMadeInCountry);
        this.foodID = foodId;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodMadeInCountry = foodMadeInCountry;
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }

}