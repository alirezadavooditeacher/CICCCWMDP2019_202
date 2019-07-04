package app.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addItem(Product item) {
        cart.add(item);
    }

    public Float calculateTotalPrice() {
        Float total = 0.0f;
        for (Product item : cart) {
            total += item.getPrice();
        }

        return total;
    }

    public void printAllItems() {
        for (Product item : cart) {
            System.out.println(item.getName());
        }
    }
}
