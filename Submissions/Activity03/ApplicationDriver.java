package Activity03;

import java.util.ArrayList;

public class ApplicationDriver {
    public static void main(String[] args) {
//        testProblem0();
        testProblem1();
    }

    public static void testProblem0() {

        Holiday h1 = new Holiday("Sample Day 1", 4, "July");
        Holiday h2 = new Holiday("Sample Day 2", 5, "July");
        Problem0 problem0 = new Problem0();
        // this should return false
        System.out.println(problem0.inSameMonth(h1, h2));

        Holiday h3 = new Holiday("Sample Day 3", 4, "July");
        // this should return true
        System.out.println(problem0.inSameMonth(h1, h3));

        ArrayList<Holiday> holidays = new ArrayList<>();
        holidays.add(h1);
        holidays.add(h2);
        holidays.add(h3);
        // this should return the result of "13 / 3"
        System.out.println(problem0.avgDate(holidays));

        Holiday independenceDay = problem0.getIndependenceDay();
        System.out.println(independenceDay.getName());
        System.out.println(independenceDay.getMonth());
        System.out.println(independenceDay.getDay());
    }

    public static void testProblem1() {

        Movie m1 = new Movie("title1", "marvel", "PG");
        Movie m2 = new Movie("title2", "22centuries", "PG-13");
        Movie m3 = new Movie("title3", "DCComics", "");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        Problem1 problem1 = new Problem1();
        ArrayList<Movie> PGMovies = problem1.getPG(movies);
        System.out.println("PG movies are: ");
        for (Movie movie: PGMovies) {
            System.out.println(movie.getTitle());
            System.out.println(movie.getStudio());
            System.out.println(movie.getRating());
        }

        Movie casinoRoyale = problem1.getCasinoRoyale();
        System.out.println("");
        System.out.println("The Casino Royale instance: ");
        System.out.println(casinoRoyale.getTitle());
        System.out.println(casinoRoyale.getStudio());
        System.out.println(casinoRoyale.getRating());
    }

}
