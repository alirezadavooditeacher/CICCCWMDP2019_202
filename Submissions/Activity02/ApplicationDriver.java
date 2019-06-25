package Activity02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ApplicationDriver {
    public static void main(String[] args) {
//        testProblem0();
//        testProblem1();
//        testProblem2();
//        testProblem3();
//        testProblem4();
//        testProblem5();
//        testProblem6();
//        testProblem7();
        testProblem8();
//        testProblem9();
    }

    private static void testProblem0() {
        ArrayList<Integer> numbers = getSampleArrayOfInteger01();
        Problem0 problem0 = new Problem0();
        int number = problem0.getMostRepeatedNumber(numbers);
        System.out.println("The most repeated number in array list is " + number);
    }

    private static void testProblem1() {
        ArrayList<Integer> numbers = getSampleArrayOfInteger01();
        Problem1.printNumbers(numbers);
    }

    private static void testProblem2() {
        ArrayList<Integer> numbers = getSampleArrayOfInteger01();
        Problem2.getDistinctNumbers(numbers);
    }

    private static void testProblem3() {
        ArrayList<Integer> numbers = getSampleArrayOfInteger02();
        Problem3 problem3 = new Problem3();
        System.out.println(problem3.getNumberRepeatedOnly2Times(numbers));
    }

    private static void testProblem4() {
        ArrayList<HashMap<String, String>> studentsInfo = prepareStudentsInfo();
        System.out.println("smartest student is " + Problem4.getSmartestStudent(studentsInfo));
    }

    private static void testProblem5() {
        Problem5 problem5 = new Problem5();
        problem5.printNamesAndCounts();
    }

    private static void testProblem6() {
        Problem6 problem6 = new Problem6();
        System.out.println(problem6.sumEnteredNumber());
    }

    private static void testProblem7() {
        // receive 9
        ArrayList<Integer> numArray = getSampleArrayOfInteger03();
        System.out.println(Problem7.linearSearch(numArray, 57));

        // receive -1
        ArrayList<Integer> numArray2 = getSampleArrayOfInteger03();
        System.out.println(Problem7.linearSearch(numArray2, 22));
    }

    private static void testProblem8() {
        ArrayList<Integer> numArray = getSampleArrayOfInteger04();
        System.out.println(Problem8.removeElementsInArray(numArray, 4));
    }

    private static void testProblem9() {
    }

    private static ArrayList<Integer> getSampleArrayOfInteger01() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);

        return numbers;
    }

    private static ArrayList<Integer> getSampleArrayOfInteger02() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        return numbers;
    }

    private static ArrayList<Integer> getSampleArrayOfInteger03() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);
        numbers.add(14);
        numbers.add(20);
        numbers.add(32);
        numbers.add(45);
        numbers.add(57);
        numbers.add(69);
        numbers.add(10);
        numbers.add(23);
        numbers.add(32);
        numbers.add(45);
        numbers.add(567);
        numbers.add(68);

        return numbers;
    }

    private static ArrayList<Integer> getSampleArrayOfInteger04() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(4);

        return numbers;
    }

    public static int[] toArray(ArrayList<Integer> list) {
        int length = list.size();
        int[] numArray = new int[length];
        Iterator<Integer> iter = list.iterator();
        for (int i = 0; i < length; i++) {
            numArray[i] = iter.next();
        }

        return numArray;
    }

    public static ArrayList<HashMap<String, String>> prepareStudentsInfo() {
        /*
         * o firstName
         * o lastName
         * o address
         * o Year of birth
         * o Average
         */
        ArrayList<HashMap<String, String>> array = new ArrayList<>();

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("firstName", "Marcus");
        map1.put("lastName", "Araki");
        map1.put("address", "333 Skeena St, Vancouver, BC");
        map1.put("YearOfBirth", "1991");
        map1.put("Average", "4");
        array.add(map1);

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("firstName", "Chris");
        map2.put("lastName", "Brown");
        map2.put("address", "333 Homer St, Vancouver, BC");
        map2.put("YearOfBirth", "1988");
        map2.put("Average", "3");
        array.add(map2);

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("firstName", "Tom");
        map3.put("lastName", "Pratt");
        map3.put("address", "333 Denman St, Vancouver, BC");
        map3.put("YearOfBirth", "1980");
        map3.put("Average", "2");
        array.add(map3);

        return array;

    }
}
