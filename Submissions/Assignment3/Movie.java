package assigments.Assigment3;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public ArrayList<Movie> getPG(ArrayList<Movie>movies){
        ArrayList<Movie>moviesPG = new ArrayList<Movie>();

        for(Movie movie:movies){
            if(movie.rating == "PG"){
                moviesPG.add(movie);
            }
        }
        return moviesPG;

    }

    public static void main(String[] args) {
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");

        System.out.println(casinoRoyale.title + " " + casinoRoyale.studio + " " + casinoRoyale.rating);
    }
}
