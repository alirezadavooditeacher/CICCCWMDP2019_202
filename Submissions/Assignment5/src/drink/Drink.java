package drink;
import product.*;

public class Drink extends Product {
boolean isDrinkDiet;
Integer drinkSize;
	public Drink(Integer integer, String productName,float productPrice, String madeInCountry, boolean isDiet, Integer size) {
		super(integer, productName,productPrice,madeInCountry);
		this.isDrinkDiet=isDiet;
		this.drinkSize=size;
	}
}
