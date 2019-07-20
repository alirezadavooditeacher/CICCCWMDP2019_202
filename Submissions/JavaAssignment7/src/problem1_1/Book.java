package problem1_1;

public class Book implements Countable<Book> {
    private String category;
    private String author;
    private int page;

    public Book(String category, String author, int page) {
        this.category = category;
        this.author = author;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean test(Book bi) {
        return  (bi.getCategory() == "Drama" );

    }
}
