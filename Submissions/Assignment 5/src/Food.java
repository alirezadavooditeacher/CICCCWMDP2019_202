public class Food extends Product {
    private int foodCalorie;
    private int foodSize;
    private String[] foodIngredients;

    public Food(int foodID, String foodName, float foodPrice, String foodMadeInCountry, int foodCalorie, int foodSize, String[] foodIngredients){
        super(foodID, foodName, foodPrice, foodMadeInCountry);
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }
}
