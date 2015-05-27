package countandsay;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public String countAndSay(int n) {

		if (n == 1) {
			return "1";
		} else {
			List<Character> src = new LinkedList<Character>() {
				private static final long serialVersionUID = 1L;
				{
					add('1');
				}
			};
			for (int i = 2; i <= n; i++) {
				src = countAndSay(src);
			}
			StringBuilder sb = new StringBuilder();
			for (Character c : src) {
				sb.append(c);
			}
			return sb.toString();
		}
	}

	private List<Character> countAndSay(List<Character> src) {
		List<Character> ret = new LinkedList<Character>();
		Character previous = Character.MIN_VALUE;
		int count = 0;
		Iterator<Character> iter = src.iterator();
		while (iter.hasNext()) {
			Character c = iter.next();
			if (previous == Character.MIN_VALUE) {
				count++;
				previous = c;
			} else if (previous == c) {
				count++;
			} else {
				say(ret, previous, count);
				previous = c;
				count = 1;
			}
		}
		say(ret, previous, count);
		return ret;
	}

	private void say(List<Character> ret, char c, int count) {
		if (count < 10) {
			ret.add(Character.toChars(48 + count)[0]);
		} else {
			for (char s : String.valueOf(count).toCharArray()) {
				ret.add(s);
			}
		}
		ret.add(c);
	}

}
