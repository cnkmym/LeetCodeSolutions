package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution2 {
	private List<List<Integer>> subsets;
	private Map<String, List<List<Integer>>> buf;

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		subsets = new LinkedList<List<Integer>>();
		buf = new HashMap<String, List<List<Integer>>>();

		if (nums == null) {
			return subsets;
		}
		subsets.add(new ArrayList<Integer>());

		Arrays.sort(nums);

		for (int pos = 0; pos < nums.length; pos++) {
			if (pos > 0 && nums[pos] == nums[pos - 1]) {
				continue;
			}
			for (int length = 1; length < nums.length - pos + 1; length++) {
				subsets.addAll(computeSubsets(nums, pos, length));
			}
		}

		return subsets;
	}

	private List<List<Integer>> computeSubsets(int[] nums, int start, int length) {
		String key = start + "->" + length;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (buf.containsKey(key)) {
			return buf.get(key);
		}

		if (length == 1) {
			List<Integer> sublist = new ArrayList<Integer>();
			sublist.add(nums[start]);
			list.add(sublist);
			buf.put(key, list);
			return list;
		}

		for (int newDigit = start + 1; newDigit <= nums.length - length + 1; newDigit++) {
			if (newDigit > start + 1 && nums[newDigit] == nums[newDigit - 1]) {
				continue;
			}
			List<List<Integer>> subs = computeSubsets(nums, newDigit, length - 1);
			for (List<Integer> sub : subs) {
				List<Integer> newSub = new ArrayList<Integer>();
				newSub.add(nums[start]);
				for (int index = 0; index < sub.size(); index++) {
					newSub.add(sub.get(index));
				}
				list.add(newSub);
			}
		}
		buf.put(key, list);
		return list;
	}
}
