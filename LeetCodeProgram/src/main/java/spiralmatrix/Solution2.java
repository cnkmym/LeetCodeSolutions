package spiralmatrix;

public class Solution2 {
	private int[][] matrix;

	public int[][] generateMatrix(int n) {
		matrix = new int[n][n];
		if (n > 0) {
			fill(matrix, 0, 0, n - 1, n - 1, 1);
		}
		return matrix;
	}

	private void fill(int[][] matrix, int s_x, int s_y, int e_x, int e_y, int startValue) {
		if (s_x > e_x || s_y > e_y) {
			return;
		}
		if (s_x == e_x) {
			// single row
			for (int i = s_y; i <= e_y; i++) {
				matrix[s_x][i] = startValue++;
			}
		} else if (s_y == e_y) {
			// single column
			for (int i = s_x; i <= e_x; i++) {
				matrix[i][s_y] = startValue++;
			}
		} else {
			// up
			for (int i = s_y; i < e_y; i++) {
				matrix[s_x][i] = startValue++;
			}
			// right
			for (int i = s_x; i < e_x; i++) {
				matrix[i][e_y] = startValue++;
			}
			// down
			for (int i = e_y; i > s_y; i--) {
				matrix[e_x][i] = startValue++;
			}
			// left
			for (int i = e_x; i > s_x; i--) {
				matrix[i][s_y] = startValue++;
			}

			fill(matrix, s_x + 1, s_y + 1, e_x - 1, e_y - 1, startValue);
		}
	}
}
