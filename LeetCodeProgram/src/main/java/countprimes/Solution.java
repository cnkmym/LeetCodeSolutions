package countprimes;

import java.util.Arrays;

public class Solution {
	public int countPrimes(int n) {
		if (n <= 1) {
			return 0;
		}

		boolean[] isAccessed = new boolean[n];
		Arrays.fill(isAccessed, true);
		isAccessed[0] = false;
		isAccessed[1] = false;
		for (int i = 2; i < n; i++) {
			if (isAccessed[i] == false) {
				continue;
			}
			int k = i;
			while (k < n) {
				isAccessed[k] = false;
				k += i;
			}
			isAccessed[i] = true;
		}

		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isAccessed[i]) {
				count++;
			}
		}
		return count;
	}
}
