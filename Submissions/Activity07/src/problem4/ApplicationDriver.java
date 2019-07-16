package src.problem4;

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

        GenericClass<Chair> genericClass = new GenericClass<>();
        genericClass.addItemToList(chair1);
        genericClass.addItemToList(chair2);
        genericClass.addItemToList(chair3);
        genericClass.addItemToList(chair4);
        genericClass.addItemToList(chair5);

        ArrayList<Chair> newChairs = genericClass.performOperation();

        if (newChairs.size() != 3) {
            System.out.println("❌");
        } else {
            System.out.println("🎾");
        }

    }

    private static void test2() {
        Spider spider1 = new Spider();
        Spider spider2 = new Spider();
        Spider spider3 = new Spider();

        GenericClass<Spider> genericClass = new GenericClass<>();
        genericClass.addItemToList(spider1);
        genericClass.addItemToList(spider2);
        genericClass.addItemToList(spider3);

        ArrayList<Spider> newSpiders = genericClass.performOperation();

        if (newSpiders.size() != 3) {
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

        GenericClass<Table> genericClass = new GenericClass<>();
        genericClass.addItemToList(table1);
        genericClass.addItemToList(table2);
        genericClass.addItemToList(table3);
        genericClass.addItemToList(table4);
        genericClass.addItemToList(table5);
        genericClass.addItemToList(table5);
        genericClass.removeItemFromTheList(1);

        ArrayList<Table> newTables = genericClass.performOperation();

        if (newTables.size() != 4) {
            System.out.println("❌");
        } else {
            System.out.println("🎾");
        }

    }

    public static void test4() {

        Table table = new Table(4);
        Spider spider = new Spider();
        Chair chair = new Chair(4);

        GenericClass<Countable> genericClass = new GenericClass<>();
        genericClass.addItemToList(table);
        genericClass.addItemToList(spider);
        genericClass.addItemToList(chair);
        genericClass.addItemToList(chair);
        genericClass.removeItemFromTheList(3);

        ArrayList<Countable> newTables = genericClass.performOperation();

        if (newTables.size() != 3) {
            System.out.println("❌");
        } else {
            System.out.println("🎾");
        }
    }

}
