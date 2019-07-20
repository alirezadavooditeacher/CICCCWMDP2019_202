package problem1_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Page> pages = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            pages.add(new Page(i, i % 15 == 0));
        }
        Book book = new Book("Vancouver", pages, Book.Category.History );

        System.out.println("---------- [Problem 1] ----------");
        problem1(book);
        System.out.println("---------- [Problem 2] ----------");
        problem2(book);
        System.out.println("---------- [Problem 3] ----------");
        problem3(book);
    }

    public static void problem1(Book book) {
        SearchBook search = new SearchBook();
        BookResult result = search.search(book);
        System.out.format("The number of pages which have image(s):%d", result.getNumberOfPagesWithImages());
        System.out.println();
        System.out.format("The number of pages is even number :%b", result.isEvenNumber());
        System.out.println();
    }

    public static void problem2(Book book) {
        GenericSearch<Book, Page> search = new GenericSearch<>();
        Property<Page> property = Page::hasImage;
        int count = search.search(book, property);
        System.out.format("The number of pages which have image(s):%d", count);
        System.out.println();
    }

    public static void problem3(Book book) {
        GenericSearchList<Book, Page> search = new GenericSearchList<>();
        Property<Page> property = Page::hasImage;
        List<Page> filtered = search.search(book, property);
        for (Page pa: filtered) {
            System.out.println(pa);
        }
        System.out.println();
    }
}
