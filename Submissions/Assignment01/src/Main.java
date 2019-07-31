public class Main {

    public static void main(String[] args) {
        problem01();
        problem02();
        problem03();
        problem04();
        problem05();
        problem06();
        problem07();
        problem08();
        problem09();
        problem10();
        problem11();
        problem12();
        problem13();
        problem14();
        problem15();
    }

    public static void problem01() {
        System.out.println("Problem 1 =============================");
        System.out.print("Expect 19: ");
        Problem01.calculate(10, 9, '+');
        System.out.print("Expect 1: ");
        Problem01.calculate(10, 9, '-');
        System.out.print("Expect 90: ");
        Problem01.calculate(10, 9, '*');
        System.out.print("Expect 1: ");
        Problem01.calculate(10, 9, '/');
    }

    public static void problem02() {
        System.out.println("Problem 2 =============================");
        System.out.println("Shape1 (5) ----------------------------");
        Problem02.draw(Problem02.Shape.SHAPE1, 5);
        System.out.println("Shape2 (5) ----------------------------");
        Problem02.draw(Problem02.Shape.SHAPE2, 5);
        System.out.println("Shape3 (5) ----------------------------");
        Problem02.draw(Problem02.Shape.SHAPE3, 5);
    }

    public static void problem03() {
        System.out.println("Problem 3 =============================");
        System.out.println("Expect true:");
        System.out.println(Problem03.isPrime(2));
        System.out.println(Problem03.isPrime(7));
        System.out.println(Problem03.isPrime(11));
        System.out.println("Expect false:");
        System.out.println(Problem03.isPrime(0));
        System.out.println(Problem03.isPrime(-1));
        System.out.println(Problem03.isPrime(10));
    }

    public static void problem04() {
        System.out.println("Problem 3 =============================");
        double[] result = Problem04.askNumbers();
        System.out.format("Total: %s\n", result[0]);
        System.out.format("Mean : %s\n", result[1]);
        System.out.format("Stdev: %s\n", result[2]);
    }

    public static void problem05() {
        System.out.println("Problem 5 =============================");
        System.out.print("Expect 6: ");
        Problem05.sumDigits(123);
    }

    public static void problem06() {
        System.out.println("Problem 6 =============================");
        System.out.print("Expect 97: ");
        System.out.println(Problem06.findNextPrimeNumber(89));
    }

    public static void problem07() {
        System.out.println("Problem 7 =============================");
        System.out.print("Expect 2: ");
        System.out.println(Problem07.calculateQuotient(4, 2));
    }

    public static void problem08() {
        System.out.println("Problem 8 =============================");
        Problem08.main();
    }

    public static void problem09() {
        System.out.println("Problem 9 =============================");
        Problem09.main();
    }

    public static void problem10() {
        System.out.println("Problem 10 ============================");
        System.out.print("Expect 1010: ");
        System.out.println(Problem10.base10to2(10));
        System.out.print("Expect 10: ");
        System.out.println(Problem10.base10to2(2));
        System.out.print("Expect 1: ");
        System.out.println(Problem10.base10to2(1));
        System.out.print("Expect 0: ");
        System.out.println(Problem10.base10to2(0));
    }

    public static void problem11() {
        System.out.println("Problem 11 ============================");
        Problem11.main();
    }

    public static void problem12() {
        System.out.println("Problem 12 ============================");
        System.out.print("Expect 23: ");
        System.out.println(Problem12.findTheNumber());
    }

    public static void problem13() {
        System.out.println("Problem 13 ============================");
        Problem13.drawMultiplicationTable(1);
        Problem13.drawMultiplicationTable(10);
        Problem13.drawMultiplicationTable(16);
    }

    public static void problem14() {
        System.out.println("Problem 14 ============================");
        System.out.println(Problem14.isPalindrome("BaBa"));
        System.out.println(Problem14.isPalindrome("BaaB"));
        System.out.println(Problem14.isPalindrome("Baab"));
    }

    public static void problem15() {
        System.out.println("Problem 15 ============================");
        System.out.println("Expect true:");
        System.out.println(Problem15.isValidStatement("a+b*a+c/c%y"));
        System.out.println(Problem15.isValidStatement("(a+b)*(a/d-(a/b))"));
        System.out.println(Problem15.isValidStatement("a+-b"));

        System.out.println("Expect false:");
        System.out.println(Problem15.isValidStatement("a+b*a+c/c%y)"));
        System.out.println(Problem15.isValidStatement("(a+b*a+c/c%y"));
        System.out.println(Problem15.isValidStatement("a++b"));
        System.out.println(Problem15.isValidStatement("a+b+"));
        System.out.println(Problem15.isValidStatement("/b"));
    }
}
