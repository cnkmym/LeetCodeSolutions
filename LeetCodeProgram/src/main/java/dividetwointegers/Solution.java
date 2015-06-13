package dividetwointegers;

public class Solution {
	private final int MIN_VALUE = -2147483648;
	private final int MAX_VALUE = 2147483647;

	public int divide(int dividend, int divisor) {
		if (divisor == 0) {
			return MAX_VALUE;
			// throw new IllegalArgumentException();
		}
		if (dividend == 0 || divisor == 1) {
			return dividend;
		}
		if (divisor == -1) {
			if (dividend > MIN_VALUE) {
				return 0 - dividend;
			} else {
				return MAX_VALUE;
			}
		}

		if (divisor == MIN_VALUE) {
			return (dividend > MIN_VALUE) ? 0 : 1;
		}

		boolean isPossitive = (dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0);
		dividend = (dividend < 0) ? 0 - dividend : dividend;
		divisor = (divisor < 0) ? 0 - divisor : divisor;

		char[] digits = Integer.toString(dividend).toCharArray();

		int quotient = 0;
		int remain = 0;
		int index = -1;
		int lastIndex = -1;
		while (index < digits.length - 1) {
			while (index < digits.length - 1 && remain < divisor) {
				remain = remain * 10 + (digits[++index] - '0');
			}
			int i = 0;
			while (remain >= divisor) {
				i++;
				remain = remain - divisor;
			}
			for (int k = lastIndex; k < index; k++) {
				quotient = quotient * 10;
			}
			quotient += i;
			lastIndex = index;
		}

		return (isPossitive) ? quotient : 0 - quotient;
	}
}
