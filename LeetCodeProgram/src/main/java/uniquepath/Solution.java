package uniquepath;

public class Solution {
	int[][] numOfPaths;

	public int uniquePaths(int m, int n) {
		numOfPaths = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++) {
			numOfPaths[i][1] = 1;
		}
		for (int i = 1; i <= n; i++) {
			numOfPaths[1][i] = 1;
		}

		if (m == 1 || n == 1) {
			return numOfPaths[m][n];
		}

		return compute(m, n - 1)// left cell
				+ compute(m - 1, n);// upper cell;
	}

	private int compute(int m, int n) {
		int sum = 0;
		if (numOfPaths[m][n] > 0 || m == 0 || n == 0) {
			return numOfPaths[m][n];
		}
		if (m > 1) {
			sum += compute(m - 1, n);// upper cell
		}
		if (n > 1) {
			sum += compute(m, n - 1);// left cell
		}
		numOfPaths[m][n] = sum;
		return sum;
	}
}
