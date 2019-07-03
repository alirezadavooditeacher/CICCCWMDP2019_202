package app;

public class Material {
  private Integer materialCode;

  public Material(Integer materialCode, String materialName) {
    this.setMaterialCode(materialCode);
    this.materialName = materialName;
  }

  private String materialName;

  public String getMaterialName() {
    return this.materialName;
  }

  public void setMaterialName(String materialName) {
    this.materialName = materialName;
  }

  public Integer getMaterialCode() {
    return materialCode;
  }

  public void setMaterialCode(Integer materialCode) {
    this.materialCode = materialCode;
  }

}