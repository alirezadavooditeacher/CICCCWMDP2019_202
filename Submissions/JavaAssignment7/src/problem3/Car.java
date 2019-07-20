package problem3;

public class Car implements Countable<String> {
    private String Brand;
    private int HorsePower;
    private String color;

    @Override
    public String countNumberOfElementsWithSpecificProperty() {
        return this.Brand;

    }
    public Car(String Brand, int horsePower, String color){
        this.Brand = Brand;
        this.HorsePower = horsePower;
        this.color = color;
    }
}
