package problem3;

public class Problem3 {

	public static String reverse(String word) {
		
		String reversed = "";
		
		for(int i=word.length()-1; i>=0; i--) {
			reversed = reversed + String.valueOf(word.charAt(i)); 
		}
		return reversed;
	}
	
	public static boolean isStringAndReversedTheSame(String word, String reversed) {
	
		if(word.equals(reversed)) {
			return true;
		}
		return false;
	}
}
