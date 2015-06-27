package subsets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	private List<List<Integer>> ret;
	private Map<String, List<List<Integer>>> subsets;

	public List<List<Integer>> subsets(int[] nums) {
		subsets = new HashMap<String, List<List<Integer>>>();
		ret = new LinkedList<List<Integer>>();
		if (nums == null) {
			return ret;
		}
		
		Arrays.sort(nums);

		for (int length = 1; length <= nums.length; length++) {
			for (int startPos = 0; startPos < nums.length - length + 1; startPos++) {
				String key = startPos + "->" + length;
				if (subsets.containsKey(key)) {
					continue;
				}
				subsets.put(key, findSubsetsOfFixedLength(nums, startPos, length));
			}
		}

		ret.add(new LinkedList<Integer>());

		sum();

		return ret;
	}

	private void sum() {
		for (Map.Entry<String, List<List<Integer>>> entry : subsets.entrySet()) {
			ret.addAll(entry.getValue());
		}
		return;
	}

	private List<List<Integer>> findSubsetsOfFixedLength(int[] nums, int from, int length) {
		String key = from + "->" + length;
		if (subsets.containsKey(key)) {
			return subsets.get(key);
		}
		List<List<Integer>> ret = new LinkedList<List<Integer>>();
		if (length == 1) {
			//for (int i = from; i < nums.length; i++) {
				List<Integer> list = new LinkedList<Integer>();
				list.add(nums[from]);
				ret.add(list);
			//}
		} else {
			int subLength = length - 1;
			int rangeStart = from + 1;
			int rangeEnd = nums.length - subLength;
			for (int i = rangeStart; i <= rangeEnd; i++) {
				List<List<Integer>> values = findSubsetsOfFixedLength(nums, i, subLength);
				for (List<Integer> list : values) {
					List<Integer> newList = new LinkedList<Integer>();
					newList.add(0, nums[from]);
					for (Integer v : list) {
						newList.add(v);
					}
					ret.add(newList);
				}
			}
		}
		subsets.put(key, ret);
		return ret;
	}
}
