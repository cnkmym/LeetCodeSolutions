package houserobber;

import java.util.Arrays;

public class Solution {
	int[] maxValue;

	public int rob(int[] nums) {
		// pay attention to setting the initial value for DP
		if (nums.length == 0){
			return 0;
		}else if (nums.length == 1){
			return nums[0];
		}
		// simple DP
		maxValue = new int[Math.max(2, nums.length)];
		Arrays.fill(maxValue, -1);
		// max benifit to rob house 0
		maxValue[0] = nums[0];
		// max benefit to rob house 0 or 1
		maxValue[1] = Math.max(nums[0], nums[1]);

		return maxBenefitIfRob(nums, nums.length - 1);
	}

	private int maxBenefitIfRob(int[] nums, int pos) {
		// border check
		if (pos < 0) {
			return 0;
		}
		if (maxValue[pos] >= 0) {
			return maxValue[pos];
		}
		// if rob this house
		int solution1 = nums[pos] + maxBenefitIfRob(nums, pos - 2);
		// if not rob this house
		int solution2 = maxBenefitIfRob(nums, pos - 1);
		int benefit = Math.max(solution1, solution2);
		maxValue[pos] = benefit;
		return benefit;
	}
}
