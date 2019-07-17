import Problem1.*;
import Problem2.GenericSearch;
import Problem2.SearchQuery;
import Problem3.GenericSearchList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//        Problem 1
        System.out.println("Problem 1:");
        Page page1 = new Page(1, true);
        Page page2 = new Page(2, false);
        Page page3 = new Page(3, true);
        Page page5 = new Page(5, false);
        ArrayList<Page> pageList = new ArrayList<>();
        pageList.add(page1);
        pageList.add(page2);
        pageList.add(page3);
        pageList.add(page5);
        Book book = new Book("Spies and Commissars", BookCategory.HISTORY, pageList);
        SearchBook searchBook = new SearchBook();
        System.out.println(searchBook.search(book));
        System.out.println("-------------------");

//        Problem 2
        System.out.println("Problem 2:");
        GenericSearch<Book, SearchBook, Page> genericSearch = new GenericSearch<>();
        System.out.println(genericSearch.search(book, searchBook));
        System.out.println("-------------------");

//        Problem 3
        System.out.println("Problem 3:");
        GenericSearchList<Book, SearchBook, Page> genericSearchList = new GenericSearchList<>();
        ArrayList<Page> foundPages = genericSearchList.search(book, searchBook);
        Iterator<Page> pageIterator = foundPages.iterator();
        while(pageIterator.hasNext()){
            System.out.println("Page number-" + pageIterator.next().getPageNum());
        }

//        Problem 4

    }
}
