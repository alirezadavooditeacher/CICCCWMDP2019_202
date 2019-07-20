package Problem1;

import java.util.ArrayList;
import java.util.Iterator;

public class PageIterator implements Iterator<Page> {
    private ArrayList<Page> pageList;
    private int index;

    public PageIterator(ArrayList<Page> pageList) {
        this.pageList = pageList;
        this.index = 0;
    }

    @Override
    public Page next(){
        if(this.hasNext()) {
            Page page = pageList.get(index);
            index++;
            return page;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if(index < pageList.size()){
            return true;
        } else {
            return false;
        }
    }
}
