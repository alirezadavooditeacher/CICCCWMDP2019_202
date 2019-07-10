public class Drink extends Product {
    private boolean isDrinkDiet;
    private int drinkSize;

    public Drink(int drinkID, String drinkName, float drinkPrice, String madeInCountry, boolean isDrinkDiet, int drinkSize){
        super(drinkID, drinkName, drinkPrice, madeInCountry);
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize = drinkSize;
    }
}
