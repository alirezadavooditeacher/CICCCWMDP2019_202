/**
 *
 */
package assignment5;

import java.util.ArrayList;

/**
 * @author miyamotoatsushi
 *
 */
public class Cloth extends Product{
    Integer clothID;
    String clothName;
    Float clothPrice;
    String clothMadeInCountry;
    ArrayList<Material> clothMaterils;


    public Cloth (Integer clothId, String clothName, Float clothPrice, String clothMadeInCountry, ArrayList<Material> clothMaterials) {
        super(clothId, clothName, clothPrice, clothMadeInCountry);
        this.clothID = clothId;
        this.clothName = clothName;
        this.clothPrice = clothPrice;
        this.clothMadeInCountry = clothMadeInCountry;
        this.clothMaterils = clothMaterials;
    }
}