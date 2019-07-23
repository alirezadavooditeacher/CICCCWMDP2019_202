package app;

import app.entity.*;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        // Problem 0
        Product pepsi = new Product(110, "Diet Pepsi", 2.0f, "USA");

        // Problem 1
        // - Drink
        Product coke = new Drink(120, "Coke", 2.0f, "USA", false, 10);

        // - Food
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("Nori");
        ingredients.add("Soy Sauce");
        ingredients.add("Rice vinegar");
        ingredients.add("Roe");
        ingredients.add("Glutinous rice");
        ingredients.add("Garmish");
        ingredients.add("Mirin");
        ingredients.add("Fish");
        Product sushi = new Food(130, "Sushi", 120.0f, "Japan", 680, 2, ingredients);

        // - Cloth
        ArrayList<Material> materials = new ArrayList<>();
        materials.add(new Material(101, "Cotton"));
        Product levis501 = new Cloth(140, "Levi's 501", 89.95f, "USA", materials);

        // Problem 2
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(pepsi);
        cart.addItem(coke);
        cart.addItem(sushi);
        cart.addItem(levis501);

        System.out.format("The total price is %.2f\n", cart.calculateTotalPrice());
        System.out.println("Items in the cart are following:");
        cart.printAllItems();
    }
}
