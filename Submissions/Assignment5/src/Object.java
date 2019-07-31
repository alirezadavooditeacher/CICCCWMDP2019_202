public abstract class Object {
    protected int productID;
    protected String productName;
    protected Float productPrice;
    protected String productMadeInCountry;

    Object(int productID, String productName, Float productPrice, String productMadeInCountry){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productMadeInCountry = productMadeInCountry;
    }

    public abstract String toString();

}
