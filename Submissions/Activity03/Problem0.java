package Activity03;

import java.util.ArrayList;

public class Problem0 {

    public boolean inSameMonth(Holiday h1, Holiday h2) {
        return h1.getMonth().equals(h2.getMonth());
    }

    public double avgDate(ArrayList<Holiday> holidays) {
        double total = 0;
        for (Holiday holiday: holidays) {
            total += holiday.getDay();
        }

        return total / holidays.size();
    }

    public Holiday getIndependenceDay() {
        return new Holiday("Independence Day", 4, "July");
    }

}
