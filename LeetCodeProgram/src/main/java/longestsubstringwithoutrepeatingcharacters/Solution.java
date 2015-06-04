package longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || "".equals(s)) {
			return 0;
		}

		char[] chars = s.toCharArray();
		Map<Character, Integer> visited = new HashMap<Character, Integer>();
		int longest = 0;
		int index = -1;
		for (int i = 0; i < chars.length; i++) {
			if (visited.containsKey(chars[i])) {
				// ideal length
				int length1 = i - visited.get(chars[i]);
				// practical length
				int length2 = i - index;
				if (length1 < length2) {
					// b..b..a...a || b..a..b..a
					index = visited.get(chars[i]);
					longest = Math.max(longest, length1);
				} else {
					// a .b..b..a
					// index = index;
					longest = Math.max(longest, length2);
				}
			} else {
				visited.put(chars[i], i);
				longest = Math.max(longest, i - index);
			}
			visited.put(chars[i], i);
		}

		return longest;
	}
}
