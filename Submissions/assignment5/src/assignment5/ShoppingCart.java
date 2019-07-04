/**
 *
 */
package assignment5;

import java.util.ArrayList;

/**
 * @author miyamotoatsushi
 *
 */
public class ShoppingCart {

    ArrayList<Product> products = new ArrayList<>();

    public void addItem(Product products) {
        this.products.add(products);
    }

    public float getTotalPrice() {
        float total = 0;
        for (Product a : this.products) {
            total += a.getPrice();
        }
        return total;
    }

    public void printProductName() {
        for (Product a : this.products) {
            System.out.println(a.getName());
        }
    }
}
