package lengthoflastword;

public class Solution {
	public int lengthOfLastWord(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		int startPos = 0;
		int endPos = -1;
		boolean skipMode = true;
		boolean isSpace = true;
		char[] chars = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			isSpace = (chars[i] == ' ');
			if (isSpace) {
				if (skipMode) {
					// meet space which can be ignored
				} else {
					// meet space after word
					endPos = i-1;
					skipMode = true;
				}
				continue;
			} else {
				if (skipMode) {
					// meet first non-space word after space
					startPos = i;
					skipMode = false;
				} else {
					// meet consecutive non-space word
				}
				endPos = i;
			}
		}
		return endPos - startPos + 1;
	}
}
