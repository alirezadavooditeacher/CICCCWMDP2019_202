package problem1_3;

public class GenericSearch<T extends Iterable<V>, V> {
    public int search(T item, Property property){
        int Count = 0;
        for (V pa : item){
            if (property.search(pa)){
                Count += 1;
            }
        }
        return Count;
    }
}
