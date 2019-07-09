package Problem1;

import Problem0.Product;

public class Food extends Product {
	private Integer foodCalorie;
	private Integer foodSize;
	private String[] foodIngredients;

	public Food(Integer foodID, String foodName, Float foodPrice, String foodMadeInCountry, Integer foodCalorie,
			Integer foodSize, String[] foodIngredients) {
		this.productID = foodID;
		this.productName = foodName;
		this.productPrice = foodPrice;
		this.productMadeInCountry = foodMadeInCountry;
		this.foodCalorie = foodCalorie;
		this.foodSize = foodSize;
		this.foodIngredients = foodIngredients;
	}

	public Integer getFoodCalorie() {
		return foodCalorie;
	}

	public void setFoodCalorie(Integer foodCalorie) {
		this.foodCalorie = foodCalorie;
	}

	public Integer getFoodSize() {
		return foodSize;
	}

	public void setFoodSize(Integer foodSize) {
		this.foodSize = foodSize;
	}

	public String[] getFoodIngredients() {
		return foodIngredients;
	}

	public void setFoodIngredients(String[] foodIngredients) {
		this.foodIngredients = foodIngredients;
	}
}
