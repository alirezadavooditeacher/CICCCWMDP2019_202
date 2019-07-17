import app.*;
import app.entity.Book;
import app.entity.Page;

import java.util.ArrayList;
import java.util.List;

public class ApplicationDriver {
    public static void main(String[] args) {
        ArrayList<Page> pages = new ArrayList<>();
        for (int i = 0; i < 347; i++) {
            pages.add(new Page(i, i % 24 == 0));
        }
        Book book = new Book("Tactfulness", Book.Category.Science, pages);

        System.out.println("---------- [Problem 1] ----------");
        problem1(book);
        System.out.println("---------- [Problem 2] ----------");
        problem2(book);
        System.out.println("---------- [Problem 3] ----------");
        problem3(book);
    }

    public static void problem1(Book book) {
        SearchBook search = new SearchBook();
        SearchBookResult result = search.search(book);
        System.out.format("The number of pages which have image(s):%d", result.getNumberOfPagesWithImages());
        System.out.println();
        System.out.format("The number of pages is even number :%b", result.isEvenNumber());
        System.out.println();
    }

    public static void problem2(Book book) {
        GenericSearch<Book, Page> search = new GenericSearch<>();
        Criteria<Page> criteria = Page::isHasImage;
        int count = search.search(book, criteria);
        System.out.format("The number of pages which have image(s):%d", count);
        System.out.println();
    }

    public static void problem3(Book book) {
        GenericSearchList<Book, Page> search = new GenericSearchList<>();
        Criteria<Page> criteria = Page::isHasImage;
        List<Page> filtered = search.search(book, criteria);
        for (Page el: filtered) {
            System.out.println(el);
        }
        System.out.println();
    }
}
