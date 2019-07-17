package Problem1;

import Problem2.SearchQuery;

import java.util.Iterator;

public class SearchBook implements SearchQuery<Page> {
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

    @Override
    public boolean searchCondition(Page page) {
        if(page.isHasImage() && page.getPageNum() % 2 == 1){
            return true;
        } else {
            return false;
        }
    }
}
