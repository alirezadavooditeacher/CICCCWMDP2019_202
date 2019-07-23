import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        problem0();
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
        problem8();
        problem9();
    }


    public static void problem0() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);

        Problem0 p = new Problem0(numbers);
        int number = p.findMaxRepeatedNumber();

        System.out.println("Problem0 ==========================");
        System.out.print("Should be 3: ");
        System.out.println(number);
    }

    public static void problem1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        numbers.add(30);
        numbers.add(40);
        numbers.add(40);

        System.out.println("Problem1 ==========================");
        Problem1.printRepeatedNumbers(numbers);
    }

    public static void problem2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(8);
        numbers.add(8);
        numbers.add(9);

        System.out.println("Problem2 ==========================");
        Problem2.distinctAndPrint(numbers);
    }

    public static void problem3() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(3);
        numbers.add(7);
        numbers.add(7);
        numbers.add(10);
        numbers.add(9);
        numbers.add(9);

        System.out.println("Problem3 ==========================");
        Problem3 problem3 = new Problem3(numbers);
        try {
            int theNumber = problem3.findRepeatedNumbers();
            System.out.format("Should be 10: %d\n", theNumber);
        } catch (Exception e) {
            System.out.println("Error!!");
        }
    }

    public static void problem4() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(
                "Adey",
                "Lacroux",
                "086 Waubesa Park",
                1996,
                56
        ));
        students.add(new Student(
                "Gasparo",
                "Towey",
                "21 Donald Avenue",
                1989,
                94
        ));
        students.add(new Student(
                "Christoper",
                "Cuttin",
                "9 Hintze Terrace",
                2012,
                49
        ));
        students.add(new Student(
                "Basia",
                "Sarle",
                "48 Burning Wood Circle",
                2006,
                72
        ));
        students.add(new Student(
                "Brianna",
                "Scandwright",
                "4391 Del Mar Point",
                1996,
                18
        ));
        Student smartest = Problem4.findRepeatedNumbers(students);

        System.out.println("Problem4 ==========================");
        System.out.format("Should be Gasparo: %s\n", smartest.getFirstName());
    }

    private static void problem5() {
        System.out.println("Problem5 ==========================");
        Problem5 problem5 = new Problem5();
        System.out.println(problem5.main());
    }

    private static void problem6() {
        System.out.println("Problem6 ==========================");
        Problem6 problem6 = new Problem6();
        System.out.println(problem6.main());
    }

    private static void problem7() {
        System.out.println("Problem7 ==========================");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);
        numbers.add(8);
        numbers.add(6);
        System.out.format("Should be 3: %d\n", Problem7.findIndex(numbers, 4));
        System.out.format("Should be -1: %d\n", Problem7.findIndex(numbers, 5));
    }

    private static void problem8() {
        System.out.println("Problem8 ==========================");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        System.out.println(Problem8.removeNumber(numbers, 3));
    }

    private static void problem9() {
        System.out.println("Problem9 ==========================");
        int[][] grid = {
            {0, 1, 1, 1, 1, 1, 1, 0, 0, 1},
            {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 0, 0, 0, 1, 1, 1}
        };

        int [] cell = (Problem9.findTheHeaviestCell(grid));
        System.out.format("row: %d, column: %d", cell[0], cell[1]);
    }


}
