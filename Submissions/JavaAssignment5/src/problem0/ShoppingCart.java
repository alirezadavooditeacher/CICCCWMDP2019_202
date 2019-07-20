package problem0;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products;

    public ShoppingCart(){
        this.products = new ArrayList<>();
    }
    public void addItem(Product item){
        products.add(item);
    }
    public double calculateTotalPrice(){
        double total = 0;
        for (Product item : products){
            total += item.getProductPrice();
        }
        return total;
    }
    public void printNameOfPurchasedItem(){
        for (Product item : products){
            System.out.println(item.getProductName());
        }
    }

}
