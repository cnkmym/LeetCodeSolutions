package simplifypath;

import java.util.Stack;

public class Solution {
	int index = 0;
	int length = 0;
	Stack<String> directories;

	public String simplifyPath(String path) {
		char[] chars = path.toCharArray();
		length = path.length();
		directories = new Stack<String>();
		StringBuilder substring = new StringBuilder();
		for (int i = 0; i < length; i++) {
			if (chars[i] == '.') {
				// do nothing
			} else if (chars[i] == '/') {
				if (i > 2) {
					if (chars[i - 2] == '.' && chars[i - 1] == '.') {
						// "../" type
						if (!directories.isEmpty()) {
							directories.pop();
						}
						continue;
					}
				}
				if (i > 1) {
					if (chars[i - 1] == '.') {
						// "./" type
						continue;
					} else if (chars[i - 1] == '/') {
						// "//" type
						continue;
					}
				}
				if (substring.length() > 0) {
					directories.push(substring.toString());
				}
				substring = new StringBuilder();
				substring.append(chars[i]);
			} else {
				substring.append(chars[i]);
			}
		}

		String remain = substring.toString();
		if (!remain.equals("/")) {
			directories.push(substring.toString());
		}

		return join();

	}

	private String join() {
		Stack<String> forPrint = new Stack<String>();
		while (!directories.isEmpty()) {
			forPrint.push(directories.pop());
		}
		StringBuilder sb = new StringBuilder();
		if (forPrint.isEmpty() || !forPrint.peek().startsWith("/")) {
			sb.append("/");
		}
		while (!forPrint.isEmpty()) {
			sb.append(forPrint.pop());
		}
		return sb.toString();
	}
}
