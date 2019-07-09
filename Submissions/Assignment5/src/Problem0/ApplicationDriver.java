package Problem0;

import Problem1.Cloth;
import Problem1.Drink;
import Problem1.Food;
import Problem1.Material;
import Problem2.ShoppingCart;

public class ApplicationDriver {
	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();

		Product drink1 = new Drink(412, "Pepsi", 2F, "USA", false, 150);
		Product drink2 = new Drink(183, "Ginger Zero", 3F, "Canada", true, 200);
		
		Product food1 = new Food(100, "Chicken", 8F, "Canada", 350, 4, new String[] { "chicken", "oil", "chees" });
		Product food2 = new Food(101, "Pasta", 18F, "Canada", 250, 31, new String[] { "pasta", "meet", "spinach" });
		
		Material material1 = new Material(10, "cotton");
		Material material2 = new Material(11, "Nylon");
		Product cloth = new Cloth(701, "T-shirt", 15F, "China", new Material[] { material1, material2 }); 
		
		shoppingCart.addProduct(drink1);
		shoppingCart.addProduct(drink2);
		shoppingCart.addProduct(food1);
		shoppingCart.addProduct(food2);
		shoppingCart.addProduct(cloth);
		
		

		System.out.println("Total Amount = " + shoppingCart.totalAmount());

		System.out.println("--------------------------------------------");
		System.out.println("Print the name of the items have purchases:");
		shoppingCart.printName();

	}
}
