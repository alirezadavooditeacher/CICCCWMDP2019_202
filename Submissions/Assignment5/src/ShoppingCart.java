import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> shoppingList;

    public ShoppingCart(ArrayList<Product> shoppingList){
        this.shoppingList = shoppingList;
    }

    public void addItem(Product item){
        this.shoppingList.add(item);
    }

    public float calculateTotal(){
        float total = 0;
        for(int i = 0; i < this.shoppingList.size(); i++){
             float price = this.shoppingList.get(i).getProductPrice();
             total += price;
        }
        return total;
    }

    public void printNames(){
        for(int i = 0; i < this.shoppingList.size(); i++) {
            String name = this.shoppingList.get(i).getProductName();
            System.out.println(name);
        }
    }
}
