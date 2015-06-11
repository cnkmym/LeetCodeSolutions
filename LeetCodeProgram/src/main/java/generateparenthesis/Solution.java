package generateparenthesis;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	private char[] chars;
	private List<String> ret;

	public List<String> generateParenthesis(int n) {
		ret = new LinkedList<String>();
		if (n == 0) {
			return ret;
		}
		chars = new char[n * 2];
		fill(chars, 0, n, n);
		return ret;
	}

	private void fill(char[] chars, int index, int leftP, int rightP) {
		if (chars.length - index <= rightP) {
			for (int i = index; i < chars.length; i++) {
				chars[i] = ')';
			}
			ret.add(String.valueOf(chars));
		} else {
			if (leftP > 0) {
				chars[index] = '(';
				fill(chars, index + 1, leftP - 1, rightP);
			}
			if (rightP > leftP) {
				chars[index] = ')';
				fill(chars, index + 1, leftP, rightP - 1);
			}
		}
	}
}
