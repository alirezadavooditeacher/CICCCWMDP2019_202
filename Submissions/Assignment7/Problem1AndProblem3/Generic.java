package assignment7.Problem1AndProblem3;

import java.util.ArrayList;

public class Generic<T extends Book> {

    private ArrayList<Book> books;

    public Generic(ArrayList<Book> books) {
        super();
        this.books = books;
    }

    public void countNumberOfElementsWithSpecificProperty(ArrayList<T> books) {

        int count = 0;
        for (T obj:books) {
            if (obj.getGenre() == "suspense") {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("There is no suspense book.");
        } else if (count == 1) {
            System.out.println("There is a suspense book.");
        } else {
            System.out.println("There are "+count+ " suspense books.");
        }

    }

    public ArrayList<T> exchangeElements(ArrayList<T> books) {

        T temp = books.get(0);
        books.set(0, books.get(1));
        books.set(1, temp);

        return books;

    }

}
