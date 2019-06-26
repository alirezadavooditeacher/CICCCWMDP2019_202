package Assignment3;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        super();
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public void getPG(ArrayList<Movie> movies){
        for ( Movie rating : movies ){
            if (!rating.equals( "PG" )){
                movies.remove( movies );
            }
        }
    }

    public String toString() {
        return String.format("The title is " + this.title + ", the studio is " + this.studio + " and the rating is " + this.rating);
    }

}
