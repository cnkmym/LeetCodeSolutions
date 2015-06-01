package rotatearray;

public class Solution {
	// method1
	// public void rotate(int[] nums, int k) {
	// if (nums.length == 0) {
	// return;
	// }
	// // use totally new array for index manipulation
	// int[] tmp = new int[nums.length];
	// for (int i = 0; i < nums.length; i++) {
	// int newIndex = (k + i) % nums.length;
	// tmp[newIndex] = nums[i];
	// }
	// for (int i = 0; i < nums.length; i++) {
	// nums[i] = tmp[i];
	// }
	// }

	// method2
	// public void rotate(int[] nums, int k) {
	// if (nums.length == 0) {
	// return;
	// }
	// // use only k extra space for index manipulation
	// k = k % nums.length;
	// int[] tmp = new int[k];
	// // this solution must check last digit first
	// for (int i = nums.length - 1; i >= 0; i--) {
	// int newIndex = k + i;
	// if (newIndex >= nums.length) {
	// newIndex = newIndex - nums.length;
	// tmp[newIndex] = nums[i];
	// } else {
	// nums[newIndex] = nums[i];
	// }
	// }
	// for (int i = 0; i < k; i++) {
	// nums[i] = tmp[i];
	// }
	// }

	// method 3
	public void rotate(int[] nums, int k) {
		if (nums.length == 0) {
			return;
		}
		int previous = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			// O(1) extra space?
		}
	}
}
