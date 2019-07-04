package assignment3;

public class Holiday {
    private String name; //read-only
    private int day; //read-only
    public String month; //read-only

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
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

        public static boolean inSameMonth(Holiday hol1, Holiday hol2) {
            return hol1.getMonth().equals(hol2.getMonth());
        }

        public static double avgDate(Holiday[] holidays) {
            int avgtotal = 0;
            for (Holiday holiday: holidays){
                avgtotal += holiday.getDay();
            }
            return (double)avgtotal / holidays.length;
        }
}
