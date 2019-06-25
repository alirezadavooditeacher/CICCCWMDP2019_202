import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                '}';
    }

    public static ArrayList<Movie> getPG(Movie[] movies) {
        ArrayList<Movie> pgs = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgs.add(movie);
            }
        }

        return pgs;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
}
