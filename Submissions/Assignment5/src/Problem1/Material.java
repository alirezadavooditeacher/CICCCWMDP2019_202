package Problem1;

import Problem0.Product;

public class Material extends Product {
	private Integer materialCode;
	private String materialName;

	public Material(Integer materialCode, String materialName) {
		super();
		this.materialCode = materialCode;
		this.materialName = materialName;
	}

	public Integer getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(Integer materialCode) {
		this.materialCode = materialCode;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
}
