package combinationsum;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution2 {
	private List<List<Integer>> ret;

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		ret = new LinkedList<List<Integer>>();
		if (candidates.length == 0 || target == 0) {
			// border condition check
			return ret;
		}
		Arrays.sort(candidates);
		Stack<Integer> current = new Stack<Integer>();
		sum(candidates, candidates.length - 1, target, current);
		return ret;
	}

	private void sum(int[] candidates, int lastIndex, int target, Stack<Integer> current) {
		if (target == 0) {
			// finish condition
			print(current);
			return;
		} else if (target > 0 && lastIndex < 0) {
			// no solution
			return;
		}

		if (candidates[lastIndex] <= target) {
			// use current number
			current.push(candidates[lastIndex]);
			sum(candidates, lastIndex - 1, target - candidates[lastIndex], current);
			current.pop();
		}

		// skip current number
		int step = 1;
		while (lastIndex >= step && candidates[lastIndex - step] == candidates[lastIndex]) {
			step++;
		}
		sum(candidates, lastIndex - step, target, current);
	}

	private void print(Stack<Integer> current) {
		List<Integer> list = Arrays.asList(current.toArray(new Integer[current.size()]));
		Collections.reverse(list);
		ret.add(list);
	}
}
