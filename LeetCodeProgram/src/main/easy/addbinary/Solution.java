package addbinary;

import java.util.Stack;

public class Solution {
	public String addBinary(String a, String b) {
		// naive method
		// first use stack to represent the input values (from back to front)
		// then add them by each digit (from back to front)
		// the sum should be inserted into a stack
		// pay attention to the "Jinwei" issue
		// finally pop each new digit of the sum

		Stack<Integer> aStack = convertToStack(a);
		Stack<Integer> bStack = convertToStack(b);

		Stack<Integer> sum = sum(aStack, bStack);

		return print(sum);
	}

	private String print(Stack<Integer> src) {
		StringBuilder sb = new StringBuilder();
		while (!src.isEmpty()) {
			sb.append(src.pop());
		}
		if (sb.length() == 0) {
			return "0";
		}
		return sb.toString();
	}

	private Stack<Integer> sum(Stack<Integer> a, Stack<Integer> b) {
		Stack<Integer> ret = new Stack<Integer>();
		int remain = 0;
		while (!a.isEmpty() && !b.isEmpty()) {
			int value = a.pop() + b.pop() + remain;
			ret.push(value % 2);
			remain = value / 2;
		}
		while (!a.isEmpty()) {
			int value = a.pop() + remain;
			ret.push(value % 2);
			remain = value / 2;
		}
		while (!b.isEmpty()) {
			int value = b.pop() + remain;
			ret.push(value % 2);
			remain = value / 2;
		}
		if (remain > 0) {
			ret.push(remain);
		}
		return ret;
	}

	private Stack<Integer> convertToStack(String s) {
		char[] chars = s.toCharArray();
		Stack<Integer> ret = new Stack<Integer>();
		for (char c : chars) {
			ret.push(c - 48);
		}
		return ret;
	}
}
