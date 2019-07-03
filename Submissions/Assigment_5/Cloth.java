package app;

import java.util.ArrayList;

public class Cloth extends Product {
	  private Integer clothId;
	  private String clothName;
	  private Float clothPrice;
	  private String clothMadeIn;
	  private ArrayList<Material> clothMaterials;

	  public Cloth(Integer clothId, String clothName, Float clothPrice, String clothMadeIn,
	      ArrayList<Material> clothMaterials) {
	    super(clothId, clothName, clothPrice, clothMadeIn);
	    this.clothId = clothId;
	    this.clothName = clothName;
	    this.clothPrice = clothPrice;
	    this.clothMadeIn = clothMadeIn;
	    this.clothMaterials = clothMaterials;
	  }

	  public Integer getClothId() {
	    return this.clothId;
	  }

	  public void setClothId(Integer clothId) {
	    this.clothId = clothId;
	  }

	  public String getClothName() {
	    return this.clothName;
	  }

	  public void setClothName(String clothName) {
	    this.clothName = clothName;
	  }

	  public Float getClothPrice() {
	    return this.clothPrice;
	  }

	  public void setClothPrice(Float clothPrice) {
	    this.clothPrice = clothPrice;
	  }

	  public String getClothMadeIn() {
	    return this.clothMadeIn;
	  }

	  public void setClothMadeIn(String clothMadeIn) {
	    this.clothMadeIn = clothMadeIn;
	  }

	  public ArrayList<Material> getClothMaterials() {
	    return this.clothMaterials;
	  }

	  public void setClothMaterials(ArrayList<Material> clothMaterials) {
	    this.clothMaterials = clothMaterials;
	  }

	}