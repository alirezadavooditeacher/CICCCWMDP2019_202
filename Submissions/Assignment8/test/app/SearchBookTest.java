package app;

import app.entity.Book;
import app.entity.Page;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SearchBookTest {
    SearchBook sb;
    ArrayList<Page> pages;
    Book book;

    @BeforeEach
    void setUp() {
        sb = new SearchBook();

        pages = new ArrayList<>();
        pages.add(new Page(1, true));
        pages.add(new Page(2, false));
        pages.add(new Page(3, false));
        book = new Book("Test", Book.Category.IT, pages);
    }

    @Test
    void search() {
        SearchBookResult result = sb.search(book);
        assertEquals(1, result.getNumberOfPagesWithImages());
        assertFalse(result.isEvenNumber());
    }
}