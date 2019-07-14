package assignment7;

import java.util.ArrayList;

public class ApplicationDriver {

    public static void main(String[] args) {
        problem1();

    }

    public static void problem1() {
        POJO pojo = new POJO("Harry", "action", 1);
        POJO pojo1 = new POJO("Harry2", "love", 2);
        POJO pojo2 = new POJO("Harry3", "action", 3);
        POJO pojo4 = new POJO("Harry4", "action", 4);

        ArrayList<POJO> pojoList = new ArrayList<>();
        pojoList.add(pojo);
        pojoList.add(pojo1);
        pojoList.add(pojo2);
        pojoList.add(pojo4);

        Generic<POJO> Generic = new Generic<>();
        Generic.countNumberOfElementsWithSpecificProperty(pojoList);

        Generic.exchangeElements(pojoList);



    }

}
