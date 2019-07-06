package product;

import java.util.ArrayList;

//Class: Cloth Type
//ClothID Integer
//ClothName String
//ClothPrice Float
//ClothMadeInCountry String
//ClothMaterials Array of Material

public class Cloth extends Product {
	private int ClothID;
	private String ClothName;
	private float ClothPrice;
	private String ClothMadeInCountry;
	private ArrayList<Material> ClothMaterials;
	public Cloth(int clothID, String clothName, float clothPrice, String clothMadeInCountry, ArrayList<Material> clothMaterials) {
		super(clothID, clothName, clothPrice, clothMadeInCountry);

		ClothMaterials = clothMaterials; //????????
	}
	
	
}
