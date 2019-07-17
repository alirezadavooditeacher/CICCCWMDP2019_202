import Problem1.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Page page1 = new Page(1, true);
        Page page2 = new Page(2, false);
        Page page3 = new Page(3, true);
        Page page5 = new Page(5, true);
        ArrayList<Page> pageList = new ArrayList<>();
        pageList.add(page1);
        pageList.add(page2);
        pageList.add(page3);
        pageList.add(page5);
        Book book = new Book("Spies and Commissars", BookCategory.HISTORY, pageList);
        SearchBook searchBook = new SearchBook();
        System.out.println(searchBook.search(book));
    }
}
