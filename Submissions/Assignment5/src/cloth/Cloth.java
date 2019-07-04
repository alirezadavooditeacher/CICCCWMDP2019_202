package cloth;
import material.*;
import product.*;

public class Cloth extends Product{
	Material clothMaterial[];
	
	public Cloth(Integer integer, String productName,float productPrice, String madeInCountry, Material clothMaterials[]) {
		super(integer, productName,productPrice,madeInCountry);
		this.clothMaterial=clothMaterials;
	}
}