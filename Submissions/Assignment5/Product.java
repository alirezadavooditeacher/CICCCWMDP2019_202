public class Product {

    private Integer productID;
    private String productName;
    private float productPrice;
    private String productMadeInCountry;

    public Product(Integer productID, String productName, float productPrice, String productMadeInCountry) {
        super();
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
