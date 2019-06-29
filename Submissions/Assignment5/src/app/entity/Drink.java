package app.entity;

public class Drink extends Product {
    protected boolean isDrinkDiet;
    protected Integer drinkSize;

    public Drink(Integer id, String name, Float price, String madeInCountry, boolean isDrinkDiet, Integer drinkSize) {
        super(id, name, price, madeInCountry);
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize = drinkSize;
    }
}
