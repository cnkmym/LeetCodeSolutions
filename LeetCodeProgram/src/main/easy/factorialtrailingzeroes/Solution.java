package factorialtrailingzeroes;

public class Solution {
	public int trailingZeroes(int n) {
		// n! = (1) * (2) * ... (n)
		// only concern the number of '5' -> (5*1) * (5*2) *(5*3) * ...*(5*n/5)
		// = (5^(n/5))* (1*2*3*...*n/5) = 5 * (n/5)!
		//

		int count = n / 5;
		n = n / 5;
		if (n >= 5) {
			count += trailingZeroes(n);
		}
		return count;
	}

}
