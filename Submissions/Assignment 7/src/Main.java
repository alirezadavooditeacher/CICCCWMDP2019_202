import Problem1.BookMapper;
import Problem1.Counter;
import Problem3.Book;
import Problem3.Swapper;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Problem 1
        System.out.println("Problem 1:");
        BookMapper book1 = new BookMapper("George Orwell", "1984", 1949);
        BookMapper book2 = new BookMapper("Victor Hugo", "Les Miserables", 1862);
        BookMapper book3 = new BookMapper("George R.R.Martin", "A Feast For Crows", 2005);
        BookMapper book4 = new BookMapper("George Orwell", "Animal Farm", 1945);

        ArrayList<BookMapper> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        Counter<BookMapper> counter = new Counter<>(bookList);
        System.out.println(counter.countNumberOfElementsWithSpecificProperty("Title", "1984"));

//        Problem 2
//        Algorithm class will compile because both possible return types are T type

//        Problem 3
        System.out.println();
        System.out.println("Problem 3:");
        System.out.println("Before swap: ");
        Swapper<BookMapper> swapper = new Swapper<>(bookList);
        swapper.printList();
        swapper.swap(book1, book2);
        System.out.println("After swap: ");
        swapper.printList();

    }
}
