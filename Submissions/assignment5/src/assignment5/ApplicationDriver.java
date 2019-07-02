/**
 *
 */
package assignment5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author miyamotoatsushi
 *
 */
public class ApplicationDriver {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Product product = new Product(110, "Diet Pepsi", (float) 2.0, "USA");

        Drink drink1 = new Drink(412, "Pepsi", (float) 2.0, "USA", false, 150);
        Drink drink2 = new Drink(412, "Pepsi", (float) 2.0, "USA", false, 150);
        Drink drink3 = new Drink(412, "Pepsi", (float) 2.0, "USA", false, 150);

        Drink drink4 = new Drink(183, "Ginger Zero", (float) 3.0, "Canada", true, 200);

        Food food1 = new Food(100, "Chicken", (float) 8.0, "Canada", 350, 4, new ArrayList<>(Arrays.asList("chicken", "oil", "cheese")));
        Food food2 = new Food(100, "Chicken", (float) 8.0, "Canada", 350, 4, new ArrayList<>(Arrays.asList("chicken", "oil", "cheese")));

        Food food3 = new Food(101, "Pasta", (float) 18.0, "Canada", 250, 3, new ArrayList<>(Arrays.asList("pasta", "meet", "spinach")));
        Food food4 = new Food(101, "Pasta", (float) 18.0, "Canada", 250, 3, new ArrayList<>(Arrays.asList("pasta", "meet", "spinach")));

        Material material1 = new Material(10, "cotton");
        Material material2 = new Material(11, "Nylon");
        Cloth cloth = new Cloth(701, "T-shirt", (float) 15.0, "Chaina", new ArrayList<>(Arrays.asList(material1, material2)));

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(drink1);
        shoppingCart.addItem(drink2);
        shoppingCart.addItem(drink3);
        shoppingCart.addItem(drink4);

        shoppingCart.addItem(food1);
        shoppingCart.addItem(food2);
        shoppingCart.addItem(food3);
        shoppingCart.addItem(food4);

        shoppingCart.addItem(cloth);

        System.out.println(shoppingCart.getTotalPrice());
        shoppingCart.printProductName();


    }

}
