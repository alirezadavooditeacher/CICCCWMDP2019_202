package product;

import java.util.ArrayList;

//Class: Food Type
//foodID Integer
//foodName String
//foodPrice Float
//foodMadeInCountry String
//foodCalorie Integer
//foodSize Integer
//foodIngredients Array of String

public class Food extends Product{
	
	private int foodID;
	private String foodName;
	private float foodPrice;
	private String foodMadeInCountry;
	private int foodCalorie;
	private int foodSize;
	private ArrayList<String> foodIngredients;
	
	public Food(int foodID, String foodName, float foodPrice, String foodMadeInCountry, int foodCalorie, int foodSize, ArrayList<String> foodIngredients) {
		super(foodID, foodName, foodPrice, foodMadeInCountry);
		this.foodCalorie = foodCalorie;
		this.foodSize = foodSize;
		this.foodIngredients = foodIngredients;
	}


	@Override
	public float getProductPrice() {
		return this.foodSize * super.getProductPrice();
	}
	
	
	
}
