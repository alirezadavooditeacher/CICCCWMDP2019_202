package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database implements Iterable<DataPoint> {
    List<DataPoint> data;

    public Database(List<DataPoint> data) {
        this.data = data;
    }

    public Database() {
        this.data = new ArrayList<>();
    }

    @Override
    public Iterator<DataPoint> iterator() {
        return data.iterator();
    }

    public void add(DataPoint item) {
        data.add(item);
    }
}
