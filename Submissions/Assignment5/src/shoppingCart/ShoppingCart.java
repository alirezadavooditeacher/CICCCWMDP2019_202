package shoppingCart;

import java.util.ArrayList;
import java.util.Iterator;

import product.Product;

public class ShoppingCart {
	ArrayList<Product> productsInShoppingCart;
//	Iterator<Product> it;
	
	public ShoppingCart() {
		super();
		this.productsInShoppingCart=new ArrayList<Product>();
		//this.it=this.productsInShoppingCart.iterator();
	}
	
	public void addProduct(Product product) {
		productsInShoppingCart.add(product);
	}
	public void dropProduct(Product product) {
		productsInShoppingCart.remove(product);
	}
	public void printProductsTotalPrice() {
		float priceSum=0;
		Iterator<Product> it=this.productsInShoppingCart.iterator();
		while(it.hasNext()) {
			Product product=it.next();
			float productPrice=product.getProductPrice();
			priceSum=priceSum+productPrice;
		}
		
		System.out.println("The total price of products in the Shopping Cart is:"+priceSum);
	}
	public void printProductsNames() {
		System.out.println("The products in the ShoppingCart are: ");
		Iterator<Product> it=this.productsInShoppingCart.iterator();
		while(it.hasNext()) {
			Product product=it.next();
			String productName=product.getProductName();
			System.out.println(productName);
		}
		System.out.println("==========================================");
	}
	
}
