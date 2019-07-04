package src;

import java.util.ArrayList;

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
        for (Product product: this.getProducts()) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }
}
