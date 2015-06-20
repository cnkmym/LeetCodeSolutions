package permutationsequence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	private List<Integer> nums;
	private List<Integer> ret;

	public String getPermutation(int n, int k) {
		nums = new ArrayList<Integer>();
		ret = new LinkedList<Integer>();
		int span = 1;
		for (int i = 1; i <= n; i++) {
			nums.add(i);
			span = span * i;
		}

		if (k <= 1) {
			return print(nums);
		}

		k = --k % span;
		for (int i = n; i > 1; i--) {
			span = span / i;
			int index = k / span;
			Integer v = nums.remove(index);
			ret.add(v);
			k = k % span;
		}
		
		ret.add(nums.get(0));

		return print(ret);
		// return String.join("", nums.stream().map(jj ->
		// String.valueOf(jj)).collect(Collectors.toList()));
	}

	private String print(List<Integer> v) {
		StringBuilder sb = new StringBuilder();
		for (Integer i : v) {
			sb.append(i);
		}
		return sb.toString();
	}

}
