public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public static boolean inSameMonth(Holiday h1, Holiday h2) {
        if (h1.month.equals(h2.month)) {
            return true;
        }

        return false;
    }

    public static double avgDate(Holiday[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].day;
        }
        return sum / array.length;
    }

    public static Holiday createHoliday() {
        return new Holiday("Independence Day", 4, "July");
    }

    public static void main(String[] args) {
        Holiday h1 = Holiday.createHoliday();
        Holiday h2 = Holiday.createHoliday();
        System.out.println(Holiday.inSameMonth(h1, h2));

        Holiday[] array = new Holiday[2];
        array[0] = h1;
        array[1] = h2;
        System.out.println(Holiday.avgDate(array ));
    }

}
