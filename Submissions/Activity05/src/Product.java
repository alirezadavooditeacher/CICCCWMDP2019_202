package src;

public class Product {
    Integer productId;
    String productName;
    Float productPrice;
    String productMadeInCountry;

    public Product(Integer productId, String productName, Float productPrice, String productMadeInCountry) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productMadeInCountry = productMadeInCountry;
    }

    public Float getPrice() {
        return productPrice;
    }
}
