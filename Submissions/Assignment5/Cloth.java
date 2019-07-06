package assignment5;

import java.util.Map;

public class Cloth extends Product {

    private Map<Integer, String> clothMaterials;

    public Cloth(Integer productID, String productName, Float productPrice, String productMadeInCountry, Map<Integer, String> clothMaterials) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.clothMaterials = clothMaterials;
    }
}
