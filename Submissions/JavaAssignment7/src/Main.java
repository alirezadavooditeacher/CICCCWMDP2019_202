import problem1.Book;
import problem1.Books;
import problem3.Car;
import problem3.SwapItem;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
// Problem1
        Book b1 = new Book(199);
        Book b2 = new Book(201);
        Book b3 = new Book(150);
        Book b4 = new Book(300);
        Book b5 = new Book(400);

        ArrayList<Book> list1 = new ArrayList<>();
        list1.add(b1);
        list1.add(b2);
        list1.add(b3);
        list1.add(b4);
        list1.add(b5);

        Books books = new Books(list1);

        System.out.println("The number of books which has more than 200 are: "+ books.countNumberOfElementsWithSpecificProperty());

        //Problem 2

        Car c1 = new Car("Audi", 200,"silver");
        Car c2 = new Car ("Mercedes", 300,"black");
        Car c3 = new Car ("Porsche", 400, "blue");

        ArrayList<Car> list2 = new ArrayList<>();
        list2.add(c1);
        list2.add(c2);
        list2.add(c3);

        SwapItem si = new SwapItem();
        si.exchangeElements(list2);

    }
}
