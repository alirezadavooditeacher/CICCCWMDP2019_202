import java.util.*;

public class ApplicationDriver {

    public static void main(String[] args) {

        Product p1 = new Product(110, "Diet Pepsi", 2, "USA");

        //drink
        Drink drink01 = new Drink(412, "Pepsi", 2f, "USA", false, 150);
        Drink drink02 = new Drink(412, "Pepsi", 2f, "USA", false, 150);
        Drink drink03 = new Drink(412, "Pepsi", 2f, "USA", false, 150);
        Drink drink04 = new Drink(183, "Ginger-Zero", 3f, "CANADA", true, 200);
        Drink drinkTest = new Drink(413, "Coca Zero", 1.8f, "USA", true, 330);

        //food
        Food food01 = new Food(100, "chicken", 8f, "Canada", 350, 4, new ArrayList<>(Arrays.asList("chicken", "oil", "cheese")));
        Food food02 = new Food(100, "chicken", 8f, "Canada", 350, 4, new ArrayList<>(Arrays.asList("chicken", "oil", "cheese")));
        Food food03 = new Food(101, "pasta", 18f, "Canada", 250, 3, new ArrayList<>(Arrays.asList("pasta", "meet", "spinach")));


        //cloth
        Material material01 = new Material(10, "cotton");
        Material material02 = new Material(11, "nylon");
        Material material03 = new Material(304, "stainless steel");

        Cloth cloth01 = new Cloth(701, "T-shirt", 15f, "China", new ArrayList<>(Arrays.asList(material01, material02)));
        Cloth clothTest = new Cloth(702, "Jacket", 20f,"Taiwan", material03.MaterialName);

        //shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(drink01);
        cart.addItem(drink02);
        cart.addItem(drink03);
        cart.addItem(drink04);

        cart.addItem(food01);
        cart.addItem(food02);
        cart.addItem(food03);

        cart.addItem(cloth01);

        System.out.println("price is: " + cart.calculateThePrice());
        System.out.format("items are: "+ cart.printItems());











    }
}
