/**
 *
 */
package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * @author miyamotoatsushi
 * implement each class
 */
public class ApplicationDriver {

    /**
     * implement each function
     */
    public static void main(String[] args) {
//        problem0();
//        problem1();
//        problem2();
//        problem3();
//        problem4();
//        problem5();
        problem6();
    }

    /**
     * print number which is repeated the most in the list
     */
    public static void problem0() {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(3);
        numberList.add(5);
        numberList.add(3);
        numberList.add(3);
        numberList.add(5);
        numberList.add(3);
        numberList.add(4);

        System.out.println(Problem0.ReturnRepeatNumber(numberList));
    }

    /**
     * print repeated number and how many times repeated
     */
    public static void problem1() {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(3);
        numberList.add(123);
        numberList.add(123);
        numberList.add(3);
        numberList.add(5);
        numberList.add(3);
        numberList.add(4);

        Problem1.ReturnRepeatNumber(numberList);
    }

    /**
     * print distinct number
     */
    public static void problem2() {
        List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(3);
        numberList.add(123);
        numberList.add(3);
        numberList.add(5);
        numberList.add(3);
        numberList.add(4);

        System.out.println(Problem2.checkDistinctNumber(numberList));
    }

    /**
     * print repeated number which is repeated only once
     */
    public static void problem3() {
        List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(3);
        numberList.add(123);
        numberList.add(123);
        numberList.add(123);
        numberList.add(3);
        numberList.add(5);
        numberList.add(3);
        numberList.add(5);
        numberList.add(1);
        numberList.add(1);


        System.out.println(Problem3.returnDistinctNumber(numberList));
    }

    /**
     * print high avarage student info
     */
    public static void problem4() {
        HashMap<String, List<String>> studentrDict = new HashMap<String, List<String>>();
        List<String>firstNameList = new ArrayList<String>();
        firstNameList.add("Alan");
        firstNameList.add("Atsushi");
        firstNameList.add("jeny");

        List<String>lastNameList = new ArrayList<String>();
        lastNameList.add("Kona");
        lastNameList.add("Miyamoto");
        lastNameList.add("Born");

        List<String>addressList = new ArrayList<String>();
        addressList.add("aaa@");
        addressList.add("bbb@");
        addressList.add("ccc@");

        List<String>birthList = new ArrayList<String>();
        birthList.add("19940304");
        birthList.add("19940407");
        birthList.add("19940505");

        List<String>avarageList = new ArrayList<String>();
        avarageList.add("80");
        avarageList.add("100");
        avarageList.add("10");

        studentrDict.put("firstName", firstNameList);
        studentrDict.put("lastName", lastNameList);
        studentrDict.put("address", addressList);
        studentrDict.put("birth", birthList);
        studentrDict.put("avarage", avarageList);

        System.out.println(Problem4.returnHighAvarageStudent(studentrDict));
    }

    /**
     *  print dictionary which shows all the name the user has entered and how many times each name is repeated
     */
    public static void problem5() {
        System.out.println(Problem5.returnName());
    }

    /**
     * print sum of enter number
     */
    public static void problem6() {
        System.out.println(Problem6.returnSumNumber());
    }


}
