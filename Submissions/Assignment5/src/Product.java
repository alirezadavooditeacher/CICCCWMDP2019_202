public class Product {
    private int productID;
    private String productName;
    private float productPrice;
    private String madeInCountry;

    public Product(int productID, String productName, float productPrice, String madeInCountry){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.madeInCountry = madeInCountry;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public String getMadeInCountry() {
        return madeInCountry;
    }
}
