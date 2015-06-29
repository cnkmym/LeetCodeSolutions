package decodeways;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	private Map<Integer, Integer> count;

	public int numDecodings(String s) {
		count = new HashMap<Integer, Integer>();
		char[] chars = s.toCharArray();
		if (!valid(chars)) {
			return 0;
		}
		return countWays(chars, 0);
	}

	private boolean valid(char[] chars) {
		if (chars.length == 0) {
			return false;
		}
		for (int i = 0; i < chars.length; i++) {
			if ('0' > chars[i] || '9' < chars[i]) {
				return false;
			}
			if ('0' == chars[i]) {
				if (i == 0) {
					return false;
				}
				if ('1' > chars[i - 1] || '2' < chars[i - 1]) {
					return false;
				}
			}
		}
		return true;
	}

	private int countWays(char[] chars, int from) {
		if (count.containsKey(from)) {
			return count.get(from);
		}
		if (from >= chars.length) {
			return 1;
		}
		char c = chars[from];
		int ways = 0;
		if ('0' == c) {
			// only be part of other code
			ways = 0;
		} else if ('1' == c) {
			// possible to have two ways
			if (from < chars.length - 1) {
				ways += countWays(chars, from + 2);
			}
			if (from == chars.length - 1 || chars[from + 1] != '0') {
				ways += countWays(chars, from + 1);
			}
		} else if ('2' == c) {
			// possible to have two ways
			if (from < chars.length - 1 && chars[from + 1] <= '6') {
				ways += countWays(chars, from + 2);
			}
			if (from == chars.length - 1 || chars[from + 1] != '0') {
				ways += countWays(chars, from + 1);
			}
		} else {
			ways = countWays(chars, from + 1);
		}
		count.put(from, ways);
		return ways;
	}
}
