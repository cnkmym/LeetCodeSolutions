package combinationsum;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {
	private List<List<Integer>> ret;

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		ret = new LinkedList<List<Integer>>();
		if (candidates.length == 0 || target == 0) {
			return ret;
		}
		Arrays.sort(candidates);
		Stack<Integer> current = new Stack<Integer>();
		sum(candidates, candidates.length - 1, target, current);
		return ret;
	}

	private void sum(int[] candidates, int lastIndex, int target, Stack<Integer> current) {
		if (target == 0) {
			print(current);
			return;
		} else if (target > 0 && lastIndex < 0) {
			return;
		}

		// use this candidate again
		if (candidates[lastIndex] <= target) {
			current.push(candidates[lastIndex]);
			sum(candidates, lastIndex, target - candidates[lastIndex], current);
			current.pop();
		}

		// just skip current candidate
		sum(candidates, lastIndex - 1, target, current);
	}

	private void print(Stack<Integer> current) {
		List<Integer> data = Arrays.asList(current.toArray(new Integer[current.size()]));
		Collections.reverse(data);
		ret.add(data);
		// ret.add(current.stream().sorted().collect(Collectors.toList()));
	}
}
