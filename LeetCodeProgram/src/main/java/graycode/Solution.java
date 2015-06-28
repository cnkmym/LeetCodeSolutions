package graycode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	private List<Integer> numbers;

	private void compute(int n) {
		List<Integer> newPart = new ArrayList<Integer>();
		int step = (int) Math.pow(2, n - 1);
		for (int i = numbers.size() - 1; i >= 0; i--) {
			newPart.add(numbers.get(i) + step);
		}
		numbers.addAll(newPart);
	}

	public List<Integer> grayCode(int n) {
		numbers = new LinkedList<Integer>();
		if (n < 0) {
			return numbers;
		}

		numbers.add(0);
		if (n == 0) {
			return numbers;
		}

		for (int i = 1; i <= n; i++) {
			compute(i);
		}

		return numbers;
	}
}
