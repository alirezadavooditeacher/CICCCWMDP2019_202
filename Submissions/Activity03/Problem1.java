package Activity03;

import java.util.ArrayList;

public class Problem1 {

    public ArrayList<Movie> getPG(ArrayList<Movie> movies) {
        ArrayList<Movie> pgMovies = new ArrayList<>();
        for (Movie movie: movies) {
            if (movie.getRating().equals("PG")) {
                pgMovies.add(movie);
            }
        }

        return pgMovies;
    }

    public Movie getCasinoRoyale() {
        return new Movie("Casino Royale", "Eon Productions", "PG-13");
    }
}
