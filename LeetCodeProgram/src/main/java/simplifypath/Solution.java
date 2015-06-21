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

		while (index < length) {
			if (path.substring(index, Math.min(length, index + 3)).equals("../")) {
				// parent folder
				if (!directories.isEmpty()) {
					if (directories.peek().equals("/")) {
						directories.pop();
					}
					if (!directories.isEmpty()) {
						directories.pop();
					}
				}
				index = index + 3;
				continue;
			} else if (path.substring(index, Math.min(length, index + 2)).equals("./")) {
				// current folder
				index = index + 2;
				continue;
			} else if (path.substring(index, Math.min(length, index + 1)).equals("/")) {
				// new directory
				if (directories.isEmpty() || !directories.peek().equals("/")) {
					directories.push("/");
				} else if (!directories.peek().endsWith("/")) {
					String peek = directories.pop() + "/";
					directories.push(peek);
				}
				index++;
			} else {
				StringBuilder sb = new StringBuilder();
				while (index < length) {
					if (chars[index] != '.' && chars[index] != '/') {
						sb.append(chars[index]);
					} else {
						break;
					}
					index++;
				}
				if (sb.length() > 0) {
					if (directories.isEmpty()) {
						directories.push("/");
					}
					directories.push(sb.toString());
				}
			}
		}

		while (true) {
			if (directories.isEmpty()) {
				directories.push("/");
				continue;
			} else if (directories.size() == 1 && directories.peek().equals("/")) {
				break;
			} else if (directories.peek().equals("/")) {
				directories.pop();
			} else {
				break;
			}
		}

		return join();
	}

	private String join() {
		Stack<String> forPrint = new Stack<String>();
		while (!directories.isEmpty()) {
			forPrint.push(directories.pop());
		}
		StringBuilder sb = new StringBuilder();
		while (!forPrint.isEmpty()) {
			sb.append(forPrint.pop());
		}
		return sb.toString();
	}
}
