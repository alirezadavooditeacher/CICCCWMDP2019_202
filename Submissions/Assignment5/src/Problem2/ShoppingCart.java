package Problem2;

import java.util.ArrayList;
import java.util.List;

import Problem0.Product;

public class ShoppingCart {
	private List<Product> product = new ArrayList<Product>();

	public ShoppingCart() {
	}

	public void addProduct(Product product) {
		this.product.add(product);
	}

	public float totalAmount() {
		float sum = 0;
		for (int i = 0; i < product.size(); i++) {
			sum += product.get(i).getProductPrice();
		}

		return sum;
	}

	public void printName() {
		for (int i = 0; i < product.size(); i++) {
			System.out.println(product.get(i).getProductName());
		}
	}
}
