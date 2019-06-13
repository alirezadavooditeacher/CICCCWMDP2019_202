package problem5;

public class Problem5 {

	private static final char OPEN_PARANTHESIS = '(';   //final means constant
	private static final char CLOSE_PARANTHESIS = ')';  
	
	public static boolean isValidArthitmaticStatement(String statement) {
		
		return Problem5.isValidBasedOnRule1(statement) && Problem5.isValidBasedOnRule2(statement);
	}
	
	/**
	 * Rule1: # ( = # )
	 * @param statement
	 * @return
	 */
	private static boolean isValidBasedOnRule1(String statement) {
		
		int openPCounter = 0;
		int clasedPCounter = 0;
		
		for(int i=0; i<statement.length(); i++) {
			if(statement.charAt(i)==OPEN_PARANTHESIS) {
				openPCounter++;
			} else if(statement.charAt(i)==CLOSE_PARANTHESIS) {
				clasedPCounter++;
			}
		}
		
		if(openPCounter==clasedPCounter) {
			return true;
		}
		return false;
	}
	
	private static boolean isValidBasedOnRule2(String statement) {
		
		int openPCounter = 0;
		int clasedPCounter = 0;
		
		for(int i=0; i<statement.length(); i++) {
			if(statement.charAt(i)==OPEN_PARANTHESIS) {
				openPCounter++;
			} else if(statement.charAt(i)==CLOSE_PARANTHESIS) {
				clasedPCounter++;
			}
			
			if(openPCounter<clasedPCounter) {
				return false;
			}
		}
		
		return true;
	}
}
