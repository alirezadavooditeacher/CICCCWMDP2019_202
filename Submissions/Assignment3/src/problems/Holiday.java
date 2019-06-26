package problems;

import java.util.ArrayList;

public class Holiday {

    private String name;
    private static int day;
    private String month;

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Holiday(int day, String month, String name){
        super();
        this.day = day;
        this.month = month;
        this.name = name;
    }

    public boolean inSameMonth(Holiday instanceOne, Holiday instanceTwo){
        if (instanceOne.month == instanceTwo.month) {
            return true;
        }
        return false;
    }

    public double avgDate(ArrayList<Holiday> holiday){
        double averaveDate = 0.0;
        for (Holiday holidays : holiday) {
            averaveDate += Holiday.day;
        }
        averaveDate = averaveDate / holiday.size();
        return averaveDate;
    }

    public String toString() {
        return String.format(this.day + "/"+ this.month + " is " + this.name );
    }
}