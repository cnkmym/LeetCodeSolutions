package happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean isHappy(int n) {
		Set<Integer> visited = new HashSet<Integer>();
		if (n == 0) {
			return false;
		}

		while (n > 1 && !visited.contains(n)) {
			visited.add(n);
			n = next(n);
		}

		return n == 1;
	}

	private int next(int n) {
		int ret = 0;
		while (n > 0) {
			ret += (n % 10) * (n % 10);
			n = n / 10;
		}
		return ret;
	}
}
