package app.criteria;

import app.entity.Book;
import java.util.List;

public class BookGenreIs extends Criteria<Book> {
    private String genre;

    public BookGenreIs(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public boolean satisfied(Book el, List<Book> data) {
        return el.getGenre().equals(genre);
    }
}
