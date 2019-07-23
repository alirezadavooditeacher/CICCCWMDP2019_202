import app.Collection;
import app.Counter;
import app.Exchange;
import app.criteria.*;
import app.entity.*;

import java.util.ArrayList;

public class ApplicationDriver {

    public static void main(String[] args) {
        // Problem 1
        System.out.println("---------- [Problem 1] ----------");
        countBooks();
        countStudents();
        countBuildings();
        countAccounts();

        // Problem 3
        System.out.println("---------- [Problem 3] ----------");
        exchangeElements();

        // Problem 4
        System.out.println("---------- [Problem 4] ----------");
        filterBooks();
    }

    private static void countBooks() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Two Rivers", "Zoe Saadia", "Native American Historical Fiction"));
        books.add(new Book("The Peacekeeper", "Zoe Saadia", "Native American Historical Fiction"));
        books.add(new Book("Follow the Rive", "James Alexander Thom", "Native American Historical Fiction"));
        books.add(new Book("Ender's Game", "Orson Scott Card", "Sci-Fi"));
        books.add(new Book("1984", "George Orwell", "Sci-Fi"));

        Counter<Book> bookCounter = new Counter<>(books);

        // Count by author
        BookAuthorIs criteria = new BookAuthorIs("Zoe Saadia");
        int count = bookCounter.countNumberOfElementsWithSpecificProperty(criteria);
        System.out.format("%d book(s) were written by %s", count, criteria.getAuthor());
        System.out.println();

        // Count by Genre
        BookGenreIs criteria2 = new BookGenreIs("Sci-Fi");
        count = bookCounter.countNumberOfElementsWithSpecificProperty(criteria2);
        System.out.format("%d book(s) are in the genre %s", count, criteria2.getGenre());
        System.out.println();
    }

    private static void countStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Stanislaw", "Scallan", 0));
        students.add(new Student("Tristam", "Keeting", 86));
        students.add(new Student("Reider", "Mennear", 61));
        students.add(new Student("Jonas", "Hindrich", 75));

        Counter<Student> studentCounter = new Counter<>(students);
        StudentHigherGPA criteria = new StudentHigherGPA();
        studentCounter.countNumberOfElementsWithSpecificProperty(criteria);
        int count = studentCounter.countNumberOfElementsWithSpecificProperty(criteria);
        System.out.format("%d people are higher than the average", count);
        System.out.println();
    }

    private static void countBuildings() {
        ArrayList<Building> buildings = new ArrayList<>();
        buildings.add(new Building("660 Comanche Hill", 16, 2007));
        buildings.add(new Building("1131 Welch Point", 9, 2016));
        buildings.add(new Building("672 Melvin Terrace", 7, 1994));

        Counter<Building> counter = new Counter<>(buildings);
        BuildingHigherThan criteria = new BuildingHigherThan(7);
        int count = counter.countNumberOfElementsWithSpecificProperty(criteria);
        System.out.format("%d building(s) have more than %d floors", count, criteria.getFloor());
        System.out.println();
    }

    private static void countAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("vmclanachan0@squarespace.com", "jd7nrO5FSoI", false));
        accounts.add(new Account("rmillership4@printfriendly.com", "v8eaiYgw", false));
        accounts.add(new Account("bswayne5@digg.com", "q3M7sUOB6PjQ", true));
        accounts.add(new Account("savrahamiana@wp.com", "rAKReZYv7", false));
        accounts.add(new Account("krodearc@miitbeian.gov.cn", "ymSljyfGf", false));

        Counter<Account> counter = new Counter<>(accounts);
        AccountSuspended criteria = new AccountSuspended();
        int count = counter.countNumberOfElementsWithSpecificProperty(criteria);

        System.out.format("%d accounts are suspended", count);
        System.out.println();
    }

    private static void exchangeElements() {
        Integer[] numbers = {1, 2};
        System.out.print("Before: ");
        dumpElements(numbers);

        Exchange.exchangeElements(numbers);

        System.out.print("After : ");
        dumpElements(numbers);
    }

    private static <T> void dumpElements(T[] data) {
        System.out.format("{%s, %s}", data[0], data[1]);
        System.out.println();
    }

    private static void filterBooks() {
        Collection<Book> books = new Collection<>();
        books.addItemToList(new Book("Two Rivers", "Zoe Saadia", "Native American Historical Fiction"));
        books.addItemToList(new Book("The Peacekeeper", "Zoe Saadia", "Native American Historical Fiction"));
        Book shouldBeRemoved = new Book("Shouldn't be here", "Zoe Saadia", "Native American Historical Fiction");
        books.addItemToList(shouldBeRemoved);
        books.addItemToList(new Book("Follow the Rive", "James Alexander Thom", "Native American Historical Fiction"));
        books.addItemToList(new Book("Ender's Game", "Orson Scott Card", "Sci-Fi"));
        books.addItemToList(new Book("1984", "George Orwell", "Sci-Fi"));
        books.removeItemFromTheList(shouldBeRemoved);

        // filter by author
        BookAuthorIs criteria = new BookAuthorIs("Zoe Saadia");
        ArrayList<Book> booksByZoe = books.performOperation(criteria);
        for(Book el: booksByZoe) {
            System.out.format("%s by %s", el.getTitle(), el.getAuthor());
            System.out.println();
        }
    }
}
