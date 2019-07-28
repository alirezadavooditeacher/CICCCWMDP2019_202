public class ApplicationDriver {
    public static void main(String[] args) {
        System.out.println( "-------- problem 0 --------" );
        Object product1 = new Product( 110, "Diet Pepsi", (float) 2, "USA" );
        System.out.println( product1 );

        System.out.println( "\n-------- problem 1 Drink --------" );
        Object drink1 = new Drink( 412, "Pepsi", (float) 2, "USA", false , 150 );
        System.out.println( drink1 );

        System.out.println( "\n-------- problem 1 Food --------" );
        Object food1 = new Food( 100, "Chicken", (float)8, "Canada", 350, (int) 4l, new String[]{"chicken", "oil", "chees"} );
        System.out.println( food1 );

        System.out.println( "\n-------- problem 1 Cloth --------" );
        Object cloth1 = new Cloth( 701, "T-shirt", (float) 15, "China", new String[]{"cotton (code: 10)", "Nylon (code: 11)"} );
        System.out.println( cloth1 );

        System.out.println( "\n-------- problem 1 Material --------" );
        Material material1 = new Material( 10, "Cotton");
        System.out.println( material1 );

    }
}
