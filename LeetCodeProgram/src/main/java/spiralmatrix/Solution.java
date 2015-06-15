package spiralmatrix;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	private List<Integer> ret;

	private List<Integer> compute(int[][] matrix, int startRow, int startCol, int endRow, int endCol) {
		List<Integer> tmp = new LinkedList<Integer>();
		if (startRow > endRow || startCol > endCol) {
			return tmp;
		}
		if (startRow == endRow) {
			for (int i = startCol; i <= endCol; i++) {
				tmp.add(matrix[startRow][i]);
			}
			return tmp;
		}
		if (startCol == endCol) {
			for (int i = startRow; i <= endRow; i++) {
				tmp.add(matrix[i][startCol]);
			}
			return tmp;
		}
		printUpBorder(tmp, matrix, startRow, startCol, endCol);
		printRightBorder(tmp, matrix, endCol, startRow, endRow);
		printDownBorder(tmp, matrix, endRow, endCol, startCol);
		printLeftBorder(tmp, matrix, startCol, endRow, startRow);
		tmp.addAll(compute(matrix, startRow + 1, startCol + 1, endRow - 1, endCol - 1));
		return tmp;
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return Collections.emptyList();
		}
		int maxRow = matrix.length - 1;
		int maxCol = matrix[0].length - 1;

		ret = compute(matrix, 0, 0, maxRow, maxCol);
		return ret;
	}

	private void printUpBorder(List<Integer> ret, int[][] matrix, int row, int fromCol, int toCol) {
		for (int i = fromCol; i <= toCol; i++) {
			ret.add(matrix[row][i]);
		}
	}

	private void printRightBorder(List<Integer> ret, int[][] matrix, int col, int fromRow, int toRow) {
		for (int i = fromRow + 1; i < toRow; i++) {
			ret.add(matrix[i][col]);
		}
	}

	private void printDownBorder(List<Integer> ret, int[][] matrix, int row, int fromCol, int toCol) {
		for (int i = fromCol; i > toCol; i--) {
			ret.add(matrix[row][i]);
		}
	}

	private void printLeftBorder(List<Integer> ret, int[][] matrix, int col, int fromRow, int toRow) {
		for (int i = fromRow; i > toRow; i--) {
			ret.add(matrix[i][col]);
		}
	}

}
