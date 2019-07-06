package assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * a) Define a Java class called Product which inherits from class Object.
 * b) Add the following states to the class:
 *
 * c) Define and implement a constructor for this class.
 * d) Inside the ApplicationDriver class, create one object from this class with the following
 * values for the properties:
 */

public class Product {
    private static Integer productID;
    private static String productName;
    private static Float productPrice;
    private static String productMadeInCountry;

    public Product(Integer productID, String productName, Float productPrice, String productMadeInCountry) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productMadeInCountry = productMadeInCountry;
    }

    public Product(Integer productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public static Integer getProductID() {
        return productID;
    }

    public static String getProductName() {
        return productName;
    }

    public static Float getProductPrice() {
        return productPrice;
    }

    public static String getProductMadeInCountry() {
        return productMadeInCountry;
    }

//    public static List[][] oderList() {
//        Integer id = getProductID();
//        String name = getProductName();
//        Float price = getProductPrice();
//        String country = getProductMadeInCountry();
//
//        List<String> oderList = new ArrayList<>();
//
//        String idtemp = String.valueOf(id);
//        oderList.add(idtemp);
//        oderList.add(name);
//        String pricetemp = String.valueOf(price);
//        oderList.add(pricetemp);
//        oderList.add(country);
//
//        ArrayList<ArrayList<String>> arrays = new ArrayList<ArrayList<String>>();
//        arrays.add(oderList);
//
//        return oderList;
//    }
}
