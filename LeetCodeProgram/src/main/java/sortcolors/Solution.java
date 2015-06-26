package sortcolors;

public class Solution {
	public void sortColors(int[] nums) {
		int posOfFirst0 = Integer.MAX_VALUE;
		int posOfFirst1 = Integer.MAX_VALUE;
		int posOfFirst2 = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				if (posOfFirst0 > i) {
					posOfFirst0 = i;
				}
				if (i > posOfFirst1) {
					swap(nums, i, posOfFirst1);
					posOfFirst0 = Math.min(posOfFirst0, posOfFirst1);
					posOfFirst1++;
					i--;
				} else if (i > posOfFirst2) {
					swap(nums, i, posOfFirst2);
					posOfFirst0 = Math.min(posOfFirst0, posOfFirst2);
					posOfFirst2++;
					i--;
				}
			} else if (nums[i] == 1) {
				if (posOfFirst1 > i) {
					posOfFirst1 = i;
				}
				if (i > posOfFirst2) {
					swap(nums, i, posOfFirst2);
					posOfFirst1 = Math.min(posOfFirst1, posOfFirst2);
					posOfFirst2++;
					i--;
				}
			} else {
				if (posOfFirst2 > i) {
					posOfFirst2 = i;
				}
			}
		}
	}

	private void swap(int[] nums, int left, int right) {
		int tmp = nums[left];
		nums[left] = nums[right];
		nums[right] = tmp;
	}
}
