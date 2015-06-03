package numberof1bits;

public class Solution {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int result = n;
		int count = 0;
		//pay much attention to the unsigned int range issue (first digit is no longer treated as sign)
		while (result != 0) {
			// every time
			// check if last digit is 1
			int lastDigit = (result & 1);
			if (lastDigit > 0) {
				count++;
			}
			// do bit shift for the variable
			result = result >>> 1;
		}
		return count;
	}
}
