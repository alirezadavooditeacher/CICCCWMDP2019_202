import assignment3.Holiday;
import assignment3.Movie;

public class ApplicationDriver {
    public static void main(String[] args) {
        problem0();
        problem1();
    }

        public static void problem0(){

            Holiday hol1 = new Holiday("Canadaday", 6, "July");
            Holiday hol2 = new Holiday("Familyday", 20, "February" );
            Holiday hol3 = new Holiday("Indepedenceday", 4, "July");

            System.out.println(Holiday.inSameMonth(hol1, hol2));
            System.out.println();

            Holiday[] holidays = {hol1, hol2};
            System.out.println(Holiday.avgDate(holidays));
            System.out.println();

//            System.out.println(Holiday);
        }

        public static void problem1(){

        Movie[] movies= {
                new Movie("John Wick 3", "Lionsgate", "PG-90"),
                new Movie("Spider Man:Far from home", "Marvel", "PG"),
                new Movie("Men in Black:International", "Sony Pixar", "88"),
                new Movie("Casino Royale", "Eon Production", "PG-13"),
        };
            System.out.println(Movie.getPG(movies));

        }

}
