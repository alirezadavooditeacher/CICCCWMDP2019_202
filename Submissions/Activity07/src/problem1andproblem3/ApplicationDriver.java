package src.problem1andproblem3;

import java.util.ArrayList;

public class ApplicationDriver {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    private static void test1() {
        Chair chair1 = new Chair(4);
        Chair chair2 = new Chair(3);
        Chair chair3 = new Chair(2);
        Chair chair4 = new Chair(1);
        Chair chair5 = new Chair(5);

        ArrayList<Chair> chairs = new ArrayList<>();
        chairs.add(chair1);
        chairs.add(chair2);
        chairs.add(chair3);
        chairs.add(chair4);
        chairs.add(chair5);

        GenericClass<Chair> genericClass = new GenericClass<>();
        int count = genericClass.countNumberOfElementsWithSpecificProperty(chairs);

        if (count != 3) {
            System.out.println("❌");
        } else {
            System.out.println("🎾");
        }

    }

    private static void test2() {
        Spider spider1 = new Spider();
        Spider spider2 = new Spider();
        Spider spider3 = new Spider();

        ArrayList<Spider> spiders = new ArrayList<>();
        spiders.add(spider1);
        spiders.add(spider2);
        spiders.add(spider3);

        GenericClass<Spider> genericClass = new GenericClass<>();
        int count = genericClass.countNumberOfElementsWithSpecificProperty(spiders);

        if (count < 1) {
            System.out.println("❌");
        } else {
            System.out.println("🎾");
        }

    }

    private static void test3() {
        Table table1 = new Table(1);
        Table table2 = new Table(2);
        Table table3 = new Table(3);
        Table table4 = new Table(4);
        Table table5 = new Table(5);

        ArrayList<Table> tables = new ArrayList<>();
        tables.add(table1);
        tables.add(table2);
        tables.add(table3);
        tables.add(table4);
        tables.add(table5);

        GenericClass<Table> genericClass = new GenericClass<>();
        int count = genericClass.countNumberOfElementsWithSpecificProperty(tables);

        if (count != 3) {
            System.out.println("❌");
        } else {
            System.out.println("🎾");
        }

    }
    
    public static void test4() {

        Table table = new Table(4);
        Spider spider = new Spider();
        Chair chair = new Chair(4);

        ArrayList<Countable> countables = new ArrayList<>();
        countables.add(table);
        countables.add(spider);
        countables.add(chair);

        GenericClass<Countable> chairGenericClass = new GenericClass<>();
        int countOfGoodChair = chairGenericClass.countNumberOfElementsWithSpecificProperty(countables);

        if (countOfGoodChair != 3) {
            System.out.println("❌");
        } else {
            System.out.println("🎾");
        }
    }

}
