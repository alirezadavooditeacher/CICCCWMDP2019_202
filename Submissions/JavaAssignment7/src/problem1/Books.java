package problem1;

import java.util.ArrayList;

public class Books implements Countable<Integer>{
    private ArrayList<Book> books;
    public Books(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public Integer countNumberOfElementsWithSpecificProperty() {
        int count = 0;
        for (Book book :this.books) {
            if (book.getPage() > 200) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}