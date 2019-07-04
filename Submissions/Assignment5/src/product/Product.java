package product;

public class Product {

	
	Integer productID;
	String productName;
	float productPrice;
	String productMadeInCountry;
	//constructor
	public Product(Integer productID, String productName, float productPrice, String productMadeInCountry) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productMadeInCountry = productMadeInCountry;
	}
}
