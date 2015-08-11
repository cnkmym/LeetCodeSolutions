package validanagram;

import java.util.Arrays;

public class Solution {
	public boolean isAnagram(String s, String t) {
		if (s == null && t == null) {
			return true;
		}

		if (s == null || t == null) {
			return false;
		}

		if ("".equals(s) && "".equals(t)) {
			return true;
		}

		char[] srcChars = s.toCharArray();
		char[] targetChars = t.toCharArray();
		if (srcChars.length != targetChars.length) {
			return false;
		}

		Arrays.sort(srcChars);
		Arrays.sort(targetChars);

		int index = 0;
		while (index < srcChars.length) {
			if (srcChars[index] == targetChars[index]) {
				index++;
			} else {
				return false;
			}
		}
		return true;
	}
}
