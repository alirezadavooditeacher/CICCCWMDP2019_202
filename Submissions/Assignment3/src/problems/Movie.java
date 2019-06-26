package problems;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public String getRating() {
        return rating;
    }

    public String getStudio() {
        return studio;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Movie(String title, String studio, String rating) {
        super();
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        super();
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public void getPG(ArrayList<Movie> movies){
        for ( Movie rating : movies ){
            if ( !rating.equals( "PG" )){
                movies.remove( movies );
            }
        }
    }

    public String toString() {
        return String.format("Title : " + this.title + "\nStudio : " + this.studio + "\nRating : " + this.rating);
    }
}