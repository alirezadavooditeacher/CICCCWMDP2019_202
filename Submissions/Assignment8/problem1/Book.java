package assignment8.problem1;

import java.util.ArrayList;

public class Book {
    private String title;
    private Enum<BookCategory> category;
    private ArrayList pages;

    public Book(String title, Enum<BookCategory> category, ArrayList pages) {
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

    public Enum<BookCategory> getCategory() {
        return category;
    }

    public void setCategory(Enum<BookCategory> category) {
        this.category = category;
    }
}
