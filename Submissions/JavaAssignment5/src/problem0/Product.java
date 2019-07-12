package problem0;

public class Product {

    private int prdouctID;
    private String productName;
    private float productPrice;
    private String productMadeInCountry;

    public Product(int prdouctID, String productName, float productPrice, String productMadeInCountry) {
        super();
        this.prdouctID = prdouctID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productMadeInCountry = productMadeInCountry;
    }
    public String getProductName() {
        return productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

}
