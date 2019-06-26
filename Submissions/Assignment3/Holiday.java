package assigments.Assigment3;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }


    public boolean inSameMonth( Holiday holidayOne, Holiday holidayTwo) {
        if (holidayOne.month == holidayTwo.month) {
            return true;
        } else {
            return false;
        }
    }

    public double avgDate(ArrayList<Holiday>holidays){
        double avarageDay = 0;

        for(Holiday item : holidays){
            avarageDay += item.day; // averageDay = avarageDay + intem.day


        }
        avarageDay = avarageDay / holidays.size();
        return avarageDay;
    }

    public static void main(String[] args) {
        Holiday independanceDay = new Holiday("Independance Day", 4, "July" );

        System.out.println(independanceDay.name +" "+ independanceDay.day +" "+ independanceDay.month);

    }



}
