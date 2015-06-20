package minimumpathsum;

public class Solution {
	int[][] minOfPaths;
	int[][] weight;

	public int minPathSum(int[][] grid) {
		this.weight = grid;
		//
		int m = weight.length;
		if (m == 0) {
			return 0;
		}
		//
		int n = weight[0].length;
		if (n == 0) {
			return 0;
		}
		//
		minOfPaths = new int[m][n];
		//
		minOfPaths[0][0] = grid[0][0];
		//
		return findMin(m - 1, n - 1);
	}

	private int findMin(int m, int n) {
		if (m < 0 || n < 0) {
			return 0;
		}

		if (minOfPaths[m][n] > 0 || (m == 0 && n == 0)) {
			return minOfPaths[m][n];
		}

		int sum = Integer.MAX_VALUE;
		if (m > 0) {
			sum = Math.min(sum, findMin(m - 1, n));// upper
		}
		if (n > 0) {
			sum = Math.min(sum, findMin(m, n - 1));// left
		}
		minOfPaths[m][n] = sum + weight[m][n];
		return minOfPaths[m][n];
	}
}
