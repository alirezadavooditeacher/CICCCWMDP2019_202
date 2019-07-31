package Problem2;

import java.util.ArrayList;

public interface FilterArray<T, U> {
    ArrayList<T> filter(ArrayList<T> arr, U condition);
}
