package app;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
  ArrayList<Product> products;

  public ShoppingCart() {
    this.products = new ArrayList<>();
  }

  public ArrayList<Product> getProducts() {
    return products;
  }

  public void addCart(Product product) {
    getProducts().add(product);
  }

  public Float getTotalPrice() {
    Float totalPrice = 0f;
    for (Product product : this.getProducts()) {
      totalPrice += product.getPrice();
    }

    return totalPrice;
  }
  
  public void getItemName(){
	  HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	  for(Product product : products) {
		String productName = product.productName;
		if(hashMap.containsKey(productName)) {
			int qty = hashMap.get(productName);
			hashMap.put(productName, qty+1);
		} else {
			hashMap.put(productName, 1);
		}
	  }
	  
	  System.out.println(hashMap.keySet());
  }
}