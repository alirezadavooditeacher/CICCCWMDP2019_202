public class Drink extends Product {

    private boolean isDrinkDiet;
    private Integer drinkSize;

    public Drink(Integer productID, String productName, float productPrice, String productMadeInCountry, boolean isDrinkDiet, Integer drinkSize) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize = drinkSize;
    }

    public boolean isDrinkDiet() {
        return isDrinkDiet;
    }

    public void setDrinkDiet(boolean drinkDiet) {
        isDrinkDiet = drinkDiet;
    }

    public Integer getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(Integer drinkSize) {
        this.drinkSize = drinkSize;
    }
}
