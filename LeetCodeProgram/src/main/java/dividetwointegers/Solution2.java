package dividetwointegers;

public class Solution2 {
	public int divide(int dividend, int divisor) {
		if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
			return Integer.MAX_VALUE;
		} else if (divisor == 1) {
			return dividend;
		}

		boolean isPossitive = (dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0);

		long dvd = Math.abs((long) dividend);
		long dvr = Math.abs((long) divisor);

		if (dvd < dvr) {
			return 0;
		} else if (dvd == dvr) {
			return (isPossitive) ? 1 : -1;
		}
		int quotient = 0;

		while (dvd >= dvr) {
			// try to find max quotient
			long product = dvr;
			int multiplier = 1;
			while (dvd >= product) {
				product = product << 1;
				multiplier = multiplier << 1;
			}
			dvd -= product >> 1;
			quotient += multiplier >>> 1;
		}

		return (isPossitive) ? quotient : 0 - quotient;
	}
}
