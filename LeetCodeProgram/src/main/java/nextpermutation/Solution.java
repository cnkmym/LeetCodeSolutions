package nextpermutation;

public class Solution {
	public void nextPermutation(int[] nums) {
		// first , pivot = n-1, check the first reversed order pair from right
		// to left (a[x]
		// and a[pivot])
		// second, if (x>=0) { then it means a[pivot] should be swapped
		// else repeat first step, using a[x] and a[--pivot]
		// swap a[x] and a[pivot]}
		// third, reverse position from a[x+1] to a[n-1]

		if (nums == null || nums.length < 2) {
			return;
		}

		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i - 1] < nums[i]) {
				next(nums, i - 1);
				return;
			}
		}

		reverse(nums, 0);

	}

	private void reverse(int[] nums, int left) {
		int right = nums.length - 1;
		while (left < right) {
			swap(nums, left++, right--);
		}
	}

	private void swap(int[] nums, int left, int right) {
		int tmp = nums[left];
		nums[left] = nums[right];
		nums[right] = tmp;
	}

	private void next(int[] nums, int from) {
		int index = nums.length - 1;
		while (index > from && nums[index] <= nums[from]) {
			index--;
		}
		swap(nums, from, index);
		reverse(nums, from + 1);
	}
}
