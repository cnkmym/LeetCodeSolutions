package uniquepath;

public class Solution2 {
	int[][] numOfPaths;
	int[][] obstacleGrid;

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		if (m == 0) {
			return 0;
		}
		int n = obstacleGrid[0].length;
		if (n == 0) {
			return 0;
		}

		numOfPaths = new int[m][n];
		boolean hasObstacle = false;
		for (int i = 0; i < m; i++) {
			if (obstacleGrid[i][0] == 1) {
				hasObstacle = true;
			}
			numOfPaths[i][0] = (hasObstacle) ? 0 : 1;
		}
		hasObstacle = false;
		for (int i = 0; i < n; i++) {
			if (obstacleGrid[0][i] == 1) {
				hasObstacle = true;
			}
			numOfPaths[0][i] = (hasObstacle) ? 0 : 1;
		}

		this.obstacleGrid = obstacleGrid;
		if (m == 1 || n == 1) {
			return numOfPaths[m - 1][n - 1];
		}

		if (obstacleGrid[m - 1][n - 1] == 1) {
			return 0;
		}

		return compute(m - 1, n - 2)// left cell
				+ compute(m - 2, n - 1);// upper cell;
	}

	private int compute(int m, int n) {
		int sum = 0;
		if (m < 0 || n < 0) {
			return 0;
		}
		if (obstacleGrid[m][n] == 1) {
			return 0;
		}
		if (numOfPaths[m][n] > 0 || m == 0 || n == 0) {
			return numOfPaths[m][n];
		}
		if (m > 0) {
			sum += compute(m - 1, n);// upper cell
		}
		if (n > 0) {
			sum += compute(m, n - 1);// left cell
		}
		numOfPaths[m][n] = sum;
		return sum;
	}
}
