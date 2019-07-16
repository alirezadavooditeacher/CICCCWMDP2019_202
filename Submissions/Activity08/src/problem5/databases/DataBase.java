package src.problem5.databases;

import src.problem1.Aggregate;

import java.util.ArrayList;

public class DataBase implements Aggregate {

    private ArrayList<DataPoint> dataPoints = new ArrayList<>();

    public void addDataPoint(DataPoint dataPoint) {
        this.dataPoints.add(dataPoint);
    }

    public int getLength() {
        return this.dataPoints.size();
    }

    public DataPoint getDataPointAt(int index) {
        return this.dataPoints.get(index);
    }

    public DataBaseIterator iterator() {
        return new DataBaseIterator(this);
    }
}
