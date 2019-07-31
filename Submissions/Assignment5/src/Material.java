public class Material {
    Integer materialCode;
    String materialName;

    Material(Integer materialCode, String materialName){
        this.materialCode = materialCode;
        this.materialName = materialName;
    }

    public String toString() {
        Integer materialCode = this.materialCode;
        String materialName = this.materialName;

        String message =
                "Material Code :\t" + materialCode + "\nMaterial Name :\t" + materialName;
        return message;
    }
}
