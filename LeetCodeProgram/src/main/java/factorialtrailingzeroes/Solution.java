package factorialtrailingzeroes;

public class Solution {
	public int trailingZeroes(int n) {
		int countFor2 = 0;
		int countFor5 = 0;
		for (int i = 1; i <= n; i++) {
			countFor2 += countFor2(i);
			countFor5 += countFor5(i);
		}
		return Math.min(countFor2, countFor5);
	}

	private int countFor2(int n) {
		int ret = 0;
		while (n > 0 && n % 2 == 0) {
			ret++;
			n = n / 2;
		}
		return ret;
	}

	private int countFor5(int n) {
		int ret = 0;
		while (n > 0 && n % 5 == 0) {
			ret++;
			n = n / 5;
		}
		return ret;
	}
}
