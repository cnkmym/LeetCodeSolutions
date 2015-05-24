package LongestParlidramicString;

public class Solution3 {
	// The number which is same from reading left to right, and from reading
	// right to left
	private boolean[][] judge = new boolean[1000][1000];

	public String longestPalindrome(String s) {
		int length = s.length();
		int maxLength = 1;
		int start = 0;

		for (int i = 0; i < length; i++) {
			judge[i][i] = true;
		}
		for (int i = 0; i < length - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				judge[i][i + 1] = true;
				start = i;
				maxLength = 2;
			}
		}
		for (int k = 3; k < length; k++) {
			for (int i = 0; i < length - k + 1; i++) {
				if (s.charAt(i) == s.charAt(i + k - 1) && judge[i + 1][i + k - 2]) {
					judge[i][i + k - 1] = true;
					start = i;
					maxLength = k;
				}
			}
		}

		return s.substring(start, start + maxLength);
	}

}