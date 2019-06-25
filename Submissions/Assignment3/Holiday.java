package assignment3;

import java.util.*;

/**
 * The Java class called Holidayis started below. An object of class Holidayrepresentsa holiday during the year.
 * This class has three instance variables:
 * - name,which is a String representing the nameoftheholiday
 * - day,which is an int representing the day of the month of the holiday
 * - month, which is a String representing the month the holiday is in
 *
 * HolidayisというJavaクラスが以下から始まりました。 このクラスのオブジェクトは、その年の休暇を表します。
 *
 * このクラスには3つのインスタンス変数があります。
 *  - nameは、休日の名前を表すStringです。
 *  - day、休日の月の日を表すint値
 *  - 月は、休日の月を表す文字列です。
 *
 *  public class Holiday {
 *   private String name;
 *   private int day;
 *   private String month;
 *
 *   // your code goes here
 *  }
 *
 * - Write a constructor for the class Holiday, which takes a String representing the name,
 *   an int representing the day, and a String representing the month as its arguments,
 *   and sets the class variables to these values.
 *
 * - 名前を表すString、日を表すint、月を表すStringを引数として取り、
 *   クラス変数をこれらの値に設定するHolidayクラスのコンストラクタを作成します。
 *
 * - Write a method inSameMonth, which compares two instances of the class Holiday, and returns
 *   the Boolean value true if they have the same month, and false if they do not.
 *
 * - inSameMonthメソッドを作成します。このメソッドはHolidayクラスの2つのインスタンスを比較し、
 *   同じ月がある場合はブール値trueを返し、一致しない場合はfalseを返します。
 *
 * - Write a method avgDate which takes an array of base type Holiday as its argument,
 *   and returns a double that is the average of the day variables in the Holiday instances in
 *   the array.Youmayassumethatthearrayisfull(i.e.doesnothaveanynull entries).
 *
 * - 引数として基本型Holidayの配列を取り、配列内のHolidayインスタンスの
 *   日の変数の平均であるdoubleを返すメソッドavgDateを記述します。
 *
 * - Write a piece of code that creates a Holiday instance with the name “Independence Day”,
 *   with the day “4”, and with the month “July”.
 *
 * - "Independence Day"という名前、 "4"という日、および
 *   "7月"という月を持つHolidayインスタンスを作成するコードを作成します。
 *
 *
 */


public class Holiday {

    private String name;
    private int day;
    private String month;

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }


    // receive list for avgDate
    static class AvgList {
        private List<Integer> lst;

        public AvgList(){
            this.lst = new ArrayList<Integer>();
        }
        public List<Integer> getList(){
            return new ArrayList<Integer>(lst);
        }
        public void setList(List<Integer> lst){
            this.lst = lst;
        }
    }

    public static double avgDate(List<Integer> allDays) {
        double avgday = 0.0;
        for (int i = 0; i < allDays.size(); i++)
            avgday = avgday + allDays.get(i);

        avgday = avgday / (allDays.size());

        return avgday;
    }


    public Holiday(String name, int day, String month) {
        super();
        this.name = name;
        this.day = day;
        this.month = month;
    }


    // receive list for inSameMonth
    static class MonthList {
        private List<String> lst;

        public MonthList(){
            this.lst = new ArrayList<String>();
        }
        public List<String> getList(){
            return new ArrayList<String>(lst);
        }
        public void setList(List<String> lst){
            this.lst = lst;
        }
    }

     public static boolean inSameMonth(List<String> month) {
         for (int i = 0; i < month.size(); i++) {
             for (int j = 1; j < month.size(); j++) {
                 if (month.get(i) == month.get(j)) {
                     return true;
                 }
             }
         }
         return false;
     }


    public static void main(String[] args) {
        Holiday h1 = new Holiday("Canada Day", 1, "July");
        Holiday h2 = new Holiday("Independence Day", 4, "July");
        Holiday h3 = new Holiday("Berth Day", 11, "Octorver");

        AvgList avg = new AvgList();
        List<Integer> l = avg.getList();
        l.add(h1.getDay());
        l.add(h2.getDay());
        l.add(h3.getDay());
        System.out.print("Average of the days: ");
        System.out.println(avgDate((List<Integer>) l));

        MonthList month = new MonthList();
        List<String> l2 = month.getList();
        l2.add(h1.getMonth());
        l2.add(h2.getMonth());
        l2.add(h3.getMonth());
        System.out.print("Are there same month in those holiday?  ");
        System.out.println(inSameMonth((List<String>) l2));
    }


}
