package problem0;

public class Drink extends problem0.Product {
    private boolean isDrinkDiet;
    private int drinkSize;

    public Drink(int productID, String productName, float productPrice, String productMadeInCountry, boolean isDrinkDiet, int drinkSize) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize = drinkSize;
    }

}
