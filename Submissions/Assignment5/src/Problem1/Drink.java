package Problem1;

import Problem0.Product;

public class Drink extends Product {
	private Boolean isDrinkDiet;
	private Integer drinkSize;

	public Drink(Integer drinkID, String drinkName, Float drinkPrice, String drinkMadeInCountry, Boolean isDrinkDiet,
			Integer drinkSize) {
		this.productID = drinkID;
		this.productName = drinkName;
		this.productPrice = drinkPrice;
		this.productMadeInCountry = drinkMadeInCountry;
		this.isDrinkDiet = isDrinkDiet;
		this.drinkSize = drinkSize;
	}
	
	public Boolean getIsDrinkDiet() {
		return isDrinkDiet;
	}

	public void setIsDrinkDiet(Boolean isDrinkDiet) {
		this.isDrinkDiet = isDrinkDiet;
	}

	public Integer getDrinkSize() {
		return drinkSize;
	}

	public void setDrinkSize(Integer drinkSize) {
		this.drinkSize = drinkSize;
	}
}
