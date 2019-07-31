public class Main {

    public static void main(String[] args) {
        problem0();
        problem1();
    }


    public static void problem0() {
        Holiday independenceDay = new Holiday("Independence Day", 4, "July");
        Holiday canadaDay = new Holiday("Canada Day", 1, "July");

        System.out.println("Problem 0 ========================");
        System.out.format("Except true: %s", Holiday.inSameMonth(independenceDay, canadaDay));
        System.out.println();

        Holiday[] holidays = {independenceDay, canadaDay};
        System.out.format("Except 2.50: %.2f", Holiday.avgDate(holidays));
        System.out.println();
    }

    public static void problem1() {
        Movie casino = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie[] movies = {
            casino,
            new Movie("Toy Story 4", "Pixar"),
            new Movie("Anna", "N/A", "PG")
        };

        System.out.println("Problem 0 ========================");
        System.out.println("Except Toy Story 4, Anna");
        System.out.println(Movie.getPG(movies));
    }

}
