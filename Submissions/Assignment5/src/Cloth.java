import java.util.Arrays;

public class Cloth extends Object {
    String[] clothMaterials;

    Cloth(int productID, String productName, Float productPrice, String productMadeInCountry, String[] clothMaterials) {
        super( productID, productName, productPrice, productMadeInCountry );
        this.clothMaterials = clothMaterials;
    }

    @Override
    public String toString() {
        int productID = this.productID;
        String productName = this.productName;
        Float productPrice = this.productPrice;
        String productMadeInCountry = this.productMadeInCountry;
        String[] clothMaterials = this.clothMaterials;

        String message =
                "Cloth ID :\t\t\t\t" + productID + "\nCloth Name :\t\t\t" + productName + "\nCloth Price " +
                        ":\t\t\t" + productPrice + "\nCloth Made In Country :\t" + productMadeInCountry + "\nFood" +
                        " Cloth Materials :\t" + Arrays.toString(clothMaterials);
        return message;
    }
}
