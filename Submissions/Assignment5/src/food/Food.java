package food;
import product.*;


public class Food extends Product{
	Integer foodCalories;
	Integer foodSize;
	String foodIngredients[];
	
	public Food(Integer integer, String productName,float productPrice, String madeInCountry, Integer calories, Integer size, String ingredients[]) {
		super(integer, productName,productPrice,madeInCountry);
		this.foodCalories=calories;
		this.foodSize=size;
		this.foodIngredients=ingredients;
	}
}
