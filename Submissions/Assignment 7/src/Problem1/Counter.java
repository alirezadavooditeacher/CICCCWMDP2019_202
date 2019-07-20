package Problem1;

import java.util.ArrayList;
import java.util.HashMap;

public class Counter<T extends Mappable>{
    private ArrayList<T> list;

    public Counter(ArrayList<T> list) {
        this.list = list;
    }

    public <K, V> int countNumberOfElementsWithSpecificProperty(K propertyName, V propertyValue){
        int count = 0;
        for(int i = 0; i < list.size() ; i++){
            HashMap<K,V> itemMap = list.get(i).createMap();
            if(itemMap.get(propertyName) == propertyValue){
                count ++;
            }
        }
        return count;
    }
}
