import java.util.*;

public class ShoppingCart {
    List<Product> inCart;

    public ShoppingCart() {
        this.inCart = new ArrayList<>();
    }

    public void addItem(Product item) {
        inCart.add(item);
    }

    public Float calculateThePrice() {
        Float total = 0.0f;
        for (Product item : inCart) {
            total += item.getProductPrice();
        }
        return total;
    }

    public String printItems() {
        for (Product item : inCart) {
            System.out.println(item.getProductPrice());
        } return null;
    }
}
