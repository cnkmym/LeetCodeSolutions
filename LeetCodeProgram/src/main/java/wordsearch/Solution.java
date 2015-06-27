package wordsearch;

public class Solution {
	private int height;
	private int width;

	public boolean exist(char[][] board, String word) {
		if (board == null || board.length == 0) {
			return false;
		}
		height = board.length;
		width = board[0].length;
		char[] chars = word.toCharArray();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (findWord(board, i, j, chars, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean findWord(char[][] board, int startRow, int startColumn, char[] chars, int pos) {
		if (board[startRow][startColumn] != chars[pos]) {
			return false;
		}
		if (pos == chars.length - 1) {
			return true;
		}
		// mark visited
		// visited[startRow][startColumn] = true;
		char tmp = board[startRow][startColumn];
		board[startRow][startColumn] = Character.MIN_VALUE;
		boolean find = false;
		// check and move up
		if (!find && (0 < startRow)) {
			find = findWord(board, startRow - 1, startColumn, chars, pos + 1);
		}
		// check and move right
		if (!find && (startColumn < width - 1)) {
			find = findWord(board, startRow, startColumn + 1, chars, pos + 1);
		}
		// check and move down
		if (!find && (startRow < height - 1)) {
			find = findWord(board, startRow + 1, startColumn, chars, pos + 1);
		}
		// check and move left
		if (!find && (startColumn > 0)) {
			find = findWord(board, startRow, startColumn - 1, chars, pos + 1);
		}

		board[startRow][startColumn] = tmp;

		return find;
	}

}
