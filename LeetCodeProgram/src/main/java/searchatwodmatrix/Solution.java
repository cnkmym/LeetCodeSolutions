package searchatwodmatrix;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		// check extreme conditions
		int rowCount = matrix.length;
		if (rowCount == 0) {
			return false;
		}
		int columnCount = matrix[0].length;
		if (columnCount == 0) {
			return false;
		}
		if (matrix[rowCount - 1][columnCount - 1] < target) {
			return false;
		} else if (matrix[0][0] > target) {
			return false;
		}
		// first find row
		int[] data = new int[rowCount];
		for (int i = 0; i < rowCount; i++) {
			data[i] = matrix[i][0];
		}
		int selectedRow = binarySearch(data, target);
		// second find column
		data = new int[columnCount];
		for (int i = 0; i < columnCount; i++) {
			data[i] = matrix[selectedRow][i];
		}
		int selectedColumn = binarySearch(data, target);

		return matrix[selectedRow][selectedColumn] == target;
	}

	private int binarySearch(int[] data, int target) {
		return binarySearch(data, target, 0, data.length - 1);
	}

	private int binarySearch(int[] data, int target, int left, int right) {
		if (right - left < 3) {
			for (int i = right; i >= left; i--) {
				if (data[i] <= target) {
					return i;
				}
			}
			return left;
		}

		int middle = (left + right) / 2;
		if (data[middle] == target) {
			return middle;
		} else if (data[middle] > target) {
			return binarySearch(data, target, left, middle - 1);
		} else {
			return binarySearch(data, target, middle, right);
		}
	}
}
