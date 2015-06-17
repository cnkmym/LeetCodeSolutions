package jumpgame;


public class Solution {

	public boolean canJump(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}

		if (nums.length == 1) {
			return true;
		}

		int remainSteps = nums[0];
		int pos = 0;
		while (remainSteps > 0) {
			pos++;
			remainSteps = Math.max(nums[pos], remainSteps - 1);
			if (pos + remainSteps >= nums.length - 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 private boolean[] canReach;
	 * 
	 * public boolean canJump(int[] nums) { if (nums == null || nums.length ==
	 * 0) { return false; }
	 * 
	 * canReach = new boolean[nums.length]; canReach[nums.length - 1] = true;
	 * return canReachFinal(nums, 0); }
	 * 
	 * private boolean canReachFinal(int[] nums, int pos) { if (canReach[pos]) {
	 * return true; } if (nums[pos] + pos >= nums.length - 1) { canReach[pos] =
	 * true; return true; } for (int i = 1; i <= nums[pos]; i++) { int step =
	 * nums[i]; if (step == 0) { continue; } if (canReachFinal(nums, pos + i)) {
	 * return true; } } return false; }
	 */
}
