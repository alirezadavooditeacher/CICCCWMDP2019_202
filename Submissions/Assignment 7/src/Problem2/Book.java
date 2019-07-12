package Problem2;

public class Book {
    private String author;
    private String title;
    private int year;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
}
