public class Holiday {
    private String name;
    private int day;
    private String month;

    public static boolean inSameMonth(Holiday holidayA, Holiday holidayB) {
        return holidayA.getMonth().equals(holidayB.getMonth());
    }

    public static double avgDate(Holiday[] holidays) {
        int total = 0;
        for (Holiday holiday : holidays) {
            total += holiday.getDay();
        }
        return (double)total / holidays.length;
    }

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
