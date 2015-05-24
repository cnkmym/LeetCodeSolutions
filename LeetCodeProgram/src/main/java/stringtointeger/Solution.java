package stringtointeger;

public class Solution {
	public int myAtoi(String str) {
		// case 1 : all empty
		// case 2 : start with invalid char
		boolean isStarted = false;
		int startPos = str.length();
		int endPos = str.length();
		if (str == null || str.length() == 0) {
			return 0;
		}
		char[] s = str.toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (s[i] == ' ') {
				if (!isStarted) {
					continue;
				} else {
					endPos = i;
					break;
				}
			}
			if (isValidNumber(s[i])) {
				if (!isStarted) {
					isStarted = true;
					startPos = i;
				}
				continue;
			}
			if (isValidChar(i, s[i], str)) {
				isStarted = true;
				startPos = i;
			} else {
				if (!isStarted) {
					return 0;
				} else {
					endPos = i;
					break;
				}
			}
		}

		String valueStr = str.substring(startPos, endPos);
		valueStr = (valueStr.equals("+") || valueStr.equals("-") || valueStr.isEmpty()) ? "0" : valueStr;
		return filterOverflow(Double.valueOf(valueStr));
	}

	private boolean isValidChar(int index, char c, String str) {
		if ((c == '+' || c == '-') && (index == 0 || str.charAt(index - 1) == ' ')) {
			return true;
		}
		return false;
	}

	private boolean isValidNumber(char c) {
		return c >= '0' && c <= '9';
	}

	private int filterOverflow(Double d) {
		if (d > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (d < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return d.intValue();
	}
}
