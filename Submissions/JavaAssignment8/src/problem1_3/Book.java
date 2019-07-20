package problem1_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Book implements Iterable<Page>{

    public enum Category{
        Science, History, Food, IT, Engineering, Novel
    }
    private String title;
    private ArrayList<Page> pages;
    private Category category;

    public Book(String title, ArrayList<Page> pages, Category category) {
        this.title = title;
        this.pages = pages;
        this.category = category;
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
