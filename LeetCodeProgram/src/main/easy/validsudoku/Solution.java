package validsudoku;

import java.util.Arrays;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			// row check
			if (!validCheck(new char[] { board[i][0], board[i][1], board[i][2], board[i][3], board[i][4], board[i][5],
					board[i][6], board[i][7], board[i][8] })) {
				return false;
			}
			// column check
			if (!validCheck(new char[] { board[0][i], board[1][i], board[2][i], board[3][i], board[4][i], board[5][i],
					board[6][i], board[7][i], board[8][i] })) {
				return false;
			}
		}
		// subboxes check
		for (int i = 0; i < 9; i = i + 3) {
			for (int j = 0; j < 9; j = j + 3) {
				if (!validCheck(new char[] { board[i][j], board[i][j + 1], board[i][j + 2], board[i + 1][j],
						board[i + 1][j + 1], board[i + 1][j + 2], board[i + 2][j], board[i + 2][j + 1],
						board[i + 2][j + 2] })) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean validCheck(char[] cell) {
		boolean[] flag = new boolean[cell.length + 1];
		Arrays.fill(flag, false);
		for (int i = 0; i < cell.length; i++) {
			if (cell[i] == '.') {
				continue;
			}
			int index = cell[i] - '0';
			if (flag[index] == false) {
				flag[index] = true;
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
