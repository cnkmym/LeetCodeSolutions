package setmatrixzeros;

import java.util.Arrays;

public class Solution {
	public void setZeroes(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return;
		}
		boolean currentColumnHasZero = false;
		boolean previousColumnHasZero = false;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				currentColumnHasZero = true;
				break;
			}
		}

		for (int col = 1; col < matrix[0].length; col++) {
			previousColumnHasZero = currentColumnHasZero;
			currentColumnHasZero = false;
			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][col] == 0) {
					// set all cells in this row (left to current pos) to zero
					for (int i = 0; i < col; i++) {
						matrix[row][i] = 0;
					}
					currentColumnHasZero = true;
				} else if (matrix[row][col - 1] == 0) {
					// left cell is 0 (which means the value should be
					// broadcasted to right cells)
					matrix[row][col] = 0;
				}
				// finally, update left cell, just check if there is any
				// original cell value equals to 0
				if (previousColumnHasZero == true) {
					matrix[row][col - 1] = 0;
				}
			}
		}

		if (currentColumnHasZero) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][matrix[0].length - 1] = 0;
			}
		}
	}
}
