public class Problem10 {
    // Problem10
    /**
     * Convert Interger To Binary
     *
     * @param number
     */
    public void convertIntergerToBinary(int number) {
        String binary = "";
        while (number > 0) {
            int a = number % 2;
            binary = a + binary;
            number = number / 2;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        Problem10 p10 = new p10();

        // Test Problem10
        p10.convertIntergerToBinary(19);

    }
}
