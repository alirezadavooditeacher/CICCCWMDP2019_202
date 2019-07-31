import java.util.Arrays;

public class Food extends Object {
    Integer foodCalorie;
    Integer foodSize;
    String[] foodIngredients;

    Food(int productID, String productName, Float productPrice, String productMadeInCountry,Integer foodCalorie,
         Integer foodSize, String[] foodIngredients) {
        super( productID, productName, productPrice, productMadeInCountry );
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }

    @Override
    public String toString() {
        int productID = this.productID;
        String productName = this.productName;
        Float productPrice = this.productPrice;
        String productMadeInCountry = this.productMadeInCountry;
        Integer foodCalorie = this.foodCalorie;
        Integer foodSize = this.foodSize;
        String[] foodIngredients = this.foodIngredients;

        String message =
                "Food ID :\t\t\t\t" + productID + "\nFood Name :\t\t\t\t" + productName + "\nFood Price " +
                        ":\t\t\t" + productPrice + "\nFood Made In Country :\t" + productMadeInCountry + "\nFood" +
                        " Calorie :\t\t\t" + foodCalorie + "\nFood Ingredients :\t\t" + Arrays.toString(foodIngredients);
        return message;
    }
}
