package wmadp201_assginment4_group.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Util {
    public static String getRandom8DigitAsString() {
        Random random = new Random();
        int randomValue = random.nextInt(100000000);
        return String.format("%08d", randomValue);
    }

    public static String getTitleForName(char gender) {
        if (Character.toString(gender).equals("M")) {
            return "Mr. ";
        } else if (Character.toString(gender).equals("F")) {
            return "Mrs. ";
        } else {
            return "";
        }
    }

    public static String getGenderPronoun(char gender) {
        if (Character.toString(gender).equals("M")) {
            return "He";
        } else if (Character.toString(gender).equals("F")) {
            return "She";
        } else {
            return "They";
        }
    }

    public static String getRegularGenderName(char gender) {
        if (Character.toString(gender).equals("M")) {
            return "Male";
        } else if (Character.toString(gender).equals("F")) {
            return "Female";
        } else {
            return "Other Gender";
        }
    }

    public static int getDifferenceBetween2Date(String yearMonth1, String yearMonth2) {
        Date from = new Date();
        Date to = new Date();
        try {
            SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            from = sdFormat.parse(yearMonth1 + "/01 00:00:00");
            to = sdFormat.parse(yearMonth2 + "/01 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calFrom = Calendar.getInstance();
        calFrom.setTime(from);

        Calendar calTo = Calendar.getInstance();
        calTo.setTime(to);

        int count = 0;
        while (calFrom.before(calTo)) {
            calFrom.add(Calendar.MONTH, 1);
            count++;
        }

        return count;
    }
}
