package src.problem1;

import java.util.ArrayList;

public class Book implements Aggregate {
    private String title;
    private Enum<BookCategory> category;
    private ArrayList<Page> pages;

    public Book(String title, Enum<BookCategory> category, ArrayList<Page> pages) {
        this.title = title;
        this.category = category;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public Enum<BookCategory> getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(Enum<BookCategory> category) {
        this.category = category;
    }

    public Page getPageAt(int index) {
        return this.pages.get(index);
    }

    public int getLength() {
        return this.pages.size();
    }

    public BookIterator iterator() {
        return new BookIterator(this);
    }
}
