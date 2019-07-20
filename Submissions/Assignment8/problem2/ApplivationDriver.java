package assignment8.problem2;

import assignment8.problem1.Page;

import java.util.ArrayList;

public class ApplicationDriver {

    public static void main(String[] args) {

        Page page1 = new Page(1, false);
        Page page2 = new Page(2, true);
        Page page3 = new Page(3, false);
        Page page4 = new Page(4, false);
        Page page5 = new Page(5, false);
        Page page6 = new Page(6, true);
        Page page7 = new Page(7, false);
        Page page8 = new Page(8, true);
        Page page9 = new Page(9, false);
        Page page10 = new Page(10, false);


        ArrayList<Page> book = new ArrayList<Page>();
        book.add(page1);
        book.add(page2);
        book.add(page3);
        book.add(page4);
        book.add(page5);
        book.add(page6);
        book.add(page7);
        book.add(page8);
        book.add(page9);
        book.add(page10);

        GenericSearch genericSeach = new GenericSearch();

//        genericSeach.search(book);

    }



}

