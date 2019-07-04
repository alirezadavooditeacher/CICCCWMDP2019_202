package shopping;

import java.util.ArrayList;

import product.Product;

//b) Define appropriate states for the ShoppingCart class.
//c) Define (specify the signature of the method) and implement the following APIs to the class ShoppingCart:
//d) An API using which you can add your purchases items (listed above) to your shopping cart.
//e) An API using which you can calculate the total amount you need to pay for your entire purchase.
//f) An API using which you can print just the name of the items you have purchases.
//g) Now in your ApplicationDriver class, create an instance (object) from class ShoppingCart with some arbitrary values.
//h) Call all APIs of the ShoppingCart and provide the methods (apis) with their appropriate input.


public class ShoppingCart {
	private ArrayList<Product> product = new ArrayList<Product>();

//	public ShoppingCart(ArrayList<Product> product) {
//		super();
//		this.product = product;
//	}
	
	public void addProduct(Product product) {
		this.product.add(product);
	}
	
	public void getTotalPrice() {
		float totalPrice = 0;
		
		for (Product p: this.product) {
			totalPrice = totalPrice + p.getProductPrice();
		}
		System.out.println("Item: " + this.product.size() +" items");
		System.out.println("Total: $" + totalPrice);;
	}
	
	public void getPurchasedProductName() {
		System.out.println("In your cart, there is(are)");
		for(Product p: this.product) {
			System.out.println("    -" + p.getProductName());
		}
		
	} 
}
