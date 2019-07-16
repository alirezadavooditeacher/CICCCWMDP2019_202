package assignment8;

import java.util.ArrayList;

public class ApplicationDrive {

    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
    }

    public static void problem1() {
        Page page0 = new Page(10, true);
        Page page1 = new Page(11, false);
        Page page2 = new Page(15, true);
        Page page3 = new Page(1000, true);

        ArrayList<Page> list = new ArrayList<>();
        list.add(page0);
        list.add(page1);
        list.add(page2);
        list.add(page3);

        Book book = new Book("Helloooo", BookCategory.Food, list);
        SearchBook searchBook = new SearchBook();
        int pageNum = searchBook.search(book);
        System.out.println(pageNum);
    }

    public static void problem2() {
        Page page0 = new Page(10, true);
        Page page1 = new Page(11, false);
        Page page2 = new Page(15, true);
        Page page3 = new Page(1000, true);

        ArrayList<Page> list = new ArrayList<>();
        list.add(page0);
        list.add(page1);
        list.add(page2);
        list.add(page3);

        Book book = new Book("Helloooo", BookCategory.Food, list);
        GenericSearch genericSearch = new GenericSearch();
        int pageNum = genericSearch.search(book.itetator(), page3);
        System.out.println(pageNum);
    }

    public static void problem3() {
        Page page0 = new Page(10, true);
        Page page1 = new Page(11, false);
        Page page2 = new Page(15, true);
        Page page3 = new Page(1000, true);

        ArrayList<Page> list = new ArrayList<>();
        list.add(page0);
        list.add(page1);
        list.add(page2);
        list.add(page3);

        Book book = new Book("Helloooo", BookCategory.Food, list);
        GenericSearchList GenericSearchList = new GenericSearchList();
        ArrayList<Object> pageNum = GenericSearchList.search(book.itetator(), page3);
        System.out.println(pageNum);
    }

}
