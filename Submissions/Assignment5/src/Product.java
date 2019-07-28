public class Product extends Object{

    Product(int productID, String productName, Float productPrice, String productMadeInCountry) {
        super( productID, productName, productPrice, productMadeInCountry );
    }

    @Override
    public String toString() {
        int productID = this.productID;
        String productName = this.productName;
        Float productPrice = this.productPrice;
        String productMadeInCountry = this.productMadeInCountry;
        String message =
                "Product ID :\t\t\t\t" + productID + "\nProduct Name :\t\t\t\t" + productName + "\nProduct Price " +
                        ":\t\t\t\t" + productPrice + "\nProduct Made In Country :\t" + productMadeInCountry;
        return message;
    }
}
