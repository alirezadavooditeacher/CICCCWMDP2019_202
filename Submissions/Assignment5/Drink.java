package assignment5;

public class Drink extends Product {

    private Boolean isDrinkDiet;
    private Integer drinkSize;

    public Drink(Integer productID, String productName, Float productPrice, String productMadeInCountry, Boolean isDrinkDiet, Integer drinkSize) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize = drinkSize;
    }
}
