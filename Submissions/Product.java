package app;

public class Product extends Object {
  int productId;
  String productName;
  float productPrice;
  String productMadeIn;

  public Product(int productId, String productName, float productPrice, String productMadeIn) {
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
    this.productMadeIn = productMadeIn;
  }

  public Float getPrice() {
    return productPrice;
  }
}