package sets;

import java.util.HashSet;

/**
 * A password is valid if there is no repeated character in the password.
 * Write a java program which tells you whether a given password is valid or not.
 * 
 * Example: MyPassword123: invalid
 * Example: Abcde: valid
 * Example: Aadf: valid
 */
public class SetExample2 {

	private int numberOfUniqueCharsInPassword(String password) {
		
		HashSet<Character> chars = new HashSet<Character>();
		
		for (char c: password.toCharArray()) {
			chars.add(c);
		}
//		for (int i=0; i<password.length(); i++) {
//			char c = password.charAt(i);
//			chars.add(c);
//		}
		
		return chars.size();
	}
	
	public boolean isPasswordValid(String password) {
		
		int numberOfUniqueChars = this.numberOfUniqueCharsInPassword(password);
		
		if(numberOfUniqueChars == password.length()) {
			return true;
		} else {
			return false;
		}
	}
}
