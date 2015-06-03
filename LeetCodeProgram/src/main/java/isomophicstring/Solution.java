package isomophicstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isIsomorphic(String s, String t) {
		if (s == null || s.equals("")) {
			// assume s and t has same length
			return true;
		}
		char[] dataS = s.toCharArray();
		char[] dataT = t.toCharArray();
		Map<Character, Character> mapping = new HashMap<Character, Character>();
		Map<Character, Character> reverseMapping = new HashMap<Character, Character>();
		for (int i = 0; i < dataS.length; i++) {
			char a = dataS[i];
			char b = dataT[i];
			if (mapping.containsKey(a)) {
				if (mapping.get(a).equals(b)) {
					continue;
				} else {
					return false;
				}
			} else {
				if (reverseMapping.containsKey(b) && !reverseMapping.get(b).equals(a)) {
					return false;
				}
				mapping.put(a, b);
				reverseMapping.put(b, a);
			}
		}
		return true;
	}

}
