public class Cloth extends Product {

    private String ClothMaterials;

    public Cloth(Integer productID, String productName, float productPrice, String productMadeInCountry, String clothMaterials) {
        super(productID, productName, productPrice, productMadeInCountry);
        ClothMaterials = clothMaterials;
    }

    public String getClothMaterials() {
        return ClothMaterials;
    }

    public void setClothMaterials(String clothMaterials) {
        ClothMaterials = clothMaterials;
    }
}
