package threesum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
	private List<List<Integer>> ret;
	private Set<String> visited;

	public List<List<Integer>> threeSum(int[] nums) {
		// initialization
		Arrays.sort(nums);
		// record each values' position
		int maxNegativePos = -1;
		int minPositivePos = nums.length;
		Set<Integer> values = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			values.add(nums[i]);
			if (nums[i] < 0) {
				maxNegativePos = i;
			} else if (nums[i] > 0 && minPositivePos == nums.length) {
				minPositivePos = i;
			}
		}

		// prepare return value
		ret = new LinkedList<List<Integer>>();
		visited = new HashSet<String>();
		if (maxNegativePos == nums.length - 1) {
			// no valid solution
			return ret;
		} else if (minPositivePos == 0) {
			// no valid solution
			return ret;
		}

		if (minPositivePos - maxNegativePos > 3) {
			// pure 0 solution
			ret.add(build(0, 0, 0));
		}
		if (minPositivePos - maxNegativePos > 1) {
			// use 0 as middle pivot number
			int i = minPositivePos;
			while (i < nums.length) {
				int vRight = nums[i];
				int vLeft = 0 - vRight;
				if (values.contains(vLeft) && !visited.contains(print(vLeft, 0, vRight))) {
					ret.add(build(vLeft, 0, vRight));
					visited.add(print(vLeft, 0, vRight));
				}
				do {
					i++;
				} while (i <= nums.length - 1 && nums[i] == vRight);
			}
		}

		// first use positive number as middle pivot
		int i = minPositivePos;
		while (i < nums.length - 1) {
			int vRight = 0;
			int vLeft = 0;
			for (int j = i + 1; j < nums.length; j++) {
				vRight = nums[j];
				vLeft = 0 - nums[i] - vRight;
				if (values.contains(vLeft) && !visited.contains(print(vLeft, nums[i], vRight))) {
					ret.add(build(vLeft, nums[i], vRight));
					visited.add(print(vLeft, nums[i], vRight));
				}
				while (j < nums.length - 1 && nums[j + 1] == vRight) {
					j++;
				}
			}
			do {
				i++;
			} while (i <= nums.length - 1 && nums[i] == vRight);
		}
		// then use negative number as middle pivot
		i = maxNegativePos;
		while (i > 0) {
			int vRight = 0;
			int vLeft = 0;
			for (int j = i - 1; j >= 0; j--) {
				vLeft = nums[j];
				vRight = 0 - nums[i] - vLeft;
				if (values.contains(vRight) && !visited.contains(print(vLeft, nums[i], vRight))) {
					ret.add(build(vLeft, nums[i], vRight));
					visited.add(print(vLeft, nums[i], vRight));
				}
				while (j > 0 && nums[j - 1] == vLeft) {
					j--;
				}
			}
			do {
				i--;
			} while (i >= 0 && nums[i] == vLeft);
		}
		return ret;
	}

	private List<Integer> build(int a, int b, int c) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		return list;
	}

	private String print(int a, int b, int c) {
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.append(",");
		sb.append(b);
		sb.append(",");
		sb.append(c);
		return sb.toString();
	}
}
