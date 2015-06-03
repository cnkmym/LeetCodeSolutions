package removeelement;

public class Solution {
	private int tail;

	public int removeElement(int[] nums, int val) {
		tail = nums.length - 1;
		// extreme condition
		if (tail < 0) {
			return 0;
		}
		// naive algorithm
		// use tail element to replace current element if value matches
		for (int i = 0; tail >= 0 && i <= tail; i++) {
			if (nums[i] == val) {
				nums[i--] = nums[tail--];
			}
		}
		return tail + 1;
	}
}
