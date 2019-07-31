public class Drink extends Object {
    Boolean isDrinkDiet;
    Integer drinkSize;

    Drink(int productID, String productName, Float productPrice, String productMadeInCountry, Boolean isDrinkDiet, Integer drinkSize) {
        super( productID, productName, productPrice, productMadeInCountry );
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize = drinkSize;
    }

    @Override
    public String toString() {
        int productID = this.productID;
        String productName = this.productName;
        Float productPrice = this.productPrice;
        String productMadeInCountry = this.productMadeInCountry;
        Boolean isDrinkDiet = this.isDrinkDiet;
        Integer drinkSize = this.drinkSize;
        String isDrinkDietOutPrint;

        if (isDrinkDiet == false){
            isDrinkDietOutPrint = "NO";
        } else {
            isDrinkDietOutPrint = "YES";
        }

        String message =
                "Drink ID :\t\t\t\t\t" + productID + "\nDrink Name :\t\t\t\t" + productName + "\nDrink Price " +
                        ":\t\t\t\t" + productPrice + "\nDrink Made In Country :\t\t" + productMadeInCountry + "\nIs " +
                        "Drink Diet :\t\t\t\t" + isDrinkDietOutPrint + "\nDrink Size :\t\t\t\t" + drinkSize;
        return message;
    }
}
