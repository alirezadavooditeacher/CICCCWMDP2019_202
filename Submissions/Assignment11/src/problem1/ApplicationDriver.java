package problem1;

public class ApplicationDriver {
    public static void main(String[] args) {
        InputArray test1Problem1 = new InputArray(new int[]{});
        System.out.println("-------- test1 --------");
        test1Problem1.castles();

        InputArray test2Problem1 = new InputArray(new int[]{1, 2, 3, 3, 3,3,3, 5});
        System.out.println("\n-------- test2 --------");
        test2Problem1.castles();

        InputArray test3Problem1 = new InputArray(new int[]{1, 2, 3, 3, 3, 5, 6, 2, 8, 10, 10, 10, 9, 4, 12, 3});
        System.out.println("\n-------- test3 --------");
        test3Problem1.castles();
    }
}
