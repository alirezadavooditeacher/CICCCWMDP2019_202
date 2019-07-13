package src.problem3;

import src.problem1.Book;
import src.problem1.BookCategory;
import src.problem1.Page;

import java.util.ArrayList;

public class ApplicationDriver {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Page page01 = new Page(1, true);
        Page page02 = new Page(2, false);
        Page page03 = new Page(3, false);
        Page page04 = new Page(4, true);
        Page page05 = new Page(5, true);
        Page page06 = new Page(6, false);
        Page page07 = new Page(7, false);
        Page page08 = new Page(8, false);
        Page page09 = new Page(9, false);
        Page page10 = new Page(10, true);

        ArrayList<Page> pages = new ArrayList<>();
        pages.add(page01);
        pages.add(page02);
        pages.add(page03);
        pages.add(page04);
        pages.add(page05);
        pages.add(page06);
        pages.add(page07);
        pages.add(page08);
        pages.add(page09);
        pages.add(page10);
        Book book = new Book("How to diet", BookCategory.Historical, pages);

        GenericSearchList genericSearch = new GenericSearchList();
        ArrayList<Page> list = genericSearch.search(book.iterator(), page04);

        if (list.size() != 1) {
            System.out.println("❌");
        } else {
            System.out.println("🎾");
        }
    }
}
