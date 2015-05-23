package LongestParlidramicString;

public class Solution {
	// The number which is same from reading left to right, and from reading
	// right to left
	private String tempSOdd = "";
	private String tempSEven = "";

	public String longestPalindrome(String s) {
		String maxS = "";
		for (int i = 0; i < s.length(); i++) {
			tempSOdd = findTempS(i, s, true);
			if (tempSOdd.length() > maxS.length()) {
				maxS = tempSOdd;
			}

			tempSEven = findTempS(i, s,false);
			if (tempSEven.length() > maxS.length()) {
				maxS = tempSEven;
			}
		}

		return maxS;
	}

	private String findTempS(int pivot, String s, boolean isOdd) {
		int left = pivot;
		int right = pivot + (isOdd ? 0 : 1);
		String ret = "";
		while (left >= 0 && right < s.length()) {
			if (s.charAt(left) == s.charAt(right)) {
				ret = s.substring(left, right + 1);
				left--;
				right++;
			} else {
				break;
			}
		}
		return ret;
	}
}