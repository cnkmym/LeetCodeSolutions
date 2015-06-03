package containsduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean containsDuplicate2(int[] nums) {
		// simple solution : use hashset to check duplicate

		if (nums == null || nums.length == 0) {
			return false;
		}

		Set<Integer> visited = new HashSet<Integer>();
		for (int num : nums) {
			if (visited.contains(num)) {
				return true;
			}
			visited.add(num);
		}
		return false;
	}

	public boolean containsDuplicate(int[] nums) {
		// simple solution : first sort then check
		if (nums == null || nums.length == 0) {
			return false;
		}

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}
}
