package Problem1;

import java.util.ArrayList;

public class Book {
    private String title;
    private BookCategory bookCategory;
    private ArrayList<Page> pages;

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
}
