package validparentheses;

import java.util.Stack;

public class Solution {
	Stack<Character> stacks;

	public boolean isValid(String s) {
		// naive solution
		// just use the stack to implement
		stacks = new Stack<Character>();
		char[] data = s.toCharArray();
		for (char c : data) {
			char top = Character.MIN_VALUE;
			if (!stacks.isEmpty()) {
				top = stacks.peek();
			}
			if (newLevel(top, c)) {
				stacks.push(c);
			} else if (match(top, c)) {
				stacks.pop();
			} else {
				return false;
			}
		}
		return stacks.isEmpty();
	}

	private boolean newLevel(char current, char _new) {
		// ignore the order of bracket
		if (_new == '(') {
			return true;
		}
		if (_new == '[') {
			return true;
		}
		if (_new == '{') {
			return true;
		}
		return false;
	}

	private boolean match(char _old, char _new) {
		if (_old == '(' && _new == ')') {
			return true;
		}
		if (_old == '[' && _new == ']') {
			return true;
		}
		if (_old == '{' && _new == '}') {
			return true;
		}
		return false;
	}
}
