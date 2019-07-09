import problem0.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationDriver {

    public static void main(String[] args){
        Product p1 = new Product(110, "Diet Pepsi", 2f, "USA");

        Drink D1= new Drink(412, "Pepsi", 2f, "USA", false , 150);
        Drink D2= new Drink ( 183, "GingerZero", 3f, "Canada",
                true, 200 );
        Food F1 = new Food(100, "Chicken", 8f, "Canada", 350,
                4,new ArrayList<>(Arrays.asList("chicken", "oil","cheesse")));
        Food F2 = new Food (101, "Pasta", 18f, "Canada", 250,
                3, new ArrayList<>(Arrays.asList("Pasta", "meat", "spinach")));


        Material material1 = new Material(10, "Cotton");
        Material material2 = new Material(11, "Nylon");
        Cloth C1 = new Cloth(701, "T-shirt", 15f, "China", new ArrayList<>(Arrays.asList(material1, material2)));

        ShoppingCart shopping = new ShoppingCart();

        shopping.addItem(D1);
        shopping.addItem(D1);
        shopping.addItem(D1);
        shopping.addItem(D2);

        shopping.addItem(F1);
        shopping.addItem(F1);
        shopping.addItem(F2);
        shopping.addItem(F2);

        shopping.addItem(C1);

        System.out.println("The total price is $ " +shopping.calculateTotalPrice());
        System.out.println("Here is a list of what you get:");
        shopping.printNameOfPurchasedItem();
    }
}
