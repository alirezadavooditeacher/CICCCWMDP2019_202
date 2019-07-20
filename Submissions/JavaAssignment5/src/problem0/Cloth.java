package problem0;

import java.util.List;

public class Cloth extends Product {
    private List<Material> clothMaterials;

    public Cloth(int productID, String productName, float productPrice, String productMadeInCountry,List<Material>clothMaterials) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.clothMaterials = clothMaterials;
    }
}
