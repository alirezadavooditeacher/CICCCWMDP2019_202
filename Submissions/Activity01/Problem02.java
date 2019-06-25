package Activity01;

public class Problem02 {

    /**
     * print shape drawn by stars
     *
     * @param count int a number of longest stars
     * @param shapeForm String only accept for 'SHAPE1', 'SHAPE2', 'SHAPE3'
     * @return String shape
     */
    public static String drawer(int count, String shapeForm) {

        String result = "";
        if (shapeForm.equals("SHAPE1")) {
            result = drawer_shape1(count);

        } else if(shapeForm.equals("SHAPE2")) {
            result = drawer_shape2(count);

        } else if(shapeForm.equals("SHAPE3")) {
            result = drawer_shape3(count);

        } else {
            System.out.println("Only SHAPE1 or SHAPE2 or SHAPE3 are available");
            throw new IllegalArgumentException("unknown shape: " + shapeForm);
        }

        System.out.println(result);
        return result;
    }

    /**
     * repeat String by "count" times
     *
     * @param str String this is going to be repeated
     * @param count int how many times repeat
     * @return String repeated String
     */
    private static String repeat(String str, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + str;
        }

        return result;
    }

    /**
     * return like this
     * *****
     *  ***
     *   *
     * @param num int number of the stars of the first line
     * @return String Shaped stars
     */
    private static String drawer_shape1(int num) {

        String stars = repeat("*", num);
        int count = 0;
        String result = "";
        while (num > 0) {
                count++;
                result = result + stars;
                result = result + "\n";
                stars = (repeat(" ", count) + repeat("*", (num - 2)));
                num = num -2;
            }

        return result;
    }

    /**
     * return like this
     * *****
     * ****
     * ***
     * **
     * *
     *
     * @param num int number of the stars of the longest line
     * @return String Shaped stars
     */
    private static String drawer_shape2(int num) {

        String result = "";
        for (int i = num; i > 0; i--) {
            result = result + repeat("*", i);
            result = result + "\n";
        }

        return result;
    }

    /**
     * return like this
     * *
     * **
     * ***
     * ****
     * *****
     *
     * @param num int number of the stars of the longest line
     * @return String Shaped stars
     */
    private static String drawer_shape3(int num) {

        String result = "";
        for (int i = 1; i <= num; i++) {
            result = result + repeat("*", i);
            result = result + "\n";
        }

        return result;
    }
}
