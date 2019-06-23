package problem1;
/***
 * Read a number in base 10 (any positive, real number, like 452), and convert it to binary and 
 * prints the results.
 *
 */
public class Problem1_3 {

	public static String convertToBinary(int number) {
		
		int dev = number;
		String binaryString="";
		if(number==0) {
			binaryString = "0";
		} else {
			while(dev>0)
			{
				int rem = dev % 2;
				dev = dev / 2;
				binaryString = String.valueOf(rem) + binaryString;
			}
		}

		return binaryString;
	}
}
