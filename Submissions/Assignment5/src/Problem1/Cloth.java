package Problem1;

import Problem0.Product;

public class Cloth extends Product {
	private Material[] clothMaterials;

	public Cloth(Integer productID, String productName, float productPrice, String productMadeInCountry, Material[] clothMaterials) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productMadeInCountry = productMadeInCountry;
		this.clothMaterials = clothMaterials;
	}

	public Material[] getClothMaterials() {
		return clothMaterials;
	}

	public void setClothMaterials(Material[] clothMaterials) {
		this.clothMaterials = clothMaterials;
	}
}
