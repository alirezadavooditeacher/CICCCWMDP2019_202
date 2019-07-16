package src.problem1;

public class SearchBook {

    public int search(Book book) {

        BookIterator bookIterator = book.iterator();
        int count = 0;
        while (bookIterator.hasNext()) {
            Page page = bookIterator.next();
            if (page.hasImage() && (page.getPageNumber() % 2) == 0) {
                count++;
            }
        }

        return count;
    }
}
