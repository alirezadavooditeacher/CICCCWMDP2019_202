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

    public static Movie[] getPG(Movie[] array) {
        Movie[] arrayPG = new Movie[array.length];
        for (int i = 0; i < array.length; i++) {
            Movie movie = array[i];
            if (movie.rating.equals("PG")) {
                arrayPG[i] = array[i];
            }
        }

        return arrayPG;
    }

    public static Movie createMovie() {
        return new Movie("�Casino Royale", "Eon Productions", "PG-13");
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Movie1", "Studio1");
        Movie m2 = new Movie("Movie2", "Studio2");
        Movie m3 = new Movie("Movie3", "Studio3");
        Movie m4 = Movie.createMovie();
        Movie[] array = new Movie[4];
        array[0] = m1;
        array[1] = m2;
        array[2] = m3;
        array[3] = m4;

        Movie[] arrayPG = Movie.getPG(array);
        for (int i = 0; i < arrayPG.length; i++) {
            if (arrayPG[i] != null) {
                System.out.println(arrayPG[i].title + " : " + arrayPG[i].studio + " : " + arrayPG[i].rating);
            }
        }
    }

}