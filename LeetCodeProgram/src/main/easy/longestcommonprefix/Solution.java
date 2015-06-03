package longestcommonprefix;

import java.util.Comparator;
import java.util.TreeSet;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		TreeSet<String> sorted = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for (String s : strs) {
			sorted.add(s);
		}
		String first = sorted.first();
		String last = sorted.last();
		int start = 0;
		int end = 0;
		while (end < first.length() && end < last.length() && first.charAt(end) == last.charAt(end)) {
			end++;
		}
		return first.substring(start, end);
	}
}
