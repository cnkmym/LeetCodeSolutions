package excelsheetcolumntitle;

import java.util.Stack;

public class Solution {
	StringBuilder sb;
	Stack<Integer> numbers;

	public String convertToTitle(int n) {
		if (n == 0) {
			return "";
		}
		numbers = new Stack<Integer>();
		do {
			int remain = n % 26;
			n = n / 26;
			if (remain == 0) {
				numbers.push(26);
				n = n - 1;
			} else {
				numbers.push(remain);
			}
		} while (n > 0);

		sb = new StringBuilder();
		while (!numbers.isEmpty()) {
			sb.append(convert(numbers.pop()));
		}
		return sb.toString();
	}

	private String convert(int number) {
		Character c = (char) ('A' + number - 1);
		return String.valueOf(c);
	}

}
