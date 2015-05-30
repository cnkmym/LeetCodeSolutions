package validpalindrome;

public class Solution {
	public boolean isPalindrome(String s) {
		if (s == null || "".equals(s)) {
			return true;
		}
		char[] chars = s.toCharArray();
		int leftIndex = 0;
		int rightIndex = s.length() - 1;
		while (leftIndex < rightIndex) {
			while (leftIndex < rightIndex && !isValidChar(chars[leftIndex])) {
				leftIndex++;
			}
			while (leftIndex < rightIndex && !isValidChar(chars[rightIndex])) {
				rightIndex--;
			}
			if (leftIndex < rightIndex) {
				if (!isSame(chars[leftIndex++], chars[rightIndex--])) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean isSame(Character a, Character b) {
		if ('0' <= a && '9' >= a && a.equals(b)) {
			return true;
		}

		Character newA = Character.toLowerCase(a);
		Character newB = Character.toLowerCase(b);
		return (newA.equals(newB));
	}

	private boolean isValidChar(Character c) {
		if ('0' <= c && '9' >= c) {
			return true;
		}

		if ('a' <= c && 'z' >= c) {
			return true;
		}

		if ('A' <= c && 'Z' >= c) {
			return true;
		}

		return false;
	}
}
