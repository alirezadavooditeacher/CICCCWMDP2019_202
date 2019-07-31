package assignment8.problem1;

import java.util.ArrayList;
import java.util.Iterator;

public class SearchBook {

    public ArrayList<Integer> SearchBook(ArrayList<Page> book) {

        Iterator<Page> itrator =  book.iterator();
        ArrayList<Integer> hasImagePage = new ArrayList<Integer>();

        // Continue loop if there is a value using hasNext (hasNextを使用して値がある場合はループを継続する)
        while(itrator.hasNext()) {
            // Get the element using next (nextを使って要素を取得する)
            Page page = (Page) itrator.next();
            if (page.hasImage() == true){
                hasImagePage.add(page.getPageNumber());
            }
        }
        return hasImagePage;
    }
}
