package nonnestedversion;

class EvenIterator implements DataStructureIterator{
	// Start stepping through the array from the beginning
    private int nextIndex = 0;
    private int[] arrayOfInts;
    
    EvenIterator (int[] arrayOfInts) {
    	this.arrayOfInts = arrayOfInts;
    }
    
    public boolean hasNext() {
        
        // Check if the current element is the last in the array
        return (nextIndex <= this.arrayOfInts.length - 1);
    }        
    
    public Integer next() {
        
        // Record a value of an even index of the array
        Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
        
        // Get the next even element
        nextIndex += 2;
        return retValue;
    }
}
