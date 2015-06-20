package sqrt;

public class Solution {
	public int mySqrt(int x) {
		if (x == 0) {
			return x;
		} else if (x < 4) {
			return 1;
		} else if (x == 4) {
			return 2;
		}

		int sqrtV = 2;
		int previous = 2;
		long product = 4;
		while (product < x) {
			previous = sqrtV;
			sqrtV = sqrtV * sqrtV;
			product = product * product;
		}
		return findSqrt(previous, sqrtV, x);
	}

	private int findSqrt(int from, int to, int product) {
		if (from == to) {
			return from;
		} else if (from + 3 > to) {
			for (int i = from; i <= to; i++) {
				if ((long) i * i > product) {
					return i - 1;
				}
			}
			return to;
		} else {
			int middle = (from + to) / 2;
			long value = (long) middle * middle;
			if (value == product) {
				return middle;
			} else if (value > product) {
				return findSqrt(from, middle - 1, product);
			} else {
				return findSqrt(middle, to, product);
			}
		}
	}
}
