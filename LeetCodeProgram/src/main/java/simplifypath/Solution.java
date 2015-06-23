package simplifypath;

import java.util.Stack;

public class Solution {
	int index = 0;
	int length = 0;
	Stack<String> directories;

	private void append(char[] chars, int i, int lastDirectoryPos) {
		int count = i - lastDirectoryPos;
		if (count <= 1) {
			return;
		}
		String dir = String.valueOf(chars, lastDirectoryPos + 1, Math.min(count, chars.length - lastDirectoryPos-1));
		if (dir.equals("./") || dir.equals(".")) {
			return;
		}
		if (directories.isEmpty()) {
			directories.push("/");
		}
		if (dir.equals("../") || dir.equals("..")) {
			if (directories.size() > 1) {
				directories.pop();
			}
		} else {
			directories.push(dir);
		}
	}

	public String simplifyPath(String path) {
		char[] chars = path.toCharArray();
		length = path.length();
		directories = new Stack<String>();
		directories.push("/");
		int lastDirectoryPos = -1;
		for (int i = 0; i < length; i++) {
			if (chars[i] == '/') {
				append(chars, i, lastDirectoryPos);
				lastDirectoryPos = i;
			}
		}

		append(chars, length, lastDirectoryPos);

		String ret = join();
		while (ret.length() > 1 && ret.charAt(ret.length() - 1) == '/') {
			ret = ret.substring(0, ret.length() - 1);
		}

		return ret;

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
