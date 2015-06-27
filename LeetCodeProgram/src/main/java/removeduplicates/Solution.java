package removeduplicates;

import java.util.Arrays;

public class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		Arrays.sort(nums);

		int count = 1;
		int previous = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int tmp = nums[count - 1];
			if (nums[i] != previous) {
				swap(nums, count++, i);
			} else if (count == 1 || nums[count - 2] != previous) {
				swap(nums, count++, i);
			}
			previous = tmp;
		}

		return count;
	}

	private void swap(int[] nums, int left, int right) {
		int tmp = nums[left];
		nums[left] = nums[right];
		nums[right] = tmp;
	}
}
