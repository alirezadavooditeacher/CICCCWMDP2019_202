package product;

//a) Define a Java class called Product which inherits from class Object.
//b) Add the following states to the class:
//	Properties Type
//	ProductID Integer
//	productName String
//	productPrice Float
//	productMadeInCountry String
//c) Define and implement a constructor for this class.
//d) Inside the ApplicationDriver class, create one object from this class with the following values for the properties:
//	Properties Type
//	ProductID 110
//	productName “Diet Pepsi”
//	productPrice 2
//	productMadeInCountry USA


public class Product extends Object {
	
	private int productID;
	private String productName;
	private float productPrice;
	private String productMadeInCountry;
	
	public Product(int productID, String productName, Float productPrice, String productMadeInCountry) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productMadeInCountry = productMadeInCountry;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public String getProductName() {
		return productName;
	}
	
	
	
	
}
