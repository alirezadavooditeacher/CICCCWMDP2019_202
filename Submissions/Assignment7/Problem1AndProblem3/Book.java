package assignment7.Problem1AndProblem3;

public class Book {

    private String title;
    private String genre;
    private int numberOfPages;

    public Book(String title, String genre, int numverOfPages) {
        super();
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numverOfPages;
    }

    public String getGenre() {
        return genre;
    }

}