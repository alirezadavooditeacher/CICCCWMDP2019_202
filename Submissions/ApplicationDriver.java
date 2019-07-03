package app;

import java.util.ArrayList;
import java.util.Arrays;

public class ApplicationDriver {
	public static void main(String[] args) {
	    Product product = new Product(110, "Diet Pepsi", 2, "USA");

	    Material material01 = new Material(90001, "silver-cotton");
	    Material material02 = new Material(90002, "wool");
	    Cloth cloth = new Cloth(10001, "hoodie", 40f, "USA", new ArrayList<>(Arrays.asList(material01, material02)));

	    Drink drink101 = new Drink(412, "Pepsi", 2f, "USA", false, 150);
	    Drink drink102 = new Drink(412, "Pepsi", 2f, "USA", false, 150);
	    Drink drink103 = new Drink(412, "Pepsi", 2f, "USA", false, 150);
	    Drink drink201 = new Drink(183, "Ginger-Zero", 3f, "CANADA", true, 200);

	    Food food101 = new Food(100, "Chicken", 8f, "CANADA", 350, 4,
	        new ArrayList<>(Arrays.asList("chicken", "oil", "cheese")));
	    Food food102 = new Food(100, "Chicken", 8f, "CANADA", 350, 4,
	        new ArrayList<>(Arrays.asList("chicken", "oil", "cheese")));
	    Food food201 = new Food(101, "Pasta", 18f, "CANADA", 250, 3,
	        new ArrayList<>(Arrays.asList("pasta", "meat", "spinach")));
	    Food food202 = new Food(101, "Pasta", 18f, "CANADA", 250, 3,
	        new ArrayList<>(Arrays.asList("pasta", "meat", "spinach")));

	    Material material101 = new Material(10, "cotton");
	    Material material102 = new Material(11, "Nylon");
	    Cloth cloth101 = new Cloth(701, "T-shirt", 15f, "China", new ArrayList<>(Arrays.asList(material101, material102)));

	    ShoppingCart shoppingCart = new ShoppingCart();

	    shoppingCart.addCart(drink101);
	    shoppingCart.addCart(drink102);
	    shoppingCart.addCart(drink103);
	    shoppingCart.addCart(drink201);

	    shoppingCart.addCart(food101);
	    shoppingCart.addCart(food102);
	    shoppingCart.addCart(food201);
	    shoppingCart.addCart(food202);

	    shoppingCart.addCart(cloth101);
	    shoppingCart.addCart(cloth);

	    System.out.println(shoppingCart.getTotalPrice());
	    
	   shoppingCart.getItemName();
	    
	  }
}
