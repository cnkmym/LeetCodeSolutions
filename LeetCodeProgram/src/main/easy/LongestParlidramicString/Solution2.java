package LongestParlidramicString;

public class Solution2 {
	// The number which is same from reading left to right, and from reading
	// right to left

	public String longestPalindrome(String s) {
		String maxS = (s.length() > 0) ? String.valueOf(s.charAt(0)) : "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j >= 0; j--) {
				if (j - i + 1 <= maxS.length()) {
					break;
				}
				int left = i;
				int right = j;
				while (left <= right && s.charAt(left) == s.charAt(right)) {
					left++;
					right--;
				}
				if (left > right) {
					String tmp = s.substring(i, j + 1);
					if (tmp.length() > maxS.length()) {
						maxS = tmp;
					}
				}
			}
		}

		return maxS;
	}

}