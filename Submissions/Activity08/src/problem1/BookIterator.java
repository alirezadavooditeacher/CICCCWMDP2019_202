package src.problem1;

public class BookIterator implements Iterator {
    private Book book;
    private int index;

    public BookIterator(Book book) {
        this.book = book;
        this.index = 0;
    }

    public boolean hasNext() {
        if (this.index < book.getLength()) {
            return true;
        }

        return false;
    }

    public Page next() {
        Page page = this.book.getPageAt(this.index);
        this.index++;
        return page;
    }

}
