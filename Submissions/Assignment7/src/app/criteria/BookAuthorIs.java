package app.criteria;

import app.entity.Book;
import java.util.List;

public class BookAuthorIs extends Criteria<Book> {
    private String author;

    public BookAuthorIs(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean satisfied(Book el, List<Book> data) {
        return el.getAuthor().equals(author);
    }
}
