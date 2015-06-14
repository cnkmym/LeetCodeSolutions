package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	private List<List<Integer>> result;

	public List<List<Integer>> permute(int[] nums) {
		result = new LinkedList<List<Integer>>();
		if (nums == null || nums.length == 0) {
			return result;
		}

		Arrays.sort(nums);
		compute(nums, 0);
		return result;
	}

	private void add(int[] nums) {
		List<Integer> list = new ArrayList<Integer>(nums.length);
		for (int i : nums) {
			list.add(i);
		}
		result.add(list);
	}

	private void compute(int[] nums, int from) {
		if (from >= nums.length - 1) {
			add(nums);
			return;
		}
		int swapPos = from;
		int previous = nums[from] - 1;//just make sure previous does not equal to current value;
		while (swapPos < nums.length) {
			while (swapPos < nums.length && nums[swapPos] == previous) {
				swapPos++;
			}
			if (swapPos <= nums.length - 1) {
				swap(nums, from, swapPos);
				compute(nums, from + 1);
				swap(nums, from, swapPos);
				previous = nums[swapPos];
			}
		}
	}

	private void swap(int[] nums, int left, int right) {
		int tmp = nums[left];
		nums[left] = nums[right];
		nums[right] = tmp;
	}
}
