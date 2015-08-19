package triangle;

import java.util.Arrays;
import java.util.List;

public class Solution {
	private int[] minimumPathSum;

	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle == null || triangle.isEmpty()) {
			return 0;
		}
		minimumPathSum = new int[triangle.size()];
		Arrays.fill(minimumPathSum, Integer.MAX_VALUE);
		minimumPathSum[0] = 0;
		for (List<Integer> level : triangle) {
			computeMinPath(level);
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < minimumPathSum.length; i++) {
			min = (min < minimumPathSum[i] ? min : minimumPathSum[i]);
		}
		return min;
	}

	private void computeMinPath(List<Integer> level) {
		int index = 0;
		int previous = 0;
		for (int i : level) {
			int takeRightPath = (minimumPathSum[index] == Integer.MAX_VALUE ? Integer.MAX_VALUE
					: i + minimumPathSum[index]);
			int takeLeftPath = Integer.MAX_VALUE;
			if (index > 0) {
				takeLeftPath = minimumPathSum[index - 1] + i;
				minimumPathSum[index - 1] = previous;
			}
			previous = Math.min(takeLeftPath, takeRightPath);
			index++;
		}
		minimumPathSum[index - 1] = previous;
	}
}