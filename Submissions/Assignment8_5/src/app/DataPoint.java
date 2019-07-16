package app;

public class DataPoint {
    public enum Category {
        Temperature,
        Humidity,
        Pressure
    }

    private Category dataCategory;
    private int newValue;

    public DataPoint(Category dataCategory, int newValue) {
        this.dataCategory = dataCategory;
        this.newValue = newValue;
    }

    public Category getDataCategory() {
        return dataCategory;
    }

    public int getNewValue() {
        return newValue;
    }
}
