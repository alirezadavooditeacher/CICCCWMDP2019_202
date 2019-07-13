package src.problem5.databases;

import src.problem1.Iterator;

public class DataBaseIterator implements Iterator {
    private DataBase dataBase;
    private int index;

    public DataBaseIterator(DataBase dataBase) {
        this.dataBase = dataBase;
        this.index = 0;
    }

    public boolean hasNext() {
        if (this.index < dataBase.getLength()) {
            return true;
        }

        return false;
    }

    public Object next() {
        DataPoint dataPoint = this.dataBase.getDataPointAt(this.index);
        this.index++;
        return dataPoint;
    }
}
