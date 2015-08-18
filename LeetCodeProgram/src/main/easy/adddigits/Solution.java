package adddigits;

public class Solution {
	public int addDigits(int num) {
		if (num < 10) {
			return num;
		}
		char[] s = String.valueOf(num).toCharArray();
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum += s[i] - '0';
			if (sum >= 10) {
				sum = 1 + (sum % 10);
			}
		}
		return sum;
	}
}
