package combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		if (k > n) {
			return ret;
		}
		if (k == 1) {
			for (int i = 1; i <= n; i++) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				ret.add(list);
			}
			return ret;
		}

		for (int i = k - 1; i < n; i++) {
			// first fix pos i
			int fixed = i + 1;
			// then check value recursively
			List<List<Integer>> value = combine(i, k - 1);
			for (List<Integer> list : value) {
				list.add(fixed);
			}
			ret.addAll(value);
		}

		return ret;
	}
}
