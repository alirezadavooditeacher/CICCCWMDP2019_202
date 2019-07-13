package src.problem5.databases;

import src.problem5.sensors.Sensors;

public class DataPoint {
    private Enum<Sensors> dataCategory;
    private int newValue;

    public DataPoint(Enum<Sensors> dataCategory, int newValue) {
        this.dataCategory = dataCategory;
        this.newValue = newValue;
    }

    public Enum<Sensors> getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(Enum<Sensors> dataCategory) {
        this.dataCategory = dataCategory;
    }

    public int getNewValue() {
        return newValue;
    }

    public void setNewValue(int newValue) {
        this.newValue = newValue;
    }
}
