package product;

//Class: Drink Type
//drinkID Integer	-> productID
//drinkName String	-> productName
//drinkPrice Float	-> productPrice
//drinkMadeInCountry String	->productMadeInCountry
//isDrinkDiet Boolean
//drinkSize Integer


public class Drink extends Product {

	private int drinkID;
	private String drinkName;
	private Float drinkPrice;
	private String drinkMadeInCountry; 
	private Boolean isDrinkDiet;
	private int drinkSize;
	
	public Drink(int drinkID, String drinkName, Float drinkPrice, String drinkMadeInCountry, Boolean isDrinkDiet, int drinkSize) {
		super(drinkID, drinkName, drinkPrice, drinkMadeInCountry);
		this.isDrinkDiet = isDrinkDiet;
		this.drinkSize = drinkSize;
	}
	
	
	

}
