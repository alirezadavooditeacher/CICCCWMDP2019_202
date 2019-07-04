package assignment5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ApplicationDriver {

    public static void main(String[] args) {

        // Problem0
        Product product = new Product(110, "Diet Pepsi", 2f, "USA");


        // Problem1
        Drink drink1 = new Drink(201, "Perrier", 3f, "Switzerland", false, 350);
        Food food1 = new Food( 304, "Twinkies", 7f, "USA", 1450, 380, Arrays.asList("flour", "sugar", "corn syrup"));

        Map<Integer,String> map1 = new HashMap<Integer, String>() {
            {
                put(13, "hemp");
            }
        };
        Cloth cloth1 = new Cloth(324, "Jacket", 400f, "Japan", map1);

        Material material1 = new Material(404, "Silk");


        // Problem2
        Drink drink2 = new Drink(412, "Pepsi", 2f, "USA", false, 150);

        Drink drink3 = new Drink(183, "Ginger Zero", 3f, "Canada", true, 200);

        Food food2 = new Food(100, "Chicken", 8f, "Canada", 350, 41, Arrays.asList("chicken", "oil", "chees"));

        Food food3 = new Food(101, "Pasta", 18f, "Canada", 250, 31, Arrays.asList("pasta", "meet", "spinach"));

        Map<Integer,String> map2 = new HashMap<Integer, String>() {
            {
                put(10, "cotton");
                put(11, "nylon");
            }
        };
        Cloth cloth2 = new Cloth(701, "T-shirt", 15f, "China", map2);

        ShoppingCart cart = new ShoppingCart();
        cart.calculateTotalOfProducts();
        cart.nameOfProduct();

    }
}
