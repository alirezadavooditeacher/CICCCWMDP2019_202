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

    public Movie(String title, String studio) {
        super();
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    
    public static void main(String[] args) {
        String title = "Casino Royale";
        String studio = "Eon Productions";
        String rating = "PG-13";
        
        Movie mov1 = new Movie(title, studio, rating);
        
    }
    
}