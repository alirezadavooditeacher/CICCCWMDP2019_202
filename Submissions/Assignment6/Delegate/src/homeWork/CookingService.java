package homeWork;

public class CookingService {
	private String foodName;
	private int portions;
	private int price;
	public CookingService(String foodName, int portions, int price) {
		super();
		this.foodName = foodName;
		this.portions = portions;
		this.price = price;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPortions() {
		return portions;
	}
	public void setPortions(int portions) {
		this.portions = portions;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
