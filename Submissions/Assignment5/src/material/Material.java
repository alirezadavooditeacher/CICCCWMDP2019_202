package material;

import product.Product;

public class Material extends Product{
	Integer materialCode;
	String materialName;
	public Material(Integer materialCode, String materialName) {
		super();
		this.materialCode=materialCode;
		this.materialName=materialName;
	}
}