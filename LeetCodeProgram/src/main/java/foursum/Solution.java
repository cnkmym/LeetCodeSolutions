package foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	private List<List<Integer>> ret;

	public List<List<Integer>> fourSum(int[] nums, int target) {
		ret = new LinkedList<List<Integer>>();
		// extreme condition check
		if (nums == null || nums.length < 4) {
			return ret;
		}
		// first of all, sort the array
		Arrays.sort(nums);

		int sum = Integer.MIN_VALUE;
		// then start the algorithm
		for (int i = 0; i < nums.length - 3; i++) {
			// remove duplicated
			while (i < nums.length - 3 && (i > 0 && nums[i] == nums[i - 1])) {
				i++;
			}
			// first, fix the first choice
			int n1 = nums[i];
			for (int j = i + 1; j < nums.length - 2; j++) {
				// remove duplicated
				while (j < nums.length - 2 && (j > i + 1 && nums[j] == nums[j - 1])) {
					j++;
				}
				// then fix the second choice
				int n2 = nums[j];
				int left = j + 1;
				int right = nums.length - 1;
				while (left < right) {
					// remove duplicated
					while (left < right && (left > j + 1 && nums[left] == nums[left - 1])) {
						left++;
					}
					while (left < right && (right < nums.length - 1 && nums[right] == nums[right + 1])) {
						right--;
					}
					if (left == right) {
						continue;
					}
					// start compare
					sum = n1 + n2 + nums[left] + nums[right];
					if (sum == target) {
						List<Integer> find = new ArrayList<Integer>(4);
						find.add(n1);
						find.add(n2);
						find.add(nums[left]);
						find.add(nums[right]);
						ret.add(find);
						left++;
						right--;
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}

		return ret;
	}
}
