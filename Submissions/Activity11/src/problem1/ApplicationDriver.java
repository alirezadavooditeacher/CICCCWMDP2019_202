package src.problem1;

import java.util.ArrayList;

public class ApplicationDriver {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void result(Integer expect, Integer actual) {
        if (expect.equals(actual)) {
            System.out.println("🎾");
        } else {
            System.out.println("❌");
        }
    }

    private static void test1() {
        ArrayList<Integer> inputListOfInteger = new ArrayList<>();
        inputListOfInteger.add(1); // castle (beginning)
        inputListOfInteger.add(20);
        inputListOfInteger.add(30); // castle (peak)
        inputListOfInteger.add(20);
        inputListOfInteger.add(14);
        inputListOfInteger.add(14);
        inputListOfInteger.add(13); // castle (valley)
        inputListOfInteger.add(25); // castle (peak)
        inputListOfInteger.add(23); // castle (valley)
        inputListOfInteger.add(50);

        Integer expect = 5;
        CastleBuilder castleBuilder = new CastleBuilder();
        Integer actual = castleBuilder.build(inputListOfInteger);

        result(expect, actual);
    }

    private static void test2() {
        ArrayList<Integer> inputListOfInteger = new ArrayList<>();
        inputListOfInteger.add(20); // castle (beginning)
        inputListOfInteger.add(30);
        inputListOfInteger.add(40);
        inputListOfInteger.add(50); // castle (peak)
        inputListOfInteger.add(50); // castle (peak)
        inputListOfInteger.add(50); // castle (peak)
        inputListOfInteger.add(40); // castle (valley)
        inputListOfInteger.add(50);
        inputListOfInteger.add(50);
        inputListOfInteger.add(60);

        Integer expect = 5;
        CastleBuilder castleBuilder = new CastleBuilder();
        Integer actual = castleBuilder.build(inputListOfInteger);

        result(expect, actual);
    }

    private static void test3() {
        ArrayList<Integer> inputListOfInteger = new ArrayList<>();
        inputListOfInteger.add(20); // castle (beginning)
        inputListOfInteger.add(30);
        inputListOfInteger.add(60); // castle (peak)
        inputListOfInteger.add(50); // castle (valley)
        inputListOfInteger.add(50); // castle (valley)
        inputListOfInteger.add(50); // castle (valley)
        inputListOfInteger.add(80); // castle (peak)
        inputListOfInteger.add(50);
        inputListOfInteger.add(50);
        inputListOfInteger.add(40);

        Integer expect = 6;
        CastleBuilder castleBuilder = new CastleBuilder();
        Integer actual = castleBuilder.build(inputListOfInteger);

        result(expect, actual);
    }
}
