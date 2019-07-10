import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        problem 0
        Product productTest = new Product(110, "Diet Pepsi", 2, "USA");
//        problem 1
        Drink soda = new Drink(120, "Pepsi", 3, "Brazil", true, 5 );
        String[] sandwichIngredients = {"lettuce", "tomato", "olives", "turkey"};
        Food sandwich = new Food(140, "Sandwich", 5, "Canada", 500, 5, sandwichIngredients);
//        problem 2
        ArrayList<Product> shoppingList = new ArrayList<>(Arrays.asList(soda, sandwich));
        ShoppingCart shoppingCart = new ShoppingCart(shoppingList);
        shoppingCart.printNames();
        float total = shoppingCart.calculateTotal();
        System.out.println(total);
        System.out.println("------------");
        Drink cola = new Drink(110, "Cola", 3, "USA", false, 8);
        shoppingCart.addItem(cola);
        shoppingCart.printNames();
        total = shoppingCart.calculateTotal();
        System.out.println(total);
    }
}
