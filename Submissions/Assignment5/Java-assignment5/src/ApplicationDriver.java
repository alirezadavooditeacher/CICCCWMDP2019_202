import java.util.ArrayList;

import product.*;
import shopping.ShoppingCart;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Problem0
		Product p1 = new Product(110, "Diet Pepsi", 2f, "USA");
		
		
		
		//Problem1
		Material m1 = new Material(301, "cotton");
		Material m2 = new Material(302, "poly");
		ArrayList<Material> materialList1 = new ArrayList<Material>();
		materialList1.add(m1);
		materialList1.add(m2);
		Product c1 = new Cloth(3001, "T-shirt", 10f, "China", materialList1);
		
		Product d1 = new Drink(1001, "Canada Dry", 1f, "Canada", false, 500);
		
		ArrayList<String> foodList1 = new ArrayList<String>();
		foodList1.add("spice");
		foodList1.add("rice");
		foodList1.add("meats");
		foodList1.add("vegetables");
		Product f1 = new Food(2001, "Curry", 15f, "Japan", 750, 500, foodList1);
		
		
		
		//Problem2
		Product d2 = new Drink(412, "Pepsi", 1f, "USA", false, 150);
		Product d3 = new Drink(183, "Ginger Zero", 3f, "Canada", true, 200);

		ArrayList<String> foodList2 = new ArrayList<String>();
		foodList2.add("chiken");
		foodList2.add("oil");
		foodList2.add("chees");
		Product f2 = new Food(100, "Chicken", 8f, "Canada", 350, 4, foodList2);
		ArrayList<String> foodList3 = new ArrayList<String>();
		foodList3.add("pasta");
		foodList3.add("meet");
		foodList3.add("spinach");
		Product f3 = new Food(101, "Pasta", 18f, "Canada", 250, 3, foodList3);

		Material cotton = new Material(10, "cotton");
		Material nylon = new Material(11, "nylon");
		ArrayList<Material> materialList2 = new ArrayList<Material>();
		materialList1.add(cotton);
		materialList1.add(nylon);
		Product c2 = new Cloth(3001, "T-shirt", 10f, "China", materialList2);
		
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct(d2);
		cart.addProduct(d3);
		cart.addProduct(f2);
		cart.addProduct(f3);
		cart.addProduct(c2);

		cart.getPurchasedProductName();
		cart.getTotalPrice();
	}

}
