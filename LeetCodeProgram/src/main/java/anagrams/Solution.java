package anagrams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	private Map<String, List<String>> anagrams;

	public List<String> anagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return Collections.emptyList();
		}
		anagrams = new HashMap<String, List<String>>();
		for (String str : strs) {
			String key = computeKey(str);
			if (!anagrams.containsKey(key)) {
				anagrams.put(key, new LinkedList<String>());
			}
			List<String> list = anagrams.get(key);
			list.add(str);
		}

		List<String> result = new LinkedList<String>();
		for (Map.Entry<String, List<String>> entry : anagrams.entrySet()) {
			List<String> list = entry.getValue();
			if (list.size() == 1) {
				continue;
			} else {
				result.addAll(list);
			}
		}
		return result;
	}

	private String computeKey(String src) {
		char[] chars = src.toCharArray();
		Arrays.sort(chars);
		return String.valueOf(chars);
	}
}
