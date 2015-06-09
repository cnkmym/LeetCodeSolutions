package threesumclosest;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		// first sort the array
		Arrays.sort(nums);

		int minDivergence = Integer.MAX_VALUE;
		int sum = Integer.MIN_VALUE;
		// then start the algorithm
		for (int i = 0; i < nums.length; i++) {
			// fix the first variable
			int num = nums[i];
			// then, traverse the remains
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				// remove duplicated value
				while (left < right && (left > i + 1 && nums[left] == nums[left - 1])) {
					left++;
				}
				while (left < right && (right < nums.length - 1 && nums[right] == nums[right + 1])) {
					right--;
				}
				
				if (left == right){
					break;
				}

				// then compare
				int newSum = num + nums[left] + nums[right];
				int divergence = Math.abs(newSum - target);
				if (divergence < minDivergence) {
					minDivergence = divergence;
					sum = newSum;
				}
				if (newSum < target) {
					left++;
				} else {
					right--;
				}
			}
		}

		return sum;
	}
}
