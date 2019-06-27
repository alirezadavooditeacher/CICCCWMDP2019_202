package problem0;

import java.util.*;

public class Holiday {
    private String name; //read only
    private int day;     //read only
    private String month;//read only

    public static void main(String[] args) {

        Holiday day1 = new Holiday("Independence Day", 4, "July");
        Holiday day2 = new Holiday("Canada Day", 1, "July");
        Holiday day3 = new Holiday("Thanksgiving Day", 14, "October");

        //test1
        System.out.println("Should be True, result: " + isSameMonth(day1, day2));
        //test2
        System.out.println("should be 6.3, result: " + avgDate(holidayList));


    }


    //constructor
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
        holidayList.add(this);
    }


    //getter
    public String getName() {

        return name;
    }

    public int getDay() {

        return day;
    }

    public String getMonth() {
        return month;
    }


    //method1
    public static boolean isSameMonth(Holiday day1, Holiday day2) {
        String month1 = day1.getMonth();
        String month2 = day2.getMonth();

        if (month1 == month2) {
            return true;
        } else {
            return false;
        }
    }

    //method2
    static ArrayList<Holiday> holidayList = new ArrayList<>();

    public static double avgDate(ArrayList<Holiday> holidayList) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < holidayList.size(); i++) {
            int theDayOfHoliday = holidayList.get(i).getDay();
            sum = sum + theDayOfHoliday;
            count++;
        }
        System.out.println(sum);
        double result = 1.0 * sum / count;
        return result;
    }


}
