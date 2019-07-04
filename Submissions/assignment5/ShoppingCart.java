package assignment5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

//    public static List[][] oderList() {
//
//
//    }

    public static Float calculateTotalOfProducts() {
        Float total = 0f;
        total =+ Product.getProductPrice();

        return total;
    }

    public static List<String> nameOfProduct() {
        String name = Product.getProductName();
        List<String> nameList = new ArrayList<>();
        nameList.add(name);

        return nameList;
    }


}
