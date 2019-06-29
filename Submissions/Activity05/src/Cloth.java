package src;

import java.util.ArrayList;

public class Cloth extends Product {
    private Integer clothId;
    private String clothName;
    private Float clothPrice;
    private String clothMadeInCountry;
    private ArrayList<Material> clothMaterials;

    public Cloth (Integer clothId, String clothName, Float clothPrice, String clothMadeInCountry, ArrayList<Material> clothMaterials) {
        super(clothId, clothName, clothPrice, clothMadeInCountry);
        this.clothId = clothId;
        this.clothName = clothName;
        this.clothPrice = clothPrice;
        this.clothMadeInCountry = clothMadeInCountry;
        this.clothMaterials = clothMaterials;
    }
}
