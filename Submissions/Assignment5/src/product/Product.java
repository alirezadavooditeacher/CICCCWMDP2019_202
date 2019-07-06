package product;

public class Product {

	
	Integer productID;
	String productName;
	float productPrice;
	String productMadeInCountry;
	//constructor
	
	public Product() {
		
	}
	public Product(Integer productID, String productName, float productPrice, String productMadeInCountry) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productMadeInCountry = productMadeInCountry;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
}
