package nonnestedversion;

class DataStructure {
	// Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    void printEven() {
        
        // Print out values of even indices of the array
        DataStructureIterator iterator = new EvenIterator(this.arrayOfInts);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
 
    public static void main(String s[]) {
        
    	System.out.print("Non-Nested Version");
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
