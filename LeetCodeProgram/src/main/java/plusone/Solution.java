package plusone;

import java.util.Stack;

public class Solution {
	public int[] plusOne(int[] digits) {
		// naive method
		// use stack to represent each digit
		// then plus 1 to the last digit
		// then check each other digit to see if they also need to plus one
		// (back to front)
		// then output the result from front to back

		Stack<Integer> numberStack = convertToStack(digits);
		Stack<Integer> result = plusOne(numberStack);
		int[] ret = convertToArray(result);

		return ret;
	}

	private Stack<Integer> convertToStack(int[] src) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i : src) {
			s.push(i);
		}
		return s;
	}

	private int[] convertToArray(Stack<Integer> src) {
		int[] ret = new int[src.size()];
		int index = 0;
		while (!src.isEmpty()) {
			ret[index++] = src.pop();
		}
		return ret;
	}

	private Stack<Integer> plusOne(Stack<Integer> src) {
		Stack<Integer> stack = new Stack<Integer>();
		int num = 1;
		while (!src.isEmpty()) {
			int result = src.pop() + num;
			num = 0;
			if (result >= 10) {
				num = result / 10;
				stack.push(result % 10);
			} else {
				stack.push(result);
			}
		}
		if (num > 0) {
			stack.add(num);
		}
		return stack;
	}
}
