public class Problem2 {
    // Problem2
    /**
     * Detect shape
     *
     * @param number    input is 5
     * @param shapeName shape name
     */
    public void detectShape(int number, String shapeName) {
        if (number == 5) {
            switch (shapeName) {
                case "SHAPE1":
                    System.out.println("*****");
                    System.out.println(" *** ");
                    System.out.println("  *   ");
                    break;
                case "SHAPE2":
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case "SHAPE3":
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    break;
                default:
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Problem2 p2 = new Problem2();

        // Test Problem2
        p2.detectShape(5, "SHAPE1");
        p2.detectShape(5, "SHAPE2");
        p2.detectShape(5, "SHAPE3");

    }
}

