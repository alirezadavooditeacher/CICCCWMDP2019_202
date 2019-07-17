package Problem1;

import java.util.Iterator;

public class SearchBook{
    public int search(Book book){
        int count = 0;
        Iterator<Page> pageIterator = book.iterator();
        while(pageIterator.hasNext()){
            Page page = pageIterator.next();
            if(page.isHasImage() && page.getPageNum() % 2 == 1){
                count ++;
            }
        }
        return count;
    }
}
