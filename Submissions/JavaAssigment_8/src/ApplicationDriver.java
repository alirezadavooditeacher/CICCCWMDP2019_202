import java.util.ArrayList;

import Models.Book;
import Models.Page;

public class ApplicationDriver {
	
	public static void main(String[] args) {
        ArrayList<Page> pages = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            pages.add(new Page(i, i % 3 == 0));
        }
        Book book = new Book("Hello worrld java", Book.Category.Science, pages);

        System.out.println("---------- [Frist Problem] ----------");
        problem1(book);
    
    }

    public static void problem1(Book book) {
        SearchBook search = new SearchBook();
        System.out.format("The number of pages which have image(s) on even page number is: %d", search.SearchBook(book));
    }


}
