import cloth.Cloth;
import drink.Drink;
import food.Food;
import material.Material;
import product.*;
public class applicationDriver {

	public static void main(String[] args) {
		Product p1= new Product(110,"Diet Pepsi",2,"USA");
		Drink drink=new Drink(89,"Beer",8,"EU",false,350);
		String ingredients[]= {"banana"};
		Food food=new Food(56,"Banana",1, "Salvador",200,150,ingredients);
		Material m1=new Material(12,"cotton");
		Material m2=new Material(22,"Nylon");
		Material listOfMaterial[]= {m1,m2};
		Cloth c1=new Cloth(87,"Shorts",25,"China",listOfMaterial);
		System.out.println("Run Forest Run");
	}
	
}
