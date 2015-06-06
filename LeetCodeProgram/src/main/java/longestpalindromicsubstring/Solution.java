package longestpalindromicsubstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

	public String longestPalindrome(String s) {
		if (s == null || "".equals(s)) {
			return "";
		}

		int maxLength = 1;
		int maxLeft = 0;
		int maxRight = 0;
		int current = -1;

		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (current < 0) {
				current = i;
				continue;
			}
			while (i < chars.length && chars[current] == chars[i]) {
				i++;
			}
			int left = current - 1;
			int right = i;
			while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
				left--;
				right++;
			}
			if (right - left - 1 > maxLength) {
				maxLength = right - left - 1;
				maxLeft = left + 1;
				maxRight = right - 1;
			}
			current = i;
		}

		return String.valueOf(Arrays.copyOfRange(chars, maxLeft, maxRight + 1));

	}

}
