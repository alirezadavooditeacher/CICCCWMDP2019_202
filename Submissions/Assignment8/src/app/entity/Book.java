package app.entity;

import java.util.ArrayList;
import java.util.Iterator;

public class Book implements Iterable<Page> {
    public enum Category {
        Science,
        History,
        Food,
        IT,
        Engineering,
        Novel
    }

    private String title;
    private Category category;
    private ArrayList<Page> pages;

    public Book(String title, Category category, ArrayList<Page> pages) {
        this.title = title;
        this.category = category;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public Iterator<Page> iterator() {
        return pages.iterator();
    }
}
