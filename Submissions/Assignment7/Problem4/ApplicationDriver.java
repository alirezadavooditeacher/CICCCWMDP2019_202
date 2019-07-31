package assignment7.Problem4;

import java.util.ArrayList;

public class ApplicationDriver {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();
        Book b1 = new Book("Head First Java", "reference", 326);
        Book b2 = new Book("Effective Java", "reference", 285);
        Book b3 = new Book("Thinking in Java", "reference", 241);
        Book b4 = new Book("The programmer", "suspense", 394);
        Book b5 = new Book("The programmer2", "suspense", 347);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        Generic generic = new Generic(books);
        generic.performOperation(books);

    }


}
