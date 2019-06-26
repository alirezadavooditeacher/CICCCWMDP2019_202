package Assignment3;

public class Driver {


    public static void main(String[] args) {

        // Driver Holiday
        int day = 4;
        String month = "July";
        String name = "Independence Day";
        Holiday problemHoliday = new Holiday(name, day, month);
        System.out.println(problemHoliday);
        System.out.println();

        //Driver Movie
        String title = "Casino Royale";
        String studio = "Eon Productions";
        String rating = "PG-13";

        Movie movieRating = new Movie(title, studio, rating);
        System.out.println(movieRating);

    }

}