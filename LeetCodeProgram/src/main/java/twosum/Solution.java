package twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		// solution 1 : use scan and search O(n^2)
		// solution 2 : use HashTable to decrease time complexity to O(n)
		if (nums == null || nums.length == 0) {
			return null;
		}
		Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
		int[] ret = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int exp = target - num;
			if (visited.containsKey(exp)) {
				ret[0] = visited.get(exp) + 1;
				ret[1] = i + 1;
				return ret;
			} else {
				visited.put(num, i);
			}
		}
		return null;
	}
}
