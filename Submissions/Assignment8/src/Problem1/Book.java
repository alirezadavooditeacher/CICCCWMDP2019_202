package Problem1;

import java.util.ArrayList;
import java.util.Iterator;

public class Book implements Iterable<Page>{
    private String title;
    private BookCategory bookCategory;
    private ArrayList<Page> pages;

    public ArrayList<Page> getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Book(String title, BookCategory bookCategory, ArrayList<Page> pages) {
        this.title = title;
        this.bookCategory = bookCategory;
        this.pages = pages;
    }

    @Override
    public Iterator<Page> iterator(){
        PageIterator pageIterator = new PageIterator(pages);
        return pageIterator;
    }
}
