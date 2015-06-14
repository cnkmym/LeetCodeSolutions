package searchforarange;

public class Solution {
	public int[] searchRange(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return new int[] { -1, -1 };
		}
		int first = binarySearch(nums, target, 0, nums.length - 1, true);
		int last = (first >= 0) ? binarySearch(nums, target, 0, nums.length - 1, false) : -1;
		return new int[] { first, last };
	}

	private int binarySearch(int[] nums, int target, int from, int to, boolean findFirst) {
		if (to - from < 3) {
			if (findFirst) {
				for (int i = from; i <= to; i++) {
					if (nums[i] == target) {
						return i;
					}
				}
				return -1;
			} else {
				for (int i = to; i >= from; i--) {
					if (nums[i] == target) {
						return i;
					}
				}
				return -1;
			}
		}
		int pos = (from + to + 1) / 2;
		if (nums[pos] > target) {
			return binarySearch(nums, target, from, pos - 1, findFirst);
		} else if (nums[pos] < target) {
			return binarySearch(nums, target, pos + 1, to, findFirst);
		} else {
			if (findFirst) {
				return binarySearch(nums, target, from, pos, findFirst);
			} else {
				return binarySearch(nums, target, pos, to, findFirst);
			}
		}
	}
}
