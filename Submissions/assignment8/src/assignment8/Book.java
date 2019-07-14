package assignment8;

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

    public String getBook() {
        return this.title;
    }

    public Enum<BookCategory> getCategory() {
        return this.category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(Enum<BookCategory> category) {
        this.category = category;
    }

    public int getLength() {
        return this.pages.size();
    }

    public Page getPageAt(int index) {
        return this.pages.get(index);
    }

    public BookIterator itetator() {
        return new BookIterator(this);
    }

    @Override
    public Iterator iterator() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }


}
