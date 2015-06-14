package rotateimage;

public class Solution {
	public void rotate(int[][] matrix) {
		if (matrix == null || matrix.length <= 1) {
			return;
		}
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - i-1; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
				matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
				matrix[j][n - i - 1] = tmp;
			}
		}
		// clockwise 90
		// a[i,j] -> a[j,(n-i)]
		// a[j,n-i] -> a[n-i,n-j]
		// a[n-i,n-j] -> a[n-j,i]
		// a[n-j,i] -> a[i,j]

	}
}
