package src.problem1;

import java.util.ArrayList;

public class ApplicationDriver {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Page page01 = new Page(1, true);
        Page page02 = new Page(2, false);
        Page page03 = new Page(3, false);
        Page page04 = new Page(4, true); // yes
        Page page05 = new Page(5, true);
        Page page06 = new Page(6, false);
        Page page07 = new Page(7, false);
        Page page08 = new Page(8, false);
        Page page09 = new Page(9, false);
        Page page10 = new Page(10, true); // yes
        Page page11 = new Page(11, false);
        Page page12 = new Page(12, true); // yes
        Page page13 = new Page(13, true);
        Page page14 = new Page(14, false);
        Page page15 = new Page(15, false);
        Page page16 = new Page(16, false);
        Page page17 = new Page(17, false);
        Page page18 = new Page(18, true); // yes

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
        pages.add(page11);
        pages.add(page12);
        pages.add(page13);
        pages.add(page14);
        pages.add(page15);
        pages.add(page16);
        pages.add(page17);
        pages.add(page18);
        Book book = new Book("How to diet", BookCategory.Historical, pages);

        SearchBook searchBook = new SearchBook();
        int count = searchBook.search(book);

        if (count != 4) {
            System.out.println("❌");
        } else {
            System.out.println("🎾");
        }
    }
}
