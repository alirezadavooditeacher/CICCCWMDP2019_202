import problems.Holiday;
import problems.Movie;

public class Driver {
    public static void main(String[] args) {
        System.out.println( "-------- problem 0 --------" );
        int day = 4;
        String month = "July";
        String name = "Independence Day";
        Holiday problem0 = new Holiday( day, month, name );
        System.out.println( problem0 );

        System.out.println( "\n-------- problem 1 --------" );
        String title = "Casino Royale";
        String studio = "Eon Productions";
        String rating = "PG-13";
        Movie problem1 = new Movie( title, studio, rating );
        System.out.println( problem1 );
    }
}
