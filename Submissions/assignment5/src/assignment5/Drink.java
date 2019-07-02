/**
 *
 */
package assignment5;

/**
 * @author miyamotoatsushi
 *
 */
public class Drink extends Product{
    Integer drinkID;
    String drinkName;
    Float drinkPrice;
    String drinkMadeInCountry;
    Boolean isDrinkDiet;
    Integer drinkSize;



    public Drink(Integer drinkID, String drinkName, Float drinkPrice, String drinkMadeInCountry, Boolean isDrinkDiet, Integer drinkSize) {
        super(drinkID, drinkName, drinkPrice, drinkMadeInCountry);
        this.drinkID = drinkID;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkMadeInCountry = drinkMadeInCountry;
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize = drinkSize;
    }
}

