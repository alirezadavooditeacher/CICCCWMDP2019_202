package Problem0;

public class Product extends Object {
	protected Integer productID;
	protected String productName;
	protected float productPrice;
	protected String productMadeInCountry;

	public Product() {
	}

	public Product(Integer productID, String productName, float productPrice, String productMadeInCountry) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productMadeInCountry = productMadeInCountry;
	}

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
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

	public String getProductMadeInCountry() {
		return productMadeInCountry;
	}

	public void setProductMadeInCountry(String productMadeInCountry) {
		this.productMadeInCountry = productMadeInCountry;
	}
}
