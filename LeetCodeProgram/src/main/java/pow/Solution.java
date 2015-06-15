package pow;

public class Solution {
	public double myPow(double x, int n) {
		if (x == 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else if (n == 1) {
			return x;
		} else if (n == -1) {
			return 1 / x;
		}

		if (n > 0) {
			return possitivePow(x, n);
		} else {
			return 1 / possitivePow(x, 0 - n);
		}
	}

	private double possitivePow(double x, int n) {
		if (x == 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else if (n == 1) {
			return x;
		} else if (n == -1) {
			return 1 / x;
		}

		if (n % 2 == 1) {
			double result = possitivePow(x, n / 2);
			return result * result * x;
		} else {
			double result = possitivePow(x, n / 2);
			return result * result;
		}
	}
}
