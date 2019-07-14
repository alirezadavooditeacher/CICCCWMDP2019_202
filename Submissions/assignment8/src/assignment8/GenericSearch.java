package assignment8;

public class GenericSearch {
    public <T extends Iterator, condition> int search(T iterable, condition condition) {

        int count = 0;
        while(iterable.hasNext()) {
            Object ite = iterable.next();
            if (ite.equals(condition)) {
                count++;
            }

        }
        return count;

    }

}
