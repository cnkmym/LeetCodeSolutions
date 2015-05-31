package excelsheetcolumnnumber;

public class Solution {
	public int titleToNumber(String s) {
		if (s == null || s.equals("")) {
			return 0;
		}
		int count = 0;
		char[] chars = s.toCharArray();
		for (char c : chars) {
			int value = (c - 'A' + 1);
			count = count * 26 + value;
		}
		return count;
	}
}
