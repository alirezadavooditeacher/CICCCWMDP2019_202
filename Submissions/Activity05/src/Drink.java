package src;

public class Drink extends Product {
    private Integer drinkID;
    private String drinkName;
    private Float drinkPrice;
    private String drinkMadeInCountry;
    private Boolean isDrinkDiet;
    private Integer drinkSize;

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
