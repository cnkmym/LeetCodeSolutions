package searchinsertposition;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		return binarySearch(nums, target, 0, nums.length - 1);
	}

	private int binarySearch(int[] nums, int target, int from, int to) {
		if (to - from < 3) {
			int i = from;
			while (i <= to && nums[i] < target) {
				i++;
			}
			return i;
		} else {
			int pos = (to + from + 1) / 2;
			if (nums[pos] > target) {
				return binarySearch(nums, target, from, pos - 1);
			} else if (nums[pos] < target) {
				return binarySearch(nums, target, pos + 1, to);
			} else {
				return pos;
			}
		}
	}
}
