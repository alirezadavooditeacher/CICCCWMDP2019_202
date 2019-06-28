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

 public boolean inSameMonth(Holiday frist, Holiday second) {
   if (frist.month == second.month)
     return true;

   return false;
 }

 public double avgDate(ArrayList<Holiday> holidays) {
   double avgDays;
   for (Holiday holiday : holidays) {
     avgDays += holiday.day;
   }
   avgDays = avgDays / holidays.size();
   return 0;

 }

 public static void main(String[] args) {
   String name = "Independence Day";
   int day = 4;
   String month = "July";
   Holiday h1 = new Holiday(name, day, month);
 }
}