package Assignment3;

import java.util.ArrayList;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday one, Holiday two) {
        if (one.month == two.month)
            return true;
        return false;
    }

    @Override
    public String toString() {
        if (this.day == 1 || this.day == 21 || this.day == 31)
            return String.format("The " + this.name + " is " + this.day + "st of " + this.month);
        else if (this.day == 2 || this.day == 22)
            return String.format("The " + this.name + " is " + this.day + "nd of " + this.month);
        else if (this.day == 3)
            return String.format("The " + this.name + " is " + this.day + "rd of " + this.month);
        else;
            return String.format("The " + this.name + " is " + this.day + "th of " + this.month);
    }

    public double avgDate(ArrayList<Holiday> holidays) {
        double average = 0;
        for (Holiday holiday : holidays) {
            average += holiday.day;
        }

        average = average / holidays.size();
        return average;
    }

}

