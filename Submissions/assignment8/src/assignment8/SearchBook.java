package assignment8;

public class SearchBook {

    public int search(Book book) {
        BookIterator bookIterator = book.itetator();
        int pageNumber = 0;
        while(bookIterator.hasNext()) {
            Page page = bookIterator.next();

            if (page.getPageNumber() % 2 == 0 && page.getHasImage()) {
                pageNumber++;
            }

        }
        return pageNumber;

    }

}


// Time complexity of an algorithm quantifies the amount of time taken
// by an algorithm to run as a function of the length of the input.
// Similarly, Space complexity of an algorithm quantifies the amount of space or
//memory taken by an algorithm to run as a function of the length of the input.

