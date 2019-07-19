package app;

public class Exchange {
    public static <T> void exchangeElements(T[] elements) {
    	
    	
    	
    	// fro simplicity it was assume that we only have two element in a list
        T temporaryElement = elements[0];
        elements[0] = elements[1];
        elements[1] = temporaryElement;
    }
}
