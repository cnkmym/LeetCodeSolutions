package searchinrotatedsortedarray;

public class Solution2 {
	public boolean search(int[] nums, int target) {
		// extreme condition check
		if (nums == null || nums.length == 0) {
			return false;
		}

		int end = findPivot(nums, 0, nums.length - 1);
		if (end < 0) {
			end = nums.length - 1;
		}
		int front = nums[0];
		if (front == target) {
			return true;
		} else if (front > target) {
			return searchLeftToRight(nums, end + 1, nums.length - 1, target) >= 0;
		} else {
			return searchLeftToRight(nums, 1, end, target) >= 0;
		}
	}

	private int findPivot(int[] nums, int left, int right) {
		if (right - left < 3) {
			int start = nums[right];
			for (int i = right - 1; i >= left; i--) {
				if (nums[i] > start) {
					return i;
				}
				start = nums[i];
			}
			return -1;
		}
		int vLeft = nums[left];
		int middle = (left + right) / 2;
		int vMiddle = nums[middle];
		if (vLeft < vMiddle) {
			return findPivot(nums, middle, right);
		} else if (vLeft > vMiddle) {
			return findPivot(nums, left, middle);
		} else {
			int pivot = findPivot(nums, left, middle);
			if (pivot < 0) {
				return findPivot(nums, middle, right);
			} else {
				return pivot;
			}
		}
	}

	private int searchLeftToRight(int[] nums, int left, int right, int target) {
		if (left < 0 || right >= nums.length) {
			return -1;
		}
		if (right - left < 3) {
			for (int i = left; i <= right; i++) {
				if (nums[i] == target) {
					return i;
				}
			}
			return -1;
		}

		int middle = (left + right) / 2;
		int vMiddle = nums[middle];

		if (vMiddle == target) {
			return middle;
		} else if (vMiddle > target) {
			return searchLeftToRight(nums, left, middle - 1, target);
		} else {
			return searchLeftToRight(nums, middle + 1, right, target);
		}
	}
}
