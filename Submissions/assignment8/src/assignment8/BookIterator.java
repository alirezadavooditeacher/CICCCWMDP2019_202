package assignment8;

public class BookIterator implements Iterator{
    private Book book;
    private int index;

    public BookIterator(Book book) {
        this.book = book;
        this.index = index;
    }

    public boolean hasNext() {
        if (this.index < this.book.getLength()) {
            return true;
        }
        return false;

    }

    public Page next() {
        Page page = this.book.getPageAt(index);
        this.index++;
        return page;
    }

}
