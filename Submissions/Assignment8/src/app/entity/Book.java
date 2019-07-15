package app;

import java.util.List;

public class Book {
    enum Category {
        Science,
        History,
        Food,
        IT,
        Engineering,
        Novel
    }

    private String title;
    private Category category;
    private List<Page> pages;

    public Book(String title, Category category, List<Page> pages) {
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
}
